/**
 * @author rtv
 */
public interface Player {

    /**
     * @return Name to be displayed for player
     */
    public String name();

    /**
     * Respond to a turn with the next turn. The initial turn will receive a
     * null Mark object. Assume the method will only receive a legal move.
     * Returning an illegal move will cause the game to end in a loss.
     * @param prevMarkMadeByOpponent coordinates of the last mark made
     * @return the next mark to make
     */
    public Mark doTurn(Mark prevMarkMadeByOpponent);

}
