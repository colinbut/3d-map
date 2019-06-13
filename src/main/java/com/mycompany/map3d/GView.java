/*
 * |-------------------------------------------------
 * | Copyright © 2009 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.map3d;

import javax.swing.*;
import java.awt.*;

/**
 * The drawing board for drawing shapes and objects on screen in Java.
 * @author Colin
 *
 */
public class GView extends JPanel implements Runnable{
	
	private static final long serialVersionUID = 1L;
	private Drawing3D myDrawing;
	//Double buffering techniques..
	private Image offScreenBuffer = null;
	private Graphics offScreenGraphics;
	private Dimension d, oldD;
private Thread thr;
	/**
	 * Constructor
	 */
	public GView(){
		setBackground(Color.white); //Default background color
		myDrawing = new Drawing3D();
		thr = new Thread(this);
	}
	
	/*
	 * Sets the drawing...
	 */
	public void setDrawing(Drawing3D drawing){
		myDrawing = drawing;
	}
	
	/**
	 * Enabling to change background colour.
	 * @param c The colour
	 */
	public void changeBackground(Color c){
		setBackground(c);
	}
	
	/*
	 * (non-Javadoc)
	 * @see javax.swing.JComponent#paintComponent(java.awt.Graphics)
	 */
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.GREEN);
		myDrawing.draw(g);
	}
	
	public void startAnim(){
		thr.start();
	}
	
	public void run(){
		try{
			//for(;;){//infinite loop when called
			while(true){	
			    render(); 
				Thread.sleep(20);
			}
		}
		catch(Exception e){
			e.getMessage();
		}
	}

	
	/*
	 * Renders the Animation...   ?
	 */
	public void render(){
		//Get the graphics object 1st
		Graphics g = getGraphics();
		d = getSize();
		
		if(offScreenBuffer == null || oldD.width != d.width ||
				oldD.height != d.height){
			oldD = d;
			
			offScreenBuffer = createImage(d.width, d.height);
			offScreenGraphics = offScreenBuffer.getGraphics();
		}
		else{
			offScreenGraphics.setColor(Color.WHITE);
			offScreenGraphics.fillRect(0, 0, d.width, d.height);
			offScreenGraphics.setColor(Color.GREEN);
			myDrawing.draw(offScreenGraphics);
		}
		
		try{
			if((g != null)){
				g.drawImage(offScreenBuffer, 0, 0, this);
				Toolkit.getDefaultToolkit().sync();
				g.dispose();
			}
		}
		catch(Exception ev){
			ev.printStackTrace();
		}
	}

}
