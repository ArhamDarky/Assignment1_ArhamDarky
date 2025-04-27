//--------------------------------------------
// Assignment 1
// Written by: Arham Darky Student ID: 2186561
// For SE350 Section 602 - Spring 2025
//--------------------------------------------

/** This code represents a named matrix made up of only 0s and 1s.
* It also extends Matrix and checks input values during construction. **/

public class Shape extends Matrix {
    private String name;

    public Shape(String name, int[][] data) {
        super(data);
        this.name = name;

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                int value = data[i][j];
                if (value != 0 && value != 1) {
                    throw new IllegalArgumentException("SHape can Only haeve 0 or 1s.");
                }
            }
        }
    }

    public String getName() {
        return name;
    }
}
