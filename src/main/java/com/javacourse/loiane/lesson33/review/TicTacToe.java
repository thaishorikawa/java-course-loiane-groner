package com.javacourse.loiane.lesson33.review;

public class TicTacToe {

    private char[][] ticTacToeGame;
    private int move;

    public TicTacToe() {
        setTicTacToeGame(new char[3][3]);
        setMove(1);
    }


    public char[][] getTicTacToeGame() {
        return ticTacToeGame;
    }

    public void setTicTacToeGame(char[][] ticTacToeGame) {
        this.ticTacToeGame = ticTacToeGame;
    }

    public int getMove() {
        return move;
    }

    public void setMove(int move) {
        this.move = move;
    }

    public boolean validateMove(int row, int column, char sign) {
        if (ticTacToeGame[row][column] == 'X' || ticTacToeGame[row][column] == 'O') {
            System.out.println("You need to choose an empty space.");
            return false;
        } else {
            ticTacToeGame[row][column] = sign;
            move++;
            return true;
        }
    }

    public void displayBoard() {
        for (int i = 0; i < ticTacToeGame.length; i++) {
            for (int j = 0; j < ticTacToeGame[i].length; j++) {
                System.out.print(ticTacToeGame[i][j] + " | ");
            }
            System.out.println();
        }
    }

    public boolean checkWinner(char sign) {
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

    public boolean player1Turn() {
        if (move % 2 == 1) {
            return true;
        }
        return false;
    }
}
