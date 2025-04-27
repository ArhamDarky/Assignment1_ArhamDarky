//--------------------------------------------
// Assignment 1
// Written by: Arham Darky Student ID: 2186561
// For SE350 Section 602 - Spring 2025
//--------------------------------------------

/**
 * Extends MatrixOutlinePrinter to print matrices containing only 0s and 1s.
 */
public class BoolMatrixPrinter extends MatrixOutlinePrinter{

    @Override
    protected String printRow(Matrix matrix, int row) {
        StringBuilder rowString = new StringBuilder();
        int[][] data = matrix.getData();

        for (int col = 0; col < matrix.getNumCols(); col++) {
            int value = data[row][col];

            /** Check if the value is only 0 or 1 **/
            if (value != 0 && value != 1) {
                throw new IllegalArgumentException("Matrix can only contain 0s and 1s.");
            }

            /** Print # for 1, space for 0 **/
            if (value == 1) {
                rowString.append("#");
            } else {
                rowString.append(" ");
            }
        }
        return rowString.toString();
    }
}
