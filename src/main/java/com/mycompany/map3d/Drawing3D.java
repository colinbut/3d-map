/*
 * |-------------------------------------------------
 * | Copyright © 2009 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.map3d;

import java.util.*;
import java.awt.*;

/**
 * @author Colin
 *
 */
public class Drawing3D extends Shape3D{
	
	private ArrayList<Shape3D> shapes;
	
	/**
	 * Constructor
	 */
	public Drawing3D(){
		super(0,0,0);
		shapes = new ArrayList<Shape3D>();
	}
	
	/**
	 * returns a shape. By default returns the first shape in list.
	 * Note: This method is never used..
	 * @return
	 */
	public Shape3D getShape(){
		return shapes.get(0);
	}
	
	/**
	 * Adds the shape to the list of shapes in the drawing. 
	 * @param shape
	 */
	public void addShape(Shape3D shape){
		shapes.add(shape);
	}
	
	/**
	 * Tell every shape to draw itself
	 */
	public void draw(Graphics g){
		for(Shape3D shape : shapes){
			shape.draw(g);
		}
	}
	
	/*
	 * (non-Javadoc)
	 * @see Shape3D#transform(Transformation3D)
	 */
	public void transform(Transformation3D trans){
		for(Shape3D shape : shapes){
			shape.transform(trans);
		}
	}
	
	/**
	 * 
	 */
	public String toString(){
		String temp;
		String shapes2D = "";
		for(Shape3D shape : shapes){
			shapes2D = shape.toString() + "\n" + shape.toString() + "\n";
		}
		temp = "Drawing2D(\n" + shapes2D + "\n" + ")endDrawing2D";
		return temp;
	}

}
