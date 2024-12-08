package design_interview_problems.design_tic_tac_toe_game;

import design_interview_problems.design_tic_tac_toe_game.model.*;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TicTacToeGame {
    Deque<Player> players;
    Board gameBoard;

    public void initializeGame() {
        // creating 2 Players
        players = new LinkedList<>();
        PlayingPieceX crosspiece = new PlayingPieceX();
        Player player1 = new Player("Lalit", crosspiece);

        PlayingPieceO zeroPiece = new PlayingPieceO();
        Player player2 = new Player("Lucky", zeroPiece);

        players.add(player1);
        players.add(player2);

        // initializeBoard
        gameBoard = new Board(3);
    }

    public String startGame() {
        boolean noWinner = true;
        while (noWinner) {
            // take out the player whose turn is and also put the player in the list back
            Player playerTurn = players.removeFirst();
            // get the free space from the board
            gameBoard.printBoard();
            List<List<Integer>> freeSpaces = gameBoard.getFreeCells();
            if (freeSpaces.isEmpty()) {
                noWinner = false;
                continue;
            }
            // read the user input
            System.out.println("Player : " + playerTurn.getName() + ", Enter row, column : ");
            Scanner inputScanner = new Scanner(System.in);
            String s = inputScanner.nextLine();
            String[] values = s.split(",");
            int inputRow = Integer.valueOf(values[0]);
            int inputColumn = Integer.valueOf(values[1]);

            // place the piece
            boolean pieceAddedSuccessfully = gameBoard.addPiece(inputRow, inputColumn, playerTurn.playingPiece);
            if (!pieceAddedSuccessfully) {
                // player can not insert the piece into this cell, player has to choose another cell
                System.out.println("Incorrect Position Chosen, Try Again!");
                players.addFirst(playerTurn);
                continue;
            }
            players.addLast(playerTurn);

            boolean winner = isThereWinner(inputRow, inputColumn, playerTurn.playingPiece.pieceType);
            if (winner) {
                return playerTurn.name;
            }
        }
        return "Game Tie!";
    }

    public boolean isThereWinner(int row, int column, PieceType pieceType) {
        boolean rowMatch = true;
        boolean columnMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;

        // need to check in row
        for (int col = 0; col < gameBoard.size; col++) {
            if (gameBoard.board[row][col] == null || gameBoard.board[row][col].pieceType != pieceType) {
                rowMatch = false;
                break;
            }
        }

        // need to check in column
        for (int rw = 0; rw < gameBoard.size; rw++) {
            if (gameBoard.board[rw][column] == null || gameBoard.board[rw][column].pieceType != pieceType) {
                columnMatch = false;
                break;
            }
        }

        // need to check diagonals
        for (int i = 0, j = 0; i < gameBoard.size; i++, j++) {
            if (gameBoard.board[i][j] == null || gameBoard.board[i][j].pieceType != pieceType) {
                diagonalMatch = false;
                break;
            }
        }

        // need to check anti-diagonals
        for (int i = 0, j = gameBoard.size - 1; i < gameBoard.size; i++, j--) {
            if (gameBoard.board[i][j] == null || gameBoard.board[i][j].pieceType != pieceType) {
                antiDiagonalMatch = false;
                break;
            }
        }
        return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;
    }
}
