/**
 * Holds the position of a mark on the tic-tac-toe board. This is row and
 * column indexed. (0,0) is the top left and (2,2) is the bottom right.
 * -> DON'T MODIFY <-
 * @author rtv
 */
public final class Mark {

    private final int row, col;

    /**
     * @throws IllegalArgumentException when a row or col value is not within
     * the bounds of a tic-tac-toe board. This will cause the player to lose.
     */
    public Mark(int row, int col) throws IllegalArgumentException {
        if (row < 0 || col < 0 || row > 2 || col > 2)
            throw new IllegalArgumentException();
        this.row = row;
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }


    /**
     *
     * Don't worry about everything below. It means two Mark objects with the
     * same row, col value will be considered equal by the `equals` method
     * even though they have different memory addresses. This allows you to
     * use the `contains` method in Sets correctly.
     *
     */

    @Override
    public int hashCode() {
        int hash = 17;
        hash = 37 * hash + row;
        hash = 37 * hash + col;
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        Mark other = (Mark) o;
        return other.getRow() == row && other.getCol() == col;
    }
}
