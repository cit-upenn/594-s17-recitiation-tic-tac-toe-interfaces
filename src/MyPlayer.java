import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author rtv
 */
public class MyPlayer implements Player {

    private final String name;
    private List<Mark> availableMoves = new ArrayList<>();

    public MyPlayer(String name) {
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
