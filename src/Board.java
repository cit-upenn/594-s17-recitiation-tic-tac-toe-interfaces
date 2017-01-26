/**
 * @author rtv
 */
public class Board {

    private int[][] board;
    private int marksMade = 0;

    public Board(int row, int col) {
        board = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                board[i][j] = 0;
            }
        }

    }

    public boolean markMyMove(int x, int y) {
        if (board[x][y] == 0 || board[x][y] == -1) {
            return false;
        } else {
            board[x][y] = '1';
            marksMade++;
            return true;
        }
    }

    public boolean markOpponentMove(int x, int y) {
        if (board[x][y] == 0 || board[x][y] == 1) {
            return false;
        } else {
            board[x][y] = -1;
            marksMade++;
            return true;
        }
    }

    public int at(int x, int y) {
        return board[x][y];
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
