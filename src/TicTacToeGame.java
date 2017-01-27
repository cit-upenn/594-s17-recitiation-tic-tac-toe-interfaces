import java.util.Scanner;

/**
 * @author rtv
 */
public class TicTacToeGame implements Game {

    private final static int P1_MARK = 1;
    private final static int P2_MARK = -1;

    private Player p1, p2;
    private Board board = new Board(3, 3);

    @Override
    public void init(Player p1, Player p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    @Override
    public Player play() throws PlayerOneIllegalTurnException,
            PlayerTwoIllegalTurnException {

        Mark p1turn, p2turn = null;

        Scanner scan = new Scanner(System.in);
        int row, col;
        while (!board.isFull()) {

            /* Player 1 Turn */
            p1turn = p1.doTurn(p2turn);
            row = p1turn.getRow();
            col = p1turn.getCol();
            if (board.isMarked(row, col))
                throw new PlayerOneIllegalTurnException();
            else
                board.mark(row, col, P1_MARK);

            System.out.println("P1's turn:");
            System.out.println(printResult());

            /* Hit enter to proceed */
            scan.nextLine();

            if (this.hasWinner())
                return p1;

            /* Player 2 Turn */
            p2turn = p2.doTurn(p1turn);
            row = p2turn.getRow();
            col = p2turn.getCol();
            if (board.isMarked(row, col))
                throw new PlayerTwoIllegalTurnException();
            else
                board.mark(row, col, P2_MARK);

            System.out.println("P2's turn:");
            System.out.println(printResult());

            if (this.hasWinner())
                return p2;

            /* Hit enter to proceed */
            scan.nextLine();

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
