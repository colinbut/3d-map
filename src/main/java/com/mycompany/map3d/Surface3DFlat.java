/*
 * |-------------------------------------------------
 * | Copyright © 2009 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.map3d;

import java.awt.*;
import java.util.*;
/**
 * @author Colin
 *
 */
public class Surface3DFlat extends GItem3D {

	private Vector<Point3D> points;
	private Point3D point;
	//Projections
	private Transformation3D perspective = new Transformation3D();
	private int viewingDistance = 1000;
	private Transformation3D isometric = new Transformation3D();
	private Transformation3D offset = new Transformation3D();
	//colours
	private float r;
	private float g;
	private float b;
	private Color colour; //actual colour
	
	
	
	/**
	 * Default Constructor?
	 */
	public Surface3DFlat(){
		points = new Vector<Point3D>();
		point = new Point3D(0,0,0);
		perspective.perspectiveProj(viewingDistance);
		isometric.isometric();
		offset.translate(150, 150, 0);
	}
	
	
	/**
	 * 
	 * Sets the colour of this surface
	 * 
	 * @param r RED
	 * @param g GREEN
	 * @param b BLUE
	 */
	public void setColor(float r, float g, float b){
		this.r = r;
		this.g = g;
		this.b = b;
	}
	
	/**
	 * Sets the actual (real) colour of this surface if using setColor(r,g,b)
	 * is not a success.
	 * 
	 * @param c Colour
	 */
	public void setActualColour(Color c){
		colour = c;
	}
	
	/**
	 * 
	 * Adds the points which define the surface
	 */
	public void addPoints(float x, float y, float z){
		points.add(new Point3D(x,y,z));
	}
	
	/**
	 * Gets the centre position of the surface
	 * 
	 * @return centroid
	 */
	public Point3D getCentroid(){
		Point3D centroid = new Point3D(0,0,0);
		for(Point3D point : points){
			centroid.setX(centroid.getX() + point.getX());
			centroid.setY(centroid.getY() + point.getY());
			centroid.setZ(centroid.getZ() + point.getZ());
		}
		
		centroid.setX(centroid.getX()/ points.size());
		centroid.setY(centroid.getY()/ points.size());
		centroid.setZ(centroid.getZ()/ points.size());
		
		return centroid;
	}
	
	/**
	 * 
	 * DRAWS the surfaces on screen..
	 * 
	 * @param g Graphics Object to draw
	 */
	public void rawDraw(Graphics g){
		int[] xs = new int[points.size()];
		int[] ys = new int[points.size()];
		int h = 0;	
		for(Point3D thePoint : points){
			point.setX(thePoint.getX());
			point.setY(thePoint.getY());
			point.setZ(thePoint.getZ());
			
			point.transform(drawingTransform);
			Matrix tempDraw = new Matrix(4,1,0);
			tempDraw = point.mult(drawingTransform);
			tempDraw.transform(perspective);
			
			int x1 = (int)(tempDraw.getElement(0,0)/(1+(point.getZ()
					/viewingDistance)));
			int y1 = (int)(tempDraw.getElement(1,0)/(1+(point.getZ()
					/viewingDistance)));
			
			xs[h] = x1;
			ys[h] = y1;
			
			h++;
		}
							
		//draw polygon surface
		g.fillPolygon(xs, ys, points.size());
		
	}
	
	/**
	 * Configures the lighting elements.
	 * @return an array of int
	 */
	public int[] lighting(){
		//Diffuse Illumination
		
		float id = 70f;
		float EdRED = r * id;
		float EdGREEN = g * id;
		float EdBLUE = b * id;
		
		//Diffuse from point source
		float is = 200f;
		Point3D directionLight = new Point3D(0,0,0); //Place where light is shone onto
		Point3D lightSource = new Point3D(0,0,-500); //Position of where light is
		
		//need vector of light ray
		directionLight = getCentroid().minus(lightSource);
		directionLight = directionLight.normal();
		
		Point3D lightRay = new Point3D(0,0,0);
		lightRay = lightRay.minus(directionLight);
		
		//we need cosi and that is angle between lightRay & surface normal
		//so use dot product!
		
		float cosi = lightRay.dotProduct(normal());
		
		float EsdRED = r * cosi * is;
		float EsdGREEN = g * cosi * is;
		float EsdBLUE = b * cosi * is;
		
		//Specular Reflection
		
		//1st work out cos(s) by finding S & O because: COS(s) = S.O
		Point3D observer = new Point3D(0,0,-1);
		
		Point3D Ncosi = normal().scalarMultiply(cosi);
		Point3D Q = Ncosi.plus(directionLight);
		Point3D Q2 = Q.scalarMultiply(2);
		Point3D S = Q2.minus(directionLight);
		
		S = S.normal();
		
		//now perform COS(s) = S.O
		float coss = S.dotProduct(observer);
		
		float w = 0.8f; //between 0 and 1 (trial & error)
		float n = 10f; //smooth where 1f is rough
		float Ess = w * (float)Math.pow(coss, n) * is;
		
		//Combine all together..
		int colR = (int) Math.round(EdRED + EsdRED + Ess);;
		int colG = (int) Math.round(EdGREEN + EsdGREEN + Ess);;
		int colB = (int) Math.round(EdBLUE + EsdBLUE + Ess);;
		int col[] = {colR, colG, colB};
		return col;
		
	}
	
	/**
	 * Draw...
	 * 
	 * first check if surface is visible or not? If yes, then draw and give it a colour!
	 * Else - don't draw.. (simple as that :) )
	 * @param g - The graphics object..
	 */
	public void draw(Graphics g){
		if(visible()){
			int[] colour = lighting();
			try{
				g.setColor(new Color(colour[0], colour[1], colour[2]));
			}
			catch(Exception e){
				if(this.colour == Color.RED){
					g.setColor(Color.RED);
				}
				else if(this.colour == Color.BLUE){
					g.setColor(Color.BLUE);
				}
				else if(this.colour == Color.GREEN){
					g.setColor(Color.GREEN);
				}
				else if(this.colour == Color.YELLOW){
					g.setColor(Color.YELLOW);
				}
				else if(this.colour == Color.PINK){
					g.setColor(Color.PINK);
				}
				else{
					g.setColor(Color.DARK_GRAY);
				}
			}
			rawDraw(g); //Now actually draw it..
		}
	}
	
	/*
	 * (non-Javadoc)
	 * @see GItem3D#transform(Transformation3D)
	 */
	public void transform(Transformation3D trans){
		for(Point3D point: points){
			point.transform(trans);
		}
	}
	
	/**
	 * Determines the surface's visibility
	 * If Surface normal's z coordinate is < 0 then
	 * its visible and..
	 * 
	 * return TRUE
	 */
	public boolean visible(){
		return (normal().getZ() < 0);
	}
	
	/**
	 * Returns the normal.. of the surface
	 */
	public Point3D normal(){
		Point3D k = (Point3D)points.get(2).minus((Point3D)points.get(1));
		Point3D j = (Point3D)points.get(0).minus((Point3D)points.get(1));
				
		Point3D result = j.vec(k);
		
		result = result.normal();
		result.setZ(0 - result.getZ());
		return result;
	}
}
