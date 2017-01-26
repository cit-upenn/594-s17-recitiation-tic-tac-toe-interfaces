/**
 * @author rtv
 */
public interface Game {

    /**
     * Initializes the game with two players
     */
    void init(Player p1, Player p2);

    /**
     * Runs the game and returns the winning player or null if there isn't
     * one. Throws the appropriate exception if a player makes an illegal
     * move. e.g. Making
     */
    Player play() throws PlayerOneIllegalTurnException, PlayerTwoIllegalTurnException;

    /**
     * Returns true if there is a winner at the end of the game
     */
    boolean hasWinner();

    /**
     * Print an ASCII representation of the final game state
     *  e.g. X O O
     *       O X X
     *       O X O
     */
    String printResult();


}
