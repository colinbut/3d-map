/*
 * |-------------------------------------------------
 * | Copyright © 2009 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.map3d;

import java.awt.event.*;
import java.awt.event.KeyEvent;


/**
 * The controller of a MVC architecture...
 * Controls keyboard input.
 * @author Admin
 *
 */
public class GController implements KeyListener {

	private static final long serialVersionUID = 1L;
	private GApplet map;
        //private GMapApplication map;
	private Transformation3D viewPointTranslation;
	private Transformation3D viewPointRotation;
	private Transformation3D viewPointProjection;
	private Transformation3D trans;
	
	/**
	 * Constructor
	 */
	public GController(GApplet m, Transformation3D viewPointProjection){
		map = m;
		trans = new Transformation3D();
		viewPointTranslation = new Transformation3D();
		viewPointRotation = new Transformation3D();
		this.viewPointProjection = viewPointProjection;
	}
	
        /**
	 * Constructor no.2
	 */
	/*public GController(GMapApplication m, Transformation3D viewPointProjection){
		map = m;
		trans = new Transformation3D();
		viewPointTranslation = new Transformation3D();
		viewPointRotation = new Transformation3D();
		this.viewPointProjection = viewPointProjection;
	}*/

	public void keyReleased(KeyEvent evt){}
	public void keyTyped(KeyEvent evt){}
	public void keyPressed(KeyEvent evt){
		int keyCode = evt.getKeyCode();
		doIt(keyCode);
	}
	
	/**
	 * Decide upon which kind of transformation to do..
	 */
	private void doIt(int keyCode){
		switch(keyCode){
		case 37: //left
			  trans.translate(-20, 0, 0);
			  viewPointTranslation.transform(trans);
			  break;
		case 38: //up
			  trans.translate(0, -20, 0);
			  viewPointTranslation.transform(trans);
		      break;
		case 39: //right
			  trans.translate(20, 0, 0);
			  viewPointTranslation.transform(trans);
			  break;
		case 40: //down
			  trans.translate(0, 20, 0);
			  viewPointTranslation.transform(trans);
		      break;
		case 16://away
			viewPointTranslation.transform(map.away());
			break;
		case 84://towards
			viewPointTranslation.transform(map.towards());
			break;
		case 88: //rotate x
			map.getDrawing().transform(map.localRotation('x',6));
		    break;
		case 89: //y rotate
			map.getDrawing().transform(map.localRotation('y',6));
			break;
		case 90: //z rotate
			map.getDrawing().transform(map.localRotation('z',6));
			break;
		case 65: //rotate x (clockwise)
			map.getDrawing().transform(map.localRotation('x',-6));
			break;
		case 66://rotate y (clockwise)
			map.getDrawing().transform(map.localRotation('y',-6));
			break;
		case 67: //rotate z (clockwise)
			map.getDrawing().transform(map.localRotation('z',-6));
			break;
		
		}//end switch
		
		viewPointProjection = viewPointTranslation.mult(viewPointRotation);
		map.getDrawing().setDrawingTransform(viewPointProjection);
	}

	
}
