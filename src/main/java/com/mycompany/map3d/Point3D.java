package com.mycompany.map3d;

/**
 * POINT.
 * 
 * A point is just a Vector..
 * 
 * Therefore vector calculations are done here
 * @author Colin
 *
 */
public class Point3D extends Matrix implements Cloneable {
	
	
	/**
	 * Constructor..
	 * @param x
	 * @param y
	 * @param z
	 */
	public Point3D(float x, float y, float z){
		super(4,1,1);
		setElement(0,0,x);
		setElement(1,0,y);
		setElement(2,0,z);
	}
		
	/**
	 * returns x coordinate of a point.
	 * @return
	 */
	public float getX(){
		return getElement(0,0);
	}
	
	/**
	 * returns y coordinate of a point.
	 * @return
	 */
	public float getY(){
		return getElement(1,0);
	}
	
	/**
	 * returns z coordinate of a point.
	 * @return
	 */
	public float getZ(){
		return getElement(2,0);
	}
	
	/*
	 * Sets x coordinate of point
	 */
	public void setX(float x){
		setElement(0,0,x);
	}
	
	/*
	 * Sets y coordinate of point
	 */
	public void setY(float y){
		setElement(1,0,y);
	}
	
	/*
	 * Sets z coordinate of point
	 */
	public void setZ(float z){
		setElement(2,0,z);
	}
	
	
	
	//**************Vector CalculationS ****************//
	
	public float length(){
		return (float)Math.sqrt(Math.pow(getElement(0,0), 2) +
				Math.pow(getElement(1,0), 2) 
				+ Math.pow(getElement(2,0), 2));
	}
	
	/*
	 * Calculates normal vector of 2 vectors
	 */
	public Point3D normal(){
		Point3D result = new Point3D(0,0,0);
		float size = length();
		
		result.setX(getX()/size);
		result.setY(getY()/size);
		result.setZ(getZ()/size);
		
		return result;
	}
	
	/*
	 * Minus 2 vectors and return the result
	 * 
	 * requires: b != null
	 * modifies: this, such that this point is result of minus
	 * effects: this = this - b and return this
	 */
	public Point3D minus(Point3D b){
		Point3D result = new Point3D(0,0,0);
		result.setX(getX() - b.getX());
		result.setY(getY() - b.getY());
		result.setZ(getZ() - b.getZ());
		return result;
	}
	
	/*
	 * Vector addition
	 */
	public Point3D plus(Point3D b){
		Point3D result = new Point3D(0,0,0);
		result.setX(getX() + b.getX());
		result.setY(getY() + b.getY());
		result.setZ(getZ() + b.getZ());
		return result;
	}
	
	/*
	 * Vector product
	 */
	public Point3D vec(Point3D b){
		Point3D result = new Point3D(0,0,0);
		result.setX((getY() * b.getZ()) - (getZ() * b.getY()));
		result.setY((getZ() * b.getX()) - (getX() * b.getZ()));
		result.setZ((getX() * b.getY()) - (getY() * b.getX()));
		return result;
	}
	
	/*
	 * Dot Product
	 */
	public float dotProduct(Point3D b){
		return ((getX() * b.getX()) + (getY() * b.getY()) +
				 getZ() * b.getZ());
	}
	
	/*
	 * Vector multiply this object
	 */
	public Point3D scalarMultiply(float sf){
		Point3D result = new Point3D(0,0,0);
		result.setX(getX() * sf);
		result.setY(getY() * sf);
		result.setZ(getZ() * sf);
		return result;
	}
	
}//end of Point2D
