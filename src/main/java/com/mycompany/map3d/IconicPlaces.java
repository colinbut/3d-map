package com.mycompany.map3d;

import com.mycompany.map3d.MapData;

import java.awt.Color;

/**
 * Just a class containing info on some noticeable places. 
 * @author Colin
 *
 */
public class IconicPlaces extends MapData {
	
	/**
	 * Constructor..
	 */
	public IconicPlaces(){
		
	}
	

	
	public Shape3D makePark(){
		Shape3D parky = new Shape3D(410,150,-290);
		Surface3DFlat park = new Surface3DFlat();
		park.addPoints(70,30,-190);
		park.addPoints(70,30,-230);
		park.addPoints(110,30,-230);
		park.addPoints(110,30,-190);
		park.setColor(0f,1f,0f);
		park.setActualColour(Color.GREEN);
		parky.addGItems(park);
		return parky;
	}
	
	/**
	 * 
	 * @return
	 */
	public Shape3D StEnoch(){
		Shape3D stEnoch = new Shape3D(410,150,-290);
		
		Surface3DFlat front = new Surface3DFlat();
		front.addPoints(490,100,-570);
		front.addPoints(470,150,-620);
		front.addPoints(580,150,-620);
		front.addPoints(560,100,-570);
		front.setColor(0f, 0.8f, 0.9f);
		front.setActualColour(Color.CYAN);
		stEnoch.addGItems(front);
		
		Surface3DFlat right = new Surface3DFlat();
		right.addPoints(560, 100, -570);
		right.addPoints(580, 150, -620);
		right.addPoints(580, 150, -520);
		right.setColor(0f, 0.8f, 0.9f);
		right.setActualColour(Color.CYAN);
		stEnoch.addGItems(right);
		
		Surface3DFlat left = new Surface3DFlat();
		left.addPoints(490,100,-550);
		left.addPoints(470,150,-500);
		left.addPoints(470,150,-620);
		left.addPoints(490,100,-570);
		left.setColor(0f, 0.8f, 0.9f);
		left.setActualColour(Color.CYAN);
		stEnoch.addGItems(left);
		
		Surface3DFlat back = new Surface3DFlat();
		back.addPoints(560,100,-570);
		back.addPoints(580, 150, -520);
		back.addPoints(470,150,-500);
		back.addPoints(490,100,-570);
		back.setColor(0f, 0.8f, 0.9f);
		back.setActualColour(Color.CYAN);
		stEnoch.addGItems(back);
				
		return stEnoch;
	}
	
	public Shape3D Cinema(){
		Shape3D Cinema = new Shape3D(410,150,-290);
		Point3D P43 = new Point3D(370,70,-10);
		Point3D Q43 = new Point3D(370,70,-50);
		Point3D R43 = new Point3D(410,70,-50);
		Point3D S43 = new Point3D(410,70,-10);
		Point3D A43 = new Point3D(370,0,-10);
		Point3D B43 = new Point3D(370,0,-50);
		Point3D C43 = new Point3D(410,0,-50);
		Point3D D43 = new Point3D(410,0,-10);
		Cinema = makeBuildingShapes(P43,Q43,R43,S43,A43,B43,C43,D43,1f,0.7f,0f,Color.ORANGE);
		return Cinema;
	}
	
	
	
	public Shape3D BuchannanG(){
		Shape3D BuchannanG = new Shape3D(410,150,-290);
		Point3D P = new Point3D(490,70,-50);
		Point3D Q = new Point3D(490,120,-130);
		Point3D R = new Point3D(530,120,-130);
		Point3D S = new Point3D(530,70,-50);
		Point3D A = new Point3D(490,30,-50);
		Point3D B = new Point3D(490,50,-130);
		Point3D C = new Point3D(530,50,-130);
		Point3D D = new Point3D(530,30,-50);
		BuchannanG = makeBuildingShapes(P,Q,R,S,A,B,C,D,1f,0.7f,0f,Color.ORANGE);
		return BuchannanG;
	}
	
	/**
	 * 
	 * @return
	 */
	public Shape3D GeorgeSq(){
		Shape3D sq = new Shape3D(410,150,-290);
		Surface3DFlat s = new Surface3DFlat();
		s.addPoints(530,150,-250);
		s.addPoints(530,150,-290);
		s.addPoints(600,150,-290);
		s.addPoints(600,150,-250);
		s.setColor(0f,1f,0f);
		s.setActualColour(Color.GREEN);
		sq.addGItems(s);
		return sq;
	}

}
