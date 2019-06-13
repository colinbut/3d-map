/*
 * |-------------------------------------------------
 * | Copyright © 2009 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.map3d;

/**
 * Transformation class.
 * @author Colin
 *
 */
public class Transformation3D extends Matrix{

	/*
	 * Constructor..
	 */
	public Transformation3D(){
		super(4,4,0);
		matrix[0][0] = 1;
		matrix[1][1] = 1;
		matrix[2][2] = 1;
		matrix[3][3] = 1;
	}
	
	/*
	 * Alternative Constructor..
	 */
	public Transformation3D(int in_rows, int in_cols, float value){
		super(in_rows, in_cols, value);
	}
	
	/*
	 * Another Constructor..
	 */
    public Transformation3D(float[][] data){
		super(data);
	}
	
    /*
     * (non-Javadoc)
     * @see java.lang.Object#clone()
     */
	public Object clone(){
		Transformation3D myClone = new Transformation3D(matrix);
		return myClone;
	}
	
	//********************Normal Transformations*******************//
	
	/**
	 * Move
	 */
	public void translate(float x, float y, float z){
		matrix[0][3] = x;
		matrix[1][3] = y;
		matrix[2][3] = z;
	}
	
	/*
	 * Rotate around X axis in 3D space	
	 */
	public void rotateX(float angle){
		 matrix[1][1] = (float)Math.cos(angle);
		 matrix[1][2] = (float)Math.sin(angle);
		 matrix[2][1] = -(float) Math.sin(angle);
		 matrix[2][2] = (float) Math.cos(angle);
	}
	
	/*
	 * Rotate around Y axis in 3D space	
	 */
	public void rotateY(float angle){
		 matrix[0][0] = (float)Math.cos(angle);
		 matrix[0][2] = (float)Math.sin(angle);
		 matrix[2][0] = -(float) Math.sin(angle);
		 matrix[2][2] = (float) Math.cos(angle);
	}
	
	/*
	 * Rotate around Z axis in 3D space	
	 */
	public void rotateZ(float angle){
		 matrix[0][0] = (float)Math.cos(angle);
		 matrix[0][1] = (float)Math.sin(angle);
		 matrix[1][0] = -(float) Math.sin(angle);
		 matrix[1][1] = (float) Math.cos(angle);
	}
	
	/**
	 * Change the size of a shape - making it bigger or smaller?
	 * @param xscale
	 * @param yscale
	 * @param zscale
	 */
	public void scale(float xscale, float yscale, float zscale){
		matrix[0][0] = xscale;
		matrix[1][1] = yscale;
		matrix[2][2] = zscale;
	}
	
	//*************Projections*************************//
	
	public void perspectiveProj(int viewDistance){
		matrix[2][2] = 0;
		matrix[3][2] = 1 / viewDistance;
	}
	
	/*
	 * Oblique Projection:
	 * any of the 3! (by providing relevant input parameters)
	 * 
	 * 1) Cavalier
	 * 2) Cabinet
	 * 3) Orthagonal 
	 */
	public void obliqueProj(float lamda, float angle){
		 matrix[0][2] =  lamda * (float)Math.cos(angle);
		 matrix[1][2] =  lamda * (float)Math.sin(angle);
		 matrix[2][2] = 0;
		 
	}
	
	/*
	 * Isometric view
	 */
	public void isometric(){
		matrix[2][2]= 0;
		matrix[0][0]= (float)Math.sin(Math.toRadians(60));
		matrix[0][2]= -(float)Math.cos(Math.toRadians(60));
		matrix[1][0]= -(float)Math.sin(Math.toRadians(60));
		matrix[1][2]= -(float)Math.cos(Math.toRadians(60));
	}
	
	public Transformation3D mult(Matrix b){
		float sum = 0;
		int i,j,k;
		if(rows != b.columns){
			throw new IllegalArgumentException("Error");
		}
		
		Transformation3D result = new Transformation3D(b.rows, columns, 0);
		
		for(i = 0; i < b.rows; i++){
			for(j = 0; j < columns; j++){
				sum = 0;
				for(k = 0; k < rows; k++){
					sum += b.getElement(i, k) * matrix[k][j];
				}
				result.matrix[i][j] = sum;
			}
		}
		return result;
	}
}
