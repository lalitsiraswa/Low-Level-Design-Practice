package design_interview_problems.design_tic_tac_toe_game;

public class Client {
    public static void main(String[] args) {
        TicTacToeGame game = new TicTacToeGame();
        game.initializeGame();
        System.out.println("Game Winner Is : " + game.startGame());
    }
}
