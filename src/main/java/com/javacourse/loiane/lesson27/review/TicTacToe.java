package com.javacourse.loiane.lesson27.review;

public class TicTacToe {

    char[][] ticTacToeGame = new char[3][3];
    int move = 1;

    boolean validateMove(int row, int column, char sign) {
        if (ticTacToeGame[row][column] == sign || ticTacToeGame[row][column] == 'O') {
            return false;
        } else {
            ticTacToeGame[row][column] = sign;
            move++;
            return true;
        }
    }

    void displayBoard() {
        for (int i = 0; i < ticTacToeGame.length; i++) {
            for (int j = 0; j < ticTacToeGame[i].length; j++) {
                System.out.print(ticTacToeGame[i][j] + " | ");
            }
            System.out.println();
        }
    }

    boolean checkWinner(char sign) {
        if ((ticTacToeGame[0][0] == sign && ticTacToeGame[0][1] == sign && ticTacToeGame[0][2] == sign) ||     //row 1
                (ticTacToeGame[1][0] == sign && ticTacToeGame[1][1] == sign && ticTacToeGame[1][2] == sign) || //row 2
                (ticTacToeGame[2][0] == sign && ticTacToeGame[2][1] == sign && ticTacToeGame[2][2] == sign) || //row 3
                (ticTacToeGame[0][0] == sign && ticTacToeGame[1][0] == sign && ticTacToeGame[2][0] == sign) ||
                (ticTacToeGame[0][1] == sign && ticTacToeGame[1][1] == sign && ticTacToeGame[2][1] == sign) ||
                (ticTacToeGame[0][2] == sign && ticTacToeGame[1][2] == sign && ticTacToeGame[2][2] == sign) ||
                (ticTacToeGame[0][0] == sign && ticTacToeGame[1][1] == sign && ticTacToeGame[2][2] == sign) ||
                (ticTacToeGame[2][0] == sign && ticTacToeGame[1][1] == sign && ticTacToeGame[0][2] == sign)) {
            return true;
        }
        return false;
    }

    boolean player1Turn() {
        if (move % 2 == 1) {
            return true;
        }
        return false;
    }
}