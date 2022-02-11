import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeTest {

    @Test

    void createBoard() {
        int rows=3;
        int columns=3;
        int[][] expectedOutput={{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        assertArrayEquals(expectedOutput,TicTacToe.createBoard(rows,columns));


    }



    @Test
    void rowsIn() {
        int rows=3;
        int columns=3;
        int[][] a1={{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        int expectedOutput=3;
        assertEquals(expectedOutput,TicTacToe.rowsIn(a1));
    }

    @Test
    void columnsIn() {
        int rows=3;
        int columns=3;
        int[][] a1={{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        int expectedOutput=3;
        assertEquals(expectedOutput,TicTacToe.columnsIn(a1));
    }

    @Test
    void canPlay() {
        int[][] board={{2,0,5},{1,3,5},{6,7,9}};
        int rows=0;
        int columns=1;
        assertEquals(true,TicTacToe.canPlay(board,rows,columns));
    }

    @Test
    void play() {


    }

    @Test
    void full() {
        int[][] board={{2,3,5},{1,3,5},{6,7,9}};
        assertTrue(TicTacToe.full(board));
        int[][] board2={{2,3,5},{1,0,5},{6,7,9}};
        assertFalse(TicTacToe.full(board2));
        int[][] board3={{0,0,0},{0,0,0},{0,0,0}};
        assertFalse(TicTacToe.full(board3));
    }

    @Test
    void wininRow() {
    }

    @Test
    void wininColumn() {
    }

    @Test
    void winInDiagonalBS() {
    }

    @Test
    void winInDiagonalFS() {
    }

    @Test
    void hint() {
    }
}