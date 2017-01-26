import java.util.ArrayList;

/**
 * @author rtv
 */
public class TicTacToeGame implements Game {

    private Player p1, p2;
    private Board board = new Board(3, 3);

    @Override
    public void init(Player p1, Player p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    @Override
    public Player play() {

        Mark p1turn, p2turn = null;

        while (!board.isFull()) {
            p1turn = p1.doTurn(p2turn);
            if (this.hasWinner())
                return p1;

            p2turn = p2.doTurn(p1turn);
            if (this.hasWinner())
                return p2;
        }

        return null;
    }

    @Override
    public String printResult() {

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board.at(i,j) == 1) {
                    result.append("X ");
                } else if (board.at(i, j) == 0) {
                    result.append("_ ");
                } else {
                    result.append("O ");
                }
            }
            result.append("\n");
        }

        return result.toString();
    }

    @Override
    public boolean hasWinner() {

        /* Check rows + cols */
        for (int i = 0; i < board.rows(); i++) {
            int rowSum = 0;
            int colSum = 0;
            for (int j = 0; j < board.cols(); j++) {
                rowSum += board.at(i, j);
                colSum += board.at(j, i);
            }
            if (Math.abs(rowSum) == 3 || Math.abs(colSum) == 3)
                return true;
        }

        /* Check diagonals */
        int diagSum = board.at(0, 0) + board.at(1, 1) + board.at(2,2);
        int otherDiagSum = board.at(2, 0) + board.at(1, 1) + board.at(0,
                2);

        return (Math.abs(diagSum) == 3) || (Math.abs(otherDiagSum) == 3);
    }

}
