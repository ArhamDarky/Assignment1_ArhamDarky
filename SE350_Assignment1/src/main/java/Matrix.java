//--------------------------------------------
// Assignment 1
// Written by: Arham Darky Student ID: 2186561
// For SE350 Section 602 - Spring 2025
//--------------------------------------------

/** Class that represents a two-dimensional array (matrix) of integers. **/

public class Matrix {

    // Holds 2d array
    private int[][] data;

    // This is the Getter to access the matrix data
    public int[][] getData() {
        return data;
    }

    // Setter for the data
    public void setData(int[][] data) {
        if (data == null || data.length == 0 || data[0].length == 0) {
            throw new IllegalArgumentException("Matrix needs to have 1 row and 1 column.");
        }
    }

    // Returns the number of rows
    public int getNumRows() {
        return data.length;
    }

    // Returns the number of columns
    public int getNumCols() {
        return data[0].length;
    }

    // Constructor: This is going to create a matrix with the rows and columns from earlier.
    public Matrix(int rows, int cols) {
        if (rows <= 0 || cols <= 0) {
            throw new IllegalArgumentException("Matrix needs to have 1 row and 1 column.");
        }
        data = new int[rows][cols];
    }

    // Overloaded Constructor: THis will create a matrix with the 2d array thats already existing.
    public Matrix(int [][] data) {
        if (data == null || data.length == 0 || data[0].length == 0) {
            throw new IllegalArgumentException("Matrix needs to have 1 row and 1 column.");
        }
        this.data = data;
    }
}
