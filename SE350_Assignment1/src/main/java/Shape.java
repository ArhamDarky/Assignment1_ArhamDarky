//--------------------------------------------
// Assignment 1
// Written by: Arham Darky Student ID: 2186561
// For SE350 Section 602 - Spring 2025
//--------------------------------------------

/** This code represents a named matrix made up of only 0s and 1s.
* It also extends Matrix and checks input values during construction. **/

public class Shape extends Matrix {
    private String name;

    /**
     * Creates a new Shape with a given name and matrix data.
     * Validates that the matrix only contains 0s and 1s.
     */
    public Shape(String name, int[][] data) {
        super(data); // Call Matrix constructor to initialize the matrix
        this.name = name;

        /**
         * Validate that every value in the matrix is either 0 or 1
         */
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                int value = data[i][j];
                if (value != 0 && value != 1) {
                    throw new IllegalArgumentException("SHape can Only haeve 0 or 1s.");
                }
            }
        }
    }
    // Returns the name of the shape.
    public String getName() {
        return name;
    }
}
