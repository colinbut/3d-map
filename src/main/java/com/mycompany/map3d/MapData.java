package com.mycompany.map3d;

import java.awt.*;

/**
 * @author Colin
 *
 */
public class MapData {
	
	
	/*
	 * Constructor
	 */
	public MapData(){
		//initialises nothing?
	}
		
	/**
	 * A template for making buildings.
	 * In fact what it does is build Cube!
	 * 
	 * Buildings are cubed shape..
	 *
	 * @return
	 */
	public Shape3D makeBuildingShapes(Point3D p, Point3D q, Point3D r, Point3D s,
			Point3D a, Point3D b, Point3D c, Point3D d, float R,float G,float B,Color C){
		Shape3D cube = new Shape3D(410,150,-290);
		
		Surface3DFlat front = new Surface3DFlat();
		front.addPoints(b.getX(), b.getY(), b.getZ());
		front.addPoints(q.getX(), q.getY(), q.getZ());
		front.addPoints(r.getX(), r.getY(), r.getZ());
		front.addPoints(c.getX(), c.getY(), c.getZ());
		front.setColor(R, G, B);
		front.setActualColour(C);
		cube.addGItems(front);
		
		Surface3DFlat back = new Surface3DFlat();
		back.addPoints(d.getX(), d.getY(), d.getZ());
		back.addPoints(s.getX(), s.getY(), s.getZ());
		back.addPoints(p.getX(), p.getY(), p.getZ());
		back.addPoints(a.getX(), a.getY(), a.getZ());
		back.setColor(R, G, B);
		back.setActualColour(C);
		cube.addGItems(back);
		
		Surface3DFlat left = new Surface3DFlat();
		left.addPoints(a.getX(), a.getY(), a.getZ());
		left.addPoints(p.getX(), p.getY(), p.getZ());
		left.addPoints(q.getX(), q.getY(), q.getZ());
		left.addPoints(b.getX(), b.getY(), b.getZ());
		left.setColor(R, G, B);
		left.setActualColour(C);
		cube.addGItems(left);
		
		Surface3DFlat right = new Surface3DFlat();
		right.addPoints(c.getX(), c.getY(), c.getZ());
		right.addPoints(r.getX(), r.getY(), r.getZ());
		right.addPoints(s.getX(), s.getY(), s.getZ());
		right.addPoints(d.getX(), d.getY(), d.getZ());
		right.setColor(R, G, B);
		right.setActualColour(C);
		cube.addGItems(right);
		
		Surface3DFlat top = new Surface3DFlat();
		top.addPoints(b.getX(), b.getY(), b.getZ());
		top.addPoints(c.getX(), c.getY(), c.getZ());
		top.addPoints(d.getX(), d.getY(), d.getZ());
		top.addPoints(a.getX(), a.getY(), a.getZ());
		top.setColor(R, G, B);
		top.setActualColour(C);
		cube.addGItems(top);
		
		Surface3DFlat bottom = new Surface3DFlat();
		bottom.addPoints(p.getX(), p.getY(), p.getZ());
		bottom.addPoints(s.getX(), s.getY(), s.getZ());
		bottom.addPoints(r.getX(), r.getY(), r.getZ());
		bottom.addPoints(q.getX(), q.getY(), q.getZ());
		bottom.setColor(R, G, B);
		bottom.setActualColour(C);
		cube.addGItems(bottom);
		
		return cube;
		
	}
	
	      

}
