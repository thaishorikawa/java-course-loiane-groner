package com.javacourse.loiane.lesson33.review;

import java.util.Scanner;

public class TicTacToeTest {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        TicTacToe ticTacToeGame = new TicTacToe();

        System.out.println("Player 1 = X");
        System.out.println("Player 2 = O");

        boolean won = false;
        char sign;
        int row = 0, column = 0;

        while (!won) {
            if (ticTacToeGame.player1Turn()) {
                System.out.println("Player's 1 turn. Choose the row and column (1-3)");
                sign = 'X';
            } else {
                System.out.println("Player's 2 turn. Choose the row and column (1-3)");
                sign = 'O';
            }

            row = value("Row", scan);
            column = value("Column", scan);

            ticTacToeGame.validateMove(row, column, sign);

            ticTacToeGame.displayBoard();

            if (ticTacToeGame.checkWinner('X')) {
                won = true;
                System.out.println("Congratulations, player 1 has won!");
            } else if (ticTacToeGame.checkWinner('O')) {
                won = true;
                System.out.println("Congratulations, player 2 has won!");
            } else if (ticTacToeGame.getMove() > 9) {
                won = true;
                System.out.println("Draw!");
            }
        }
    }

    static int value(String valueType, Scanner scan) {
        int value = 0;
        boolean validValue = false;
        while (!validValue) {
            System.out.println("Enter the " + valueType + " (1, 2 or 3)");
            value = scan.nextInt();
            if (value >= 1 && value <= 3) {
                validValue = true;
            } else {
                System.out.println("Invalid data. Try again.");
            }
        }
        value--;
        return value;
    }
}
