import java.util.Scanner;

/**
 * Contains the logic involved in TicTacToe
 * @author rtv
 */
public class TicTacToeGame implements Game {

    private final static int P1_MARK = 1;
    private final static int P2_MARK = -1;
    private final static int BOARD_LEN = 3;


    private Player p1, p2;
    private Board board = new Board(BOARD_LEN, BOARD_LEN);

    @Override
    public void init(Player p1, Player p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    @Override
    public Player play() throws PlayerOneIllegalTurnException,
            PlayerTwoIllegalTurnException {

        Mark p1turn, p2turn = null;

        /* Console input for stepping through game */
        Scanner cin = new Scanner(System.in);

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

            /* Hit enter in console to proceed */
            cin.nextLine();
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

            /* Hit enter in console to proceed  */
            cin.nextLine();
            if (this.hasWinner())
                return p2;

        }
        return null;
    }

    @Override
    public String printResult() {

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < BOARD_LEN; i++) {
            for (int j = 0; j < BOARD_LEN; j++) {
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

    /**
     * Find the sum of each row, col, and diagonals. If the magnitude of the
     * sum is not BOARD_LEN, there is no three-in-a-row.
     */
    @Override
    public boolean hasWinner() {

        /* Check rows + cols */
        for (int i = 0; i < BOARD_LEN; i++) {
            int rowSum = 0;
            int colSum = 0;
            for (int j = 0; j < BOARD_LEN; j++) {
                rowSum += board.at(i, j);
                colSum += board.at(j, i);
            }
            if (Math.abs(rowSum) == BOARD_LEN|| Math.abs(colSum) == BOARD_LEN)
                return true;
        }

        /* Check diagonals */
        int diagSum = board.at(0, 0) + board.at(1, 1) + board.at(2,2);
        int antiDiagSum = board.at(2, 0) + board.at(1, 1) + board.at(0, 2);

        return (Math.abs(diagSum) == BOARD_LEN) || (Math.abs(antiDiagSum) == BOARD_LEN);
    }

}
