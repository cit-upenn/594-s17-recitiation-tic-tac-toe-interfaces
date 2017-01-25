/**
 * Holds the position of a mark on the tic-tac-toe board.
 * @author rtv
 */
public class Mark {

    private final int x, y;

    public Mark(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
