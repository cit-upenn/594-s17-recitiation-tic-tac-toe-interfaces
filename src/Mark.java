/**
 * Holds the position of a mark on the tic-tac-toe board.
 * -> DO NOT MODIFY <-
 * @author rtv
 */
public final class Mark {

    private final int i, j;

    public Mark(int i, int j) throws IllegalArgumentException {
        if (i < 0 || j < 0 || i > 2 || j > 2)
            throw new IllegalArgumentException();
        this.i = i;
        this.j = j;
    }

    public int getRow() {
        return i;
    }

    public int getCol() {
        return j;
    }

    @Override
    public int hashCode() {
        int hash = 17;
        hash = 37 * hash + i;
        hash = 37 * hash + j;
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        Mark other = (Mark) o;
        return other.getRow() == i && other.getCol() == j;
    }
}
