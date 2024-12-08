package design_interview_problems.design_tic_tac_toe_game.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Board {
    public int size;
    public PlayingPiece[][] board;

    public Board(int size) {
        this.size = size;
        board = new PlayingPiece[size][size];
    }

    public boolean addPiece(int row, int column, PlayingPiece playingPiece) {
        if (row >= size || column >= size || row < 0 || column < 0) {
            return false;
        }
        if (board[row][column] != null) {
            return false;
        }
        board[row][column] = playingPiece;
        return true;
    }

    public List<List<Integer>> getFreeCells() {
        List<List<Integer>> freeCells = new ArrayList<>();
        for (int row = 0; row < size; row++) {
            for (int column = 0; column < size; column++) {
                if (board[row][column] == null) {
                    List<Integer> rowColumn = List.of(row, column);
                    freeCells.add(rowColumn);
                }
            }
        }
        return freeCells;
    }

    public void printBoard() {
        for (int row = 0; row < size; row++) {
            for (int column = 0; column < size; column++) {
                if (board[row][column] != null) {
                    System.out.print(board[row][column].pieceType.name() + "  ");
                } else {
                    System.out.print("   ");
                }
                if (column != size - 1) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
        }
    }
}
