/*
 * |-------------------------------------------------
 * | Copyright © 2009 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.map3d;

import java.awt.*;
import java.util.*;
/**
 * A class representing a wireframe surface,
 * 
 * 
 * @author Colin
 *
 */
public class Surface3D extends GItem3D{
	
	private Vector<Line3D> lines;
	
	/*
	 * Constructor...
	 */
	public Surface3D(){
		lines = new Vector<Line3D>();
	}
	
	public void draw(Graphics g){
		if(visible() == true){ //If you can see it (z < 0)
			g.setColor(Color.BLUE);
			rawDraw(g);
		}
	}
	
	public void rawDraw(Graphics g){
		for(Line3D line : lines){
			line.draw(g);
		}
	}

	public void transform(Transformation3D trans){
		for(Line3D line : lines){
			line.transform(trans);
		}
	}
	
	public String toString(){
		String result = new String();
		for(Line3D line : lines){
			result += line;
		}//for i
		return result;
	}
	
	public void addLine(Line3D inLine){
		lines.add(inLine);
	}
	
	public void addLine(float sx, float sy, float sz, float dx, float dy,
			float dz){
		lines.add(new Line3D(sx,sy,sz,dx,dy,dz));
	}
	
	public boolean visible(){
		boolean isVisible = normal().getZ() < 0;
		return isVisible;
	}
	
	
	
	public Point3D normal(){
		//manufacture 2 vectors in plane of surface
		Point3D k = ((Line3D)lines.get(1)).asVector();
		Point3D j = ((Line3D)lines.get(0)).asVector();
		//Take their vector product to get Normal
		Point3D result = k.vec(j);
		//Turn into unit vector (length == 1)
		result = result.normal();
		return result;
		
	}
	
	
}
