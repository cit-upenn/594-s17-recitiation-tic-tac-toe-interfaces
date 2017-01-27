public class Main {

    public static void main(String[] args) {

        Player p1 = new RandomPlayer("thing1");
        Player p2 = new RandomPlayer("thing2");


        TicTacToeGame game = new TicTacToeGame();
        game.init(p1, p2);

        try {

            Player winner = game.play();
            String winnerName = game.hasWinner() ? winner.name() : "Tie";
            System.out.println("Winner:" + winnerName);
            System.out.println(game.printResult());


        } catch (PlayerOneIllegalTurnException e) {

            System.out.println("Player One Made Illegal Move");

        } catch (PlayerTwoIllegalTurnException e) {

            System.out.println("Player Two Made Illegal Move");

        }

    }
}
