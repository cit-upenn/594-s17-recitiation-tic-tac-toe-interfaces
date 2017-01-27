public class Main {

    public static void main(String[] args) {

        TicTacToeGame game = new TicTacToeGame();

        Player p1 = new RandomPlayer("one");
        Player p2 = new RandomPlayer("two");

        game.init(p1, p2);

        try {
            game.play();
        } catch (PlayerOneIllegalTurnException e) {
            System.out.println("p1 illegal");
        } catch (PlayerTwoIllegalTurnException e) {
            System.out.println("p2 illegal");
        }

        System.out.println("Winner? " + game.hasWinner());
        System.out.println(game.printResult());

    }
}
