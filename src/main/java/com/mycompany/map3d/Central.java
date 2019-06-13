package com.mycompany.map3d;

import java.awt.Color;

/**
 * 
 */

/**
 * @author Colin
 *
 */
public class Central extends MapData{
	
	private Shape3D central;
	private Shape3D central2;
	
	/**
	 * 
	 * Constructor...
	 */
	public Central(){
		central = new Shape3D(410,150,-290);
		central2 = new Shape3D(410,150,-290);
		Central1();
		Central2();
	}
	
	/**
	 * 
	 */
	private void Central1(){
		
		Point3D P = new Point3D(310,150,-390);
		Point3D Q = new Point3D(310,150,-480);
		Point3D R = new Point3D(375,150,-480);
		Point3D S = new Point3D(350,150,-390);
		Point3D A = new Point3D(310,110,-390);
		Point3D B = new Point3D(310,110,-480);
		Point3D C = new Point3D(375,110,-480);
		Point3D D = new Point3D(350,110,-390);
		central = makeBuildingShapes(P,Q,R,S,A,B,C,D,1f,0f,0f,Color.RED);
		
	}
	
	/**
	 * 
	 * 
	 */
	private void Central2(){
		
		Point3D P = new Point3D(310,150,-480);
		Point3D Q = new Point3D(310,150,-620);
		Point3D R = new Point3D(350,150,-620);
		Point3D S = new Point3D(375,150,-480);
		Point3D A = new Point3D(310,110,-480);
		Point3D B = new Point3D(310,110,-620);
		Point3D C = new Point3D(350,110,-620);
		Point3D D = new Point3D(375,110,-480);
		central2 = makeBuildingShapes(P,Q,R,S,A,B,C,D,1f,0f,0f,Color.RED);
		
	}
	
	public Shape3D getShape(){
		return central;
	}
	
	public Shape3D getShape2(){
		return central2;
	}

}
