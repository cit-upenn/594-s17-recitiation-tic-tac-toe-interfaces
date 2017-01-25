/**
 * @author rtv
 */
public class DumbPlayer implements Player {

    private final String name;
    private Strategizer strategizer;

    public DumbPlayer(String name, Strategizer strategizer) {
        this.name = name;
        this.strategizer = strategizer;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public Mark doTurn(Mark prevMarkMadeByOpponent) {

        boolean valid = board.markOpponentMove(prevMarkMadeByOpponent.getX(),
                prevMarkMadeByOpponent.getY());

        if (valid) {



        }

        if

        return ;
    }
}
