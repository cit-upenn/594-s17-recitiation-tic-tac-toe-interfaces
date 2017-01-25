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
    public void play() {

        Mark p1turn, p2turn = null;

        while (!board.isFull()) {
            p1turn = p1.doTurn(p2turn);
            p2turn = p2.doTurn(p1turn);
        }


    }

    @Override
    public String getWinner() {
        return null;
    }
}
