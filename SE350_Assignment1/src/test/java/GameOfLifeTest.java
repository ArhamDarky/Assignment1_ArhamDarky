//--------------------------------------------
// Assignment 1
// Written by: Arham Darky Student ID: 2186561
// For SE350 Section 602 - Spring 2025
//--------------------------------------------

/** This tests that the GameOfLife board updates correctly after 1 and 10 steps. **/

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class GameOfLifeTest {

    @Test
    public void testBlinkerOneStep() {
        // Set up a 5x5 GameOfLife board
        GameOfLife game = new GameOfLife(5, 5);

        // This creates a Blinker shape (vertical line)
        Shape blinker = new Shape("Blinker", new int[][] {
                {0, 1, 0},
                {0, 1, 0},
                {0, 1, 0}
        });

        // This adds the blinker starting at (1,1)
        game.addShape(blinker, 1, 1);
        game.step();


        // Correction after 1 step
        int[][] expected = {
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0}
        };

        // Checks if the actual board matches the board
        assertArrayEquals(expected, game.getData());
    }

    @Test
    public void testBlinkerTenSteps() {
        // Set up a 5x5 GameOfLife board
        GameOfLife game = new GameOfLife(5, 5);

        // Create a Blinker shape (vertical line)
        Shape blinker = new Shape("Blinker", new int[][] {
                {0, 1, 0},
                {0, 1, 0},
                {0, 1, 0}
        });

        // Add the blinker starting at (1,1)
        game.addShape(blinker, 1, 1);

        // Step the game forward 10 times
        for (int i = 0; i < 10; i++) {
            game.step();
        }


        int[][] expected = {
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0}
        };

        assertArrayEquals(expected, game.getData());
    }
}
