//--------------------------------------------
// Assignment 1
// Written by: Arham Darky Student ID: 2186561
// For SE350 Section 602 - Spring 2025
//--------------------------------------------

/**
 * This tests the MatrixOutlinePrinter and BoolMatrixPrinter classes.
 * Checks things like,
 * If the MatrixOutlinePrinter prints the correct borders and layout.
 * If BoolMatrixPrinter throws an error if the matrix has numbers other than 0 or 1.
 **/

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MatrixPrinterTest {

    @Test
    public void testOutlinePrinterDrawsCorrectBorders() {
        // Create a matrix with 3 rows and 4 columns
        Matrix matrix = new Matrix(3, 4);
        MatrixOutlinePrinter printer = new MatrixOutlinePrinter();

        // Expected output with just borders and spaces
        String expected = ""
                + "+----+\n"
                + "|    |\n"
                + "|    |\n"
                + "|    |\n"
                + "+----+";

        // This makes sure the printer output matches what we expect
        assertEquals(expected, printer.print(matrix));
    }

    @Test
    public void testBoolPrinterThrowsExceptionForInvalidMatrix() {
        // Creates a matrix that has a number other than 0 or 1
        int[][] badData = {
                {0, 2},
                {1, 0}
        };
        Matrix badMatrix = new Matrix(badData);
        BoolMatrixPrinter printer = new BoolMatrixPrinter();

        // Make sure an exception is thrown
        assertThrows(IllegalArgumentException.class, () -> {
            printer.print(badMatrix);
        });
    }

    @Test
    public void testBoolPrinterPrintsCorrectly() {
        // Test 1
        int[][] data1 = {
                {0, 1, 0},
                {1, 0, 1}
        };
        Matrix matrix1 = new Matrix(data1);
        BoolMatrixPrinter printer = new BoolMatrixPrinter();

        String expected1 = ""
                + "+---+\n"
                + "| # |\n"
                + "|# #|\n"
                + "+---+";

        assertEquals(expected1, printer.print(matrix1));

        // Test 2
        int[][] data2 = {
                {1, 1},
                {0, 1}
        };
        Matrix matrix2 = new Matrix(data2);

        String expected2 = ""
                + "+--+\n"
                + "|##|\n"
                + "| #|\n"
                + "+--+";

        assertEquals(expected2, printer.print(matrix2));
    }
}
