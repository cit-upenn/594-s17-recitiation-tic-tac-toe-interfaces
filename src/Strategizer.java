import java.util.HashSet;
import java.util.Set;

/**
 * @author rtv
 */
public class Strategizer {

    private Board board;
    private Set<Mark> availableMoves;

    public Strategizer(Board board) {
        this.board = board;
        this.availableMoves = new HashSet<>();
        for (int i = 0; i < board.rows(); i++)
            for (int j = 0; j < board.cols(); j++)
                availableMoves.add(new Mark(i, j));
    }

    public Mark nextMove(Mark prevMove) {

    }


}
