/*
 * |-------------------------------------------------
 * | Copyright © 2009 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.map3d;

import javax.swing.*;
/**
 * The main window (JFrame)
 * @author Colin
 *
 */
public class GApplet extends JApplet implements Runnable{

	private static final long serialVersionUID = 1L;
	private GView canvas;
	private Drawing3D drawing;
	private Transformation3D trans;
	//Animation tools
	private long beforeTrans, afterTrans, beforeRender, afterRender;
	private long desiredFrameRate, transTime, renderTime, period;
	private long sleepTime, transformAndRenderTime;
	//Thread tools
	private boolean stop = false;
	//Setting up the drawing transformation for ViewPoint Projection
	private Transformation3D viewpointProjection;
	private Thread thr;
			
	/**
	 * 
	 * Constructor
	 */
	public void init(){
		canvas = new GView();
		trans = new Transformation3D();
		thr = new Thread(this);
		viewpointProjection = new Transformation3D();
		
		//Sharing the drawing transformation
		
		//Start point for camera
		//viewpointTranslation.translate(0, 500, 1000);
		//tell drawing what to use as its drawing transformation
		drawing = new Drawing3D();
		drawing.setDrawingTransform(viewpointProjection);
		
		initComponents(); //Initialises the components.
		thr.start();
		canvas.startAnim();
	}
	
	/**
	 * Initialises the application
	 */
	public void initComponents(){
		drawMap();
		getContentPane().add(canvas);
		trans.translate(0, 0, 600);
		drawing.transform(trans);
		addKeyListener(new GController(this, viewpointProjection));
	}
	
	/**
	 * Draws the map!
	 * It adds the shapes to the system
	 */
	public void drawMap(){
		canvas.setDrawing(drawing);
		IconicPlaces m = new IconicPlaces();
		//Right, now add all shape to system
		drawing.addShape(new Roads().getRoads());
		drawing.addShape(m.Cinema());
		drawing.addShape(m.GeorgeSq());
		drawing.addShape(m.makePark());
		drawing.addShape(new Central().getShape());
		drawing.addShape(new Central().getShape2());
		drawing.addShape(m.StEnoch());
		drawing.addShape(m.BuchannanG());
		
		for(Shape3D shape : new Buildings().getBuildings()){
		     drawing.addShape(shape);
		}
		//Positioning at start
		trans.translate(100, 350, 400);
		trans.transform(localRotation('x', 12));
		trans.transform(localRotation('y', 6));
		drawing.transform(trans);
	}
	
	/**
	 * Moves model towards user
	 */
	public Transformation3D towards(){
		Transformation3D translateZ = new Transformation3D();
		Transformation3D towards = new Transformation3D();
		translateZ.translate(0, 0, -10);
		towards.transform(translateZ);
		return towards;
	}
	
	/**
	 * Moves away from user
	 */
	public Transformation3D away(){
		Transformation3D translateZ = new Transformation3D();
		Transformation3D away = new Transformation3D();
		translateZ.translate(0, 0, 10);
		away.transform(translateZ);
		return away;
	}
	
	
	/**
	 * Local Rotation about an Axis!
	 * Input determines what axis and by how many degrees
	 */
	public Transformation3D localRotation(char type, int degree){
		Shape3D temp = drawing.getShape();
		//get the local origin of the shape
		float dx = temp.x();
		float dy = temp.y();
		float dz = temp.z();
		
		//Initialise the Transformation objects
		Transformation3D transform1 = new Transformation3D();
		Transformation3D spin = new Transformation3D();
		Transformation3D translate1 = new Transformation3D();
		Transformation3D translate2 = new Transformation3D();
		//Perform local rotation
		
		//have a switch case to trigger x,y,z rotates
		translate1.translate(-dx, -dy, -dz);
		double angleInRadians = Math.toRadians(degree);//spin degrees 
		switch(type){
		case 'x': 
			spin.rotateX((float) -(angleInRadians));
			break;
		case 'y':
			spin.rotateY((float) -(angleInRadians));
			break;
		case 'z':
			spin.rotateZ((float) -(angleInRadians));
			break;
		}
		
		translate2.translate(dx, dy, dz);
		
		//Combine the transformations
		transform1.transform(translate1);
		transform1.transform(spin);
		transform1.transform(translate2);
		
		return transform1;
	}
	
	/**
	 * Runs the animation loop
	 */
	public void run(){
	    
		desiredFrameRate = 20;//In frames per second
		period = ((long) 1000.0)/desiredFrameRate;
		
		while(!stop){ //the animation loop
			
			beforeTrans = System.nanoTime();
//            drawing.transform(localRotation('y',6));
//            drawing.transform(localRotation('x',6));
                       
			afterTrans = System.nanoTime();
			
			transTime = afterTrans - beforeTrans;
			
			beforeRender = System.nanoTime();
			//canvas.render();
			afterRender = System.nanoTime();
			renderTime = afterRender - beforeRender;
		
			transformAndRenderTime = transTime/ 100000 + renderTime/ 100000;
			sleepTime = period - (transformAndRenderTime);
			
			if(sleepTime <= 0){
				sleepTime = 5;
			}
			
			try{
			   Thread.sleep(sleepTime);
			}
			catch(Exception e){
				e.printStackTrace();
			}

		}
	}
	
	
	/**
	 * Returns the drawing object associated with this frame window
	 * @return drawing
	 */
	public Drawing3D getDrawing(){
		return drawing;
	}
	
	/**
	 * Returns the initial transformation3D object
	 * @return trans
	 */
	public Transformation3D getTransformation(){
		return trans;
	}

}
