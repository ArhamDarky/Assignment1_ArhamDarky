//--------------------------------------------
// Assignment 1
// Written by: Arham Darky Student ID: 2186561
// For SE350 Section 602 - Spring 2025
//--------------------------------------------

/** This code Represents the Game of Life board.
 * This can add shapes and update the board according to the game rules.
 * **/

public class GameOfLife extends Matrix {

    public GameOfLife(int rows, int cols) {
        super(rows, cols);
    }

    /** Adds a Shape to the board at a given position **/
    public void addShape(Shape shape, int startRow, int startCol) {
        int[][] field = getData();
        int[][] shapeData = shape.getData();

        if (startRow + shapeData.length > getNumRows() || startCol + shapeData[0].length > getNumCols()) {
            throw new IllegalArgumentException("Shape does not fit on the board.");
        }

        for (int i = 0; i < shapeData.length; i++) {
            for (int j = 0; j < shapeData[0].length; j++) {
                field[startRow + i][startCol + j] = shapeData[i][j];
            }
        }
    }

    /** Updates the board based on the Game of Life rules **/
    public void step() {
        int[][] current = getData();
        int[][] next = new int[getNumRows()][getNumCols()];

        for (int row = 0; row < getNumRows(); row++) {
            for (int col = 0; col < getNumCols(); col++) {
                int neighbors = countNeighbors(current, row, col);

                if (current[row][col] == 1) {
                    next[row][col] = (neighbors == 2 || neighbors == 3) ? 1 : 0;
                } else {
                    next[row][col] = (neighbors == 3) ? 1 : 0;
                }
            }
        }

        setData(next); // This updates the board
    }

    /** This counts how many alive neighbors around a cell **/
    private int countNeighbors(int[][] grid, int row, int col) {
        int count = 0;
        int[] dir = {-1, 0, 1};

        for (int dr : dir) {
            for (int dc : dir) {
                if (dr == 0 && dc == 0) continue; /** Skip the cell itself **/
                int r = row + dr, c = col + dc;
                if (r >= 0 && r < getNumRows() && c >= 0 && c < getNumCols()) {
                    count += grid[r][c];
                }
            }
        }
        return count;
    }
}

