//--------------------------------------------
// Assignment 1
// Written by: Arham Darky Student ID: 2186561
// For SE350 Section 602 - Spring 2025
//--------------------------------------------

/** Prints the outline of a Matrix, with borders on the top, bottom, and sides. **/

public class MatrixOutlinePrinter implements MatrixPrinter {

    @Override
    public String print(Matrix matrix) {
        StringBuilder sb = new StringBuilder();
        int rows = matrix.getNumRows();
        int cols = matrix.getNumCols();

        /**  Add the top border **/
        sb.append(printBorder(cols)).append("\n");

        /** Print each row with side borders **/
        for (int i = 0; i < rows; i++) {
            sb.append("|");
            sb.append(printRow(matrix, i));
            sb.append("|\n");
        }

        /** Add the bottom border **/
        sb.append(printBorder(cols));

        return sb.toString();
    }

    /**
     * Creates the content of a row. Default is just spaces.
     **/
    protected String printRow(Matrix matrix, int row) {
        StringBuilder rowString = new StringBuilder();
        for (int i = 0; i < matrix.getNumCols(); i++) {
            rowString.append(" ");
        }
        return rowString.toString();
    }

    /**
     * * Creates a border string based on the number of columns.
     **/
    private String printBorder(int cols) {
        StringBuilder border = new StringBuilder();
        border.append("+");
        for (int i = 0; i < cols; i++) {
            border.append("-");
        }
        border.append("+");
        return border.toString();
    }
}


