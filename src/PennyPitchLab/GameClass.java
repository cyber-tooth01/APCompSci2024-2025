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
    Random random = new Random();


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
        gameTime.printBoard();
    }

    public void printBoard(){
        for (int i = 0; i < this.gameBoard[0].length; i++) {
            for (int j = 0; j < this.gameBoard.length; j++) {
                System.out.print(" " + this.gameBoard[i][j] + " ");
                if (j >= this.gameBoard.length - 1){
                    System.out.println();
                }
            }
        }
    }

    public int[] randomize(){
        int a = random.nextInt(6);
        int b = random.nextInt(6);

        return new int[]{a, b};
    }

}
