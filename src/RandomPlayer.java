import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Makes a move at random at any available position
 * @author rtv
 */
public class RandomPlayer implements Player {

    private final String name;
    private List<Mark> availableMoves = new ArrayList<>();

    public RandomPlayer(String name) {
        this.name = name;
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                availableMoves.add(new Mark(i, j));
        Collections.shuffle(availableMoves);
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public Mark doTurn(Mark prevMarkMadeByOpponent) {
        availableMoves.remove(prevMarkMadeByOpponent);
        return availableMoves.remove(availableMoves.size() - 1);
    }
}
