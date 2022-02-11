import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeTest {

    @Test

    void createBoard() {
        int rows=3;
        int columns=3;
        int[][] expectedOutput={{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        assertArrayEquals(expectedOutput,TicTacToe.createBoard(rows,columns));
        int rows1=4;
        int columns1=4;
        int[][] expectedOutput1={{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
        assertArrayEquals(expectedOutput1,TicTacToe.createBoard(rows1,columns1));
        int rows2=4;
        int columns2=3;
        int[][] expectedOutput2={{0, 0, 0}, {0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        assertArrayEquals(expectedOutput2,TicTacToe.createBoard(rows2,columns2));


    }



    @Test
    void rowsIn() {
        int rows=3;
        int columns=3;
        int[][] a1={{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        int expectedOutput=3;
        assertEquals(expectedOutput,TicTacToe.rowsIn(a1));
        int rows1=4;
        int columns1=3;
        int[][] a2={{2, 4, 9}, {1, 2, 6}, {5, 1, 3},{2, 1, 5}};
        int expectedOutput1=4;
        assertEquals(expectedOutput1,TicTacToe.rowsIn(a2));
        int rows2=5;
        int columns2=4;
        int[][] a3={{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
        int expectedOutput2=5;
        assertEquals(expectedOutput2,TicTacToe.rowsIn(a3));
    }

    @Test
    void columnsIn() {
        int rows=3;
        int columns=3;
        int[][] a1={{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        int expectedOutput=3;
        assertEquals(expectedOutput,TicTacToe.columnsIn(a1));
        int rows1=3;
        int columns1=4;
        int[][] a2={{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
        int expectedOutput1=4;
        assertEquals(expectedOutput1,TicTacToe.columnsIn(a2));
        int rows2=4;
        int columns2=5;
        int[][] a3={{24, 6, 0, 2, 3}, {2, 9, 2, 4, 5}, {3, 4, 6, 4, 6}, {8, 12, 2, 6, 5}};
        int expectedOutput2=5;
        assertEquals(expectedOutput2,TicTacToe.columnsIn(a3));
    }

    @Test
    void canPlay() {
        int[][] board={{2,0,5},{1,3,5},{6,7,9}};
        int rows=0;
        int columns=1;
        assertTrue(TicTacToe.canPlay(board, rows, columns));
        int[][] board1={{2,1,5},{1,4,6},{0,0,0}};
        int rows1=0;
        int columns1=1;
        assertFalse(TicTacToe.canPlay(board1, rows1, columns1));
        int[][] board2={{0,0,5},{2,1,0},{0,3,5}};
        int rows2=0;
        int columns2=0;
        int rows3=1;
        int columns3=0;
        assertTrue(TicTacToe.canPlay(board2, rows2, columns2));
        assertFalse(TicTacToe.canPlay(board2, rows3, columns3));
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
        int[][] board={{2,2,2},{1,3,5},{6,7,9}};
        int rows=0;
        int piece=2;
        assertTrue(TicTacToe.winInRow(board,rows,piece));
        int[][] board1={{0,0,0},{5,2,7},{5,7,6}};
        int rows1=0;
        int piece1=2;
        assertFalse(TicTacToe.winInRow(board1,rows1,piece1));
        int[][] board2={{1,0,1},{1,1,1},{6,0,3}};
        int rows2=1;
        int piece2=1;
        assertTrue(TicTacToe.winInRow(board2,rows2,piece2));
    }

    @Test
    void wininColumn() {
        int[][] board={{2,3,5},{2,0,5},{2,7,2}};
        int columns=0;
        int piece=2;
        assertTrue(TicTacToe.winInColumn(board,columns,piece));
        int[][] board1={{1,1,1},{0,1,5},{2,1,2}};
        int columns1=1;
        int piece1=1;
        assertTrue(TicTacToe.winInColumn(board1,columns1,piece1));
        int[][] board2={{1,6,2},{2,4,2},{2,8,1}};
        int columns2=2;
        int piece2=2;
        assertFalse(TicTacToe.winInColumn(board2,columns2,piece2));

    }

    @Test
    void winInDiagonalBS() {
        int[][] board={{2,3,8},{1,2,6},{3,4,2}};
        int piece=2;
        assertTrue(TicTacToe.winInDiagonalBS(board,piece));
    }

    @Test
    void winInDiagonalFS() {
        int[][] board={{4,3,2},{1,2,6},{2,4,1}};
        int piece=2;
        assertTrue(TicTacToe.winInDiagonalBS(board,piece));
    }

    @Test
    void hint() {
    }
}