/*
 * |-------------------------------------------------
 * | Copyright © 2009 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.map3d;

import java.awt.*;
/**
 * Data structure representing a Line in Graphics
 * @author Admin
 *
 */
public class Line3D extends GItem3D{
	
	private Point3D src;
	private Point3D dest;
	private Matrix srcDraw = new Matrix(4,1,0);
	private Matrix destDraw = new Matrix(4,1,0);
	//Projection stuff..
	private Transformation3D perspective = new Transformation3D();
	private int viewingDistance = 1000;
	private Transformation3D isometric = new Transformation3D();
	
	/**
	 * Constructor..
	 *
	 */
	public Line3D(float x1, float y1, float z1, float x2, float y2,float z2){
		src = new Point3D(x1, y1, z1);
		dest = new Point3D(x2, y2, z2);
		perspective.perspectiveProj(viewingDistance);
		isometric.isometric();
	}
	
	/**
	 * Gets the line source point..
	 * @return
	 */
	public Point3D getSrc(){
		return src;
	}
	
	/**
	 * Gets the destination point of a line
	 * @return
	 */
	public Point3D getDest(){
		return dest;
	}
	
	/**
	 * Prints detail about a line.
	 * The start and end point is printed.
	 */
	public void printLine(){
		System.out.println("(" + src.getX() + "," + src.getY() + ")\n" +
				"(" + dest.getX() + "," + dest.getY() + ")");
	}
	
	/**
	 * Draw itself...
	 * All projection calculation is done here while drawing the line.
	 * Alternatively available under Transformation3D.java
	 */
	public void draw(Graphics g){
		srcDraw = src.mult(drawingTransform);
		destDraw = dest.mult(drawingTransform);
		
		float z1 = srcDraw.getElement(2, 0);
		float z2 = destDraw.getElement(2, 0);
		
		srcDraw = srcDraw.mult(perspective);
		destDraw = destDraw.mult(perspective);
		//Calculates the perspective z
		int x1 = (int)(srcDraw.getElement(0, 0)/ (1 + (z1/viewingDistance)));
		int y1 = (int)(srcDraw.getElement(1, 0)/ (1 + (z1/viewingDistance)));
		int x2 = (int)(destDraw.getElement(0, 0)/ (1 + (z2/viewingDistance)));
		int y2 = (int)(destDraw.getElement(1, 0)/ (1 + (z2/viewingDistance)));
		
		g.drawLine(x1, y1, x2, y2);//Okay - DRAW
	}
	
	/**
	 * Transform this shape object..
	 */
	public void transform(Transformation3D trans){
		src.transform(trans);
		dest.transform(trans);
	}
	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString(){
		String temp;
		temp = "Line2D(\n" + "src: " + src.toString() + "\n" + 
		       "dest: " + dest.toString() + "\n" + ")endLine2d";
		return temp;
	}
	
	/**
	 * Returns a vector representation of this line by:
	 * dest values - src values...
	 */
	public Point3D asVector(){
		Point3D result = dest.minus(src);
		return result;
	}

}
