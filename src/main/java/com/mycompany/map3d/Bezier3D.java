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
public class Bezier3D extends GItem3D{
	
	private Vector<Point3D> points;
	private int numberOfPoints;
	private int segments;
	private float interval;
	 
	
	/*
	 * Constructor..
	 */
	public Bezier3D(){
		points = new Vector<Point3D>();
		numberOfPoints = 0;
		segments = 10;
		interval = (float)1/segments;
	}
	
	/*
	 * Add a point to the curve?
	 */
	public void addPoint(float x, float y, float z){
		points.add(new Point3D(x, y, z));
		numberOfPoints++;
	}
	
	public int fact(int x){
		if(x == 0){
			return 1;
		}
		else{
			return (x * fact(x - 1));
		}
	}
	
	public int choice(int n, int i){
		return (fact(n)/ ((fact(i) * fact(n - i))));
		
	}
	
	public float bezier(int i, int n, float t){
		float bint = choice(n, i) * (float)Math.pow(t, i) *
		                (float)Math.pow((1 - t), n - i);
		return bint;
	}
	
	/*
	 * Draws the curve line
	 */
	public void draw(Graphics g){
		//g.setColor(Color.GREEN);
		float xsrc = ((Point3D)points.get(0)).getX();
		float ysrc = ((Point3D)points.get(0)).getY();
		
		for(float t = 0; t <= 1.1; t+= interval){
			float xdest = 0;
			float ydest = 0;
			
			for(int i = 0; i < numberOfPoints; i++){
				float bint = bezier(i, numberOfPoints - 1, t);
				
				xdest += ((Point3D)points.get(i)).getX() * bint;
				ydest += ((Point3D)points.get(i)).getY() * bint;
			}
			
			g.drawLine((int)xsrc, (int)ysrc, (int)xdest, (int)ydest);
			xsrc = xdest;
			ysrc = ydest;
		}
	}
	
	public void transform(Transformation3D trans){
		for(int i = 0; i < numberOfPoints; i++){
			((Point3D)points.get(i)).transform(trans);
		}
	}

}
