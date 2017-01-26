/**
 * Holds the position of a mark on the tic-tac-toe board.
 * -> DO NOT MODIFY <-
 * @author rtv
 */
public final class Mark {

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

    @Override
    public int hashCode() {
        int hash = 17;
        hash = 37 * hash + x;
        hash = 37 * hash + y;
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        Mark other = (Mark) o;
        return other.getX() == x && other.getY() == y;
    }
}
