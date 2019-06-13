/*
 * |-------------------------------------------------
 * | Copyright © 2009 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.map3d;

/**
 * @author cbut
 *
 */
public class Matrix {
	
	public int rows;
	public int columns;
	public float[][] matrix;
	
	/**
	 * Constructor... no.1
	 */
	public Matrix(int rows, int columns, float value){
		this.rows = rows;
		this.columns = columns;
		matrix = new float[rows][columns];
		
		for(int i = 0; i < rows; i++){
			for(int j = 0; j < columns; j++){
				matrix[i][j] = value;
			}//end j
		}//end i
	}
	
	/**
	 * Constructor.. no.2
	 */
	public Matrix(float[][] data){
		rows = data.length;
		columns = data[0].length;
		for(int k = 0; k < rows; k++){
			if(data[k].length != columns){
				throw new IllegalArgumentException("All rows must have same length");
			}
		}
		matrix = data;
	}
	
	/**
	 * Gets the number of rows,
	 * @return
	 */
	public int getRows(){
		return rows;
	}
	
	/**
	 * Gets the column number
	 * @return
	 */
	public int getColumns(){
		return columns;
	}
	
	/**
	 * Returns a specific element in matrix
	 * @param i row
	 * @param j column
	 * @return the element which occupies that space in matrix
	 */
	public float getElement(int i, int j){
		return (matrix[i][j]);
	}
	
	/**
	 * Sets a particular element by specified position
	 * @param i
	 * @param j
	 * @param value
	 */
	public void setElement(int i, int j, float value){
		matrix[i][j] = value;
	}
	
	public Matrix mult(Matrix b){
		float sum = 0;
		int i,j,k;
		if(rows != b.columns){
			throw new IllegalArgumentException("Error");
		}
		
		Matrix result = new Matrix(b.rows, columns, 0);
		
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
	
	public void transform(Matrix b){
		float sum = 0;
		int i,j,k;
		if(rows != b.columns){
			throw new IllegalArgumentException("Error");
		}
		
		float[][] result = new float[b.rows][columns];
		
		for(i = 0; i < b.rows; i++){
			for(j = 0; j < columns; j++){
				sum = 0;
				for(k = 0; k < rows; k++){
					sum += b.getElement(i,k) * matrix[k][j];
				}
				result[i][j] = sum;
			}
		}
		
		matrix = result;
	}

}
