/*
 * |-------------------------------------------------
 * | Copyright © 2009 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.map3d;

import java.awt.*;

/**
 * Abstract class representing all drawable objects:
 *  
 *  - Lines
 *  - Curves
 *  - Points
 *  - Shapes
 *  - Flat Surfaces..
 *  - Etc..
 *  
 * @author Colin
 *
 */
public abstract class GItem3D {
	
	public static Transformation3D drawingTransform = new Transformation3D();
	
	/**
	 * Draw those drawable objects
	 * @param g The Graphics Object
	 */
	public abstract void draw(Graphics g);
		
	public abstract void transform(Transformation3D trans);
	
	public Transformation3D getDrawingTransform(){
		return drawingTransform;
	}
	
	public void setDrawingTransform(Transformation3D trans){
		drawingTransform = trans;
	}
	


}
