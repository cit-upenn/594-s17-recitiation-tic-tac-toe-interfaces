/**
 * @author rtv
 */
public interface Game {

    void init(Player p1, Player p2);

    void play();

    String getWinner();

}
