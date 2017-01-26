/**
 * @author rtv
 */
public interface Player {

    /**
     * @return Name to be displayed for player
     */
    public String name();

    /**
     * Respond to a turn with a Mark indicating the next move.
     * The initial turn will receive a null Mark object.
     * @param prevMarkMadeByOpponent coordinates of the last mark made
     * @return the next mark to make
     */
    public Mark doTurn(Mark prevMarkMadeByOpponent);

}
