/**
 * @author rtv
 */
public class Board {

    private char[][] board;
    private int marksMade = 0;

    public Board(int row, int col) {
        board = new char[row][col];
    }

    public boolean markMyMove(int x, int y) {
        if (board[x][y] == 'o') {
            return false;
        } else {
            board[x][y] = 'm';
            marksMade++;
            return true;
        }
    }

    public boolean markOpponentMove(int x, int y) {
        if (board[x][y] == 'm') {
            return false;
        } else {
            board[x][y] = 'o';
            marksMade++;
            return true;
        }
    }

    public int rows() {
        return board.length;
    }

    public int cols() {
        return board[0].length;
    }

    public boolean isFull() {

        return marksMade == rows() * cols();


    }

}
