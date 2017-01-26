import java.lang.management.BufferPoolMXBean;
import java.util.HashMap;
import java.util.HashSet;

/**
 * @author rtv
 */
public class MyPlayer implements Player {

    private final String name;

    private HashSet<Mark> availableMoves = new HashSet<>();

    private Board board = new Board(3,3 );

    public MyPlayer(String name) {
        this.name = name;

        this.availableMoves = new HashSet<>();
        for (int i = 0; i < board.rows(); i++)
            for (int j = 0; j < board.cols(); j++)
                availableMoves.add(new Mark(i, j));

    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public Mark doTurn(Mark prevMarkMadeByOpponent) {

        board.mark(prevMarkMadeByOpponent.getRow(), prevMarkMadeByOpponent.getCol(), -1);

        if

        return ;
    }
}
