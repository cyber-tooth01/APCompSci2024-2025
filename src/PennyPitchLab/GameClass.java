package PennyPitchLab;

import java.util.Random;
import java.util.Scanner;
import java.lang.System;

public class GameClass {
    private int[][] gameBoard = new int[5][5];

    public int[][] getGameBoard() {
        return gameBoard;
    }

    public void setGameBoard(int[][] gameBoard) {
        this.gameBoard = gameBoard;
    }

    public Scanner in = new Scanner(System.in);
    static Random random = new Random();


    public GameClass(){
        int[] firstRow = {1, 1, 1, 1, 1};
        int[] secondRow = {1, 2, 2, 2, 1};
        int[] thirdRow = {1, 2, 3, 2, 1};
        int[] fourthRow = {1, 2, 2, 2, 1};
        int[] fifthRow = {1, 1, 1, 1, 1};

        System.arraycopy(firstRow, 0, gameBoard[0], 0, 5);
        System.arraycopy(secondRow, 0, gameBoard[1], 0, 5);
        System.arraycopy(thirdRow, 0, gameBoard[2], 0, 5);
        System.arraycopy(fourthRow, 0, gameBoard[3], 0, 5);
        System.arraycopy(fifthRow, 0, gameBoard[4], 0, 5);


    }

    public static void main(String[] args) {
        GameClass gameTime = new GameClass();
        boolean gameOver = false;
        int randRow = gameTime.randomize()[0];
        int randCol = gameTime.randomize()[1];
        int score = 0;
        int usedSquareCounter = 0;

        while (!gameOver) {
            if (usedSquareCounter >= 25) {
                gameOver = true;
            } else {
                while (gameTime.gameBoard[randRow][randCol] == 0) {
                    int[] newCoords = gameTime.randomize();
                    randRow = newCoords[0];
                    randCol = newCoords[1];
                }

                score += gameTime.gameBoard[randRow][randCol];
                gameTime.gameBoard[randRow][randCol] = 0;
                usedSquareCounter++;

                gameTime.printBoard();
                System.out.println("\nThe current score is: " + score + "\n");
            }
        }
    }

    public void printBoard(){
        for (int i = 0; i < this.gameBoard[0].length; i++) {
            for (int j = 0; j < this.gameBoard.length; j++) {
                if (this.gameBoard[i][j] == 0){
                    System.out.print(" X ");
                }else {
                    System.out.print(" " + this.gameBoard[i][j] + " ");
                }
                if (j >= this.gameBoard.length - 1){
                    System.out.println();
                }
            }
        }
    }
    public int[] randomize(){
        int a = random.nextInt(5);
        int b = random.nextInt(5);

        return new int[]{a, b};
    }

}
