/**
 * @author rtv
 */
public interface Player {

    /**
     * @return Name to be displayed for player
     */
    public String name();

    /**
     *
     * @param prevMarkMadeByOpponent coordinates of the last mark made
     * @return the next mark to make
     */
    public Mark doTurn(Mark prevMarkMadeByOpponent);

}
