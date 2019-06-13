package com.mycompany.map3d; /**
 * 
 */
import java.util.*;
import java.awt.*;
/**
 * @author Admin
 *
 */
public class Shape3D extends GItem3D{
	
	private ArrayList<GItem3D> gItems;
	private Point3D localOrigin;
	
	/*
	 * Constructor..
	 */
	public Shape3D(float x, float y, float z){
		gItems = new ArrayList<GItem3D>();
		localOrigin = new Point3D(x,y,z);
	}
	
	public Shape3D(){
		gItems =  new ArrayList<GItem3D>();
		localOrigin = new Point3D(0,0,0);
	}
	
	/*
	 * Allows adding any type of GItem!
	 * NOTE: GItem are lines, curve lines, wireframe surface and flat surface
	 */
	public void addGItems(GItem3D gitem){
		gItems.add(gitem);
	}
	
	/*
	 * Line expected
	 */
	public void addGItems(float x1, float y1, float z1, float x2, float y2, float z2){
		Line3D line = new Line3D(x1, y1, z1, x2, y2, z2);
		gItems.add(line);
	}
	
	public void addGItems(){
		Surface3DFlat surface = new Surface3DFlat();
		gItems.add(surface);
	}
	
	
	
	public void draw(Graphics g){
		for(GItem3D gitem : gItems){
			gitem.draw(g);
		}
	}
	
	/*
	 * 
	 */
	public float x(){
		return localOrigin.getX();
	}
	
	/*
	 * 
	 */
	public float y(){
		return localOrigin.getY();
	}
	
	/*
	 * 
	 */
	public float z(){
		return localOrigin.getZ();
	}
	
	/*
	 * (non-Javadoc)
	 * @see GItem3D#transform(Transformation3D)
	 */
	public void transform(Transformation3D trans){
		for(GItem3D gitem : gItems){
			gitem.transform(trans);
		}
		localOrigin.transform(trans);
	}
	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString(){
		String temp;
		String gItems3D = "";
		for(GItem3D gitem : gItems){
			gItems3D =  gitem.toString() + "\n" + gitem.toString() + "\n";
		}
		temp = "Shape2D(\n" + gItems3D + "\n" + ")endShape2D";
		return temp;
	}

}
