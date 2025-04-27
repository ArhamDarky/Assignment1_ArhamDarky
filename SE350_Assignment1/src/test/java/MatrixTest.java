//--------------------------------------------
// Assignment 1
// Written by: Arham Darky Student ID: 2186561
// For SE350 Section 602 - Spring 2025
//--------------------------------------------

/** JUnit tests to check that 2 things.
* 1. Matrix constructor throws an error if given invalid sizes or data.
* 2. Methods for getting the number of rows and columns work correctly. **/

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MatrixTest {

    @Test
    public void testConstructorThrowsExceptionWhenInvalid() {
        // Testing invalid rows and columns in code
        assertThrows(IllegalArgumentException.class, () -> new Matrix(0, 5));
        assertThrows(IllegalArgumentException.class, () -> new Matrix(5, 0));

        // Testing null or empty arrays in code
        assertThrows(IllegalArgumentException.class, () -> new Matrix((int[][]) null));
        assertThrows(IllegalArgumentException.class, () -> new Matrix(new int[0][0]));
    }

    @Test
    public void testRowAndColumnCount() {
        // Creating a matrix with 3 rows and then 4 cols
        Matrix m1 = new Matrix(3, 4);
        assertEquals(3, m1.getNumRows());
        assertEquals(4, m1.getNumCols());

        // This creates a matrix from 2x2 array.
        int[][] array = { {1, 2}, {3, 4} };
        Matrix m2 = new Matrix(array);
        assertEquals(2, m2.getNumRows());
        assertEquals(2, m2.getNumCols());
    }
}

