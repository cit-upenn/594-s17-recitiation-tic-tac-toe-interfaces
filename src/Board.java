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

    public void mark(int i, int j, int mark) {
        board[i][j] = mark;
        marksMade++;
    }

    public boolean isMarked(int i, int j) {
        return board[i][j] == 0;
    }

    public int at(int i, int j) {
        return board[i][j];
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
