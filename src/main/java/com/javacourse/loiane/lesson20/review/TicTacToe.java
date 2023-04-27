package com.javacourse.loiane.lesson20.review;

import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        char[][] gameTicTacToe = new char[3][3];

        System.out.println("Player 1 = X");
        System.out.println("Player 2 = 0");

        boolean won = false;
        int move = 1;
        char sign;
        int row = 0, column = 0;

        while (!won) {

            if (move % 2 == 1) {
                System.out.println("Player's 1 turn. Choose the row and column (1-3)");
                sign = 'X';
            } else {
                System.out.println("Player's 2 turn. Choose the row and column (1-3)");
                sign = 'O';
            }

            boolean validRow = false;
            while (!validRow) {
                System.out.println("Enter the row (1, 2 or 3)");
                row = scan.nextInt();
                if (row >= 1 && row <= 3) {
                    validRow = true;
                } else {
                    System.out.println("Invalid input. Try again.");
                }
            }

            boolean validColumn = false;
            while (!validColumn) {
                System.out.println("Enter the column (1, 2 or 3)");
                column = scan.nextInt();
                if (column >= 1 && column <= 3) {
                    validColumn = true;
                } else {
                    System.out.println("Invalid input. Try again.");
                }
            }

            row--;
            column--;
            if (gameTicTacToe[row][column] == 'X' || gameTicTacToe[row][column] == 'O') {
                System.out.println("This position is not available, try again.");
            } else {
                gameTicTacToe[row][column] = sign;
                move++;
            }

            //display board
            for (int i = 0; i < gameTicTacToe.length; i++) {
                for (int j = 0; j < gameTicTacToe[i].length; j++) {
                    System.out.print(gameTicTacToe[i][j] + " | ");
                }
                System.out.println();
            }

            //check if there's a winner
            if ((gameTicTacToe[0][0] == 'X' && gameTicTacToe[0][1] == 'X' && gameTicTacToe[0][2] == 'X') ||     //row 1
                    (gameTicTacToe[1][0] == 'X' && gameTicTacToe[1][1] == 'X' && gameTicTacToe[1][2] == 'X') || //row 2
                    (gameTicTacToe[2][0] == 'X' && gameTicTacToe[2][1] == 'X' && gameTicTacToe[2][2] == 'X') || //row 3
                    (gameTicTacToe[0][0] == 'X' && gameTicTacToe[1][0] == 'X' && gameTicTacToe[2][0] == 'X') ||
                    (gameTicTacToe[0][1] == 'X' && gameTicTacToe[1][1] == 'X' && gameTicTacToe[2][1] == 'X') ||
                    (gameTicTacToe[0][2] == 'X' && gameTicTacToe[1][2] == 'X' && gameTicTacToe[2][2] == 'X') ||
                    (gameTicTacToe[0][0] == 'X' && gameTicTacToe[1][1] == 'X' && gameTicTacToe[2][2] == 'X') ||
                    (gameTicTacToe[2][0] == 'X' && gameTicTacToe[1][1] == 'X' && gameTicTacToe[0][2] == 'X')) {
                won = true;
                System.out.println("Congratulations, Player 1 has won!");
            } else if ((gameTicTacToe[0][0] == 'O' && gameTicTacToe[0][1] == 'O' && gameTicTacToe[0][2] == 'O') ||     //row 1
                    (gameTicTacToe[1][0] == 'O' && gameTicTacToe[1][1] == 'O' && gameTicTacToe[1][2] == 'O') || //row 2
                    (gameTicTacToe[2][0] == 'O' && gameTicTacToe[2][1] == 'O' && gameTicTacToe[2][2] == 'O') || //row 3
                    (gameTicTacToe[0][0] == 'O' && gameTicTacToe[1][0] == 'O' && gameTicTacToe[2][0] == 'O') ||
                    (gameTicTacToe[0][1] == 'O' && gameTicTacToe[1][1] == 'O' && gameTicTacToe[2][1] == 'O') ||
                    (gameTicTacToe[0][2] == 'O' && gameTicTacToe[1][2] == 'O' && gameTicTacToe[2][2] == 'O') ||
                    (gameTicTacToe[0][0] == 'O' && gameTicTacToe[1][1] == 'O' && gameTicTacToe[2][2] == 'O') ||
                    (gameTicTacToe[2][0] == 'O' && gameTicTacToe[1][1] == 'O' && gameTicTacToe[0][2] == 'O')) {
                won = true;
                System.out.println("Congratulations, Player 2 has won!");
            } else if (move > 9) {
                won = true;
                System.out.println("Draw!");
            }
        }
    }
}
