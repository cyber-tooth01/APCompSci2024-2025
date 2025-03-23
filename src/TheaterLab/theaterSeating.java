package TheaterLab;

import java.util.Scanner;

public class theaterSeating {
    static int[][] matrix;
    static Scanner in = new Scanner(System.in);

    public theaterSeating(int[][] array){
        matrix = array;
    }

    public void printChart() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    System.out.print("\u001B[31m X  \u001B[0m");
                } else {
                    System.out.print(" " + matrix[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public int[] buyingByPrice(int price){
        for (int i = matrix.length - 1; i >= 0; i--) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == price){
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }

    public int buyingByCord(int row, int col){
        if (matrix[row][col] == 0){
            return 0;
        }else {
            int price = matrix[row][col];
            matrix[row][col] = 0;
            return price;
        }
    }


    public static void main(String[] args) {
        int[][] seatingChart = {
                {10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
                {10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
                {10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
                {10, 10, 20, 20, 20, 20, 20, 20, 10, 10},
                {10, 10, 20, 20, 20, 20, 20, 20, 10, 10},
                {10, 10, 20, 20, 20, 20, 20, 20, 10, 10},
                {20, 20, 30, 30, 40, 40, 30, 30, 20, 20},
                {20, 30, 30, 40, 50, 50, 40, 30, 30, 20},
                {30, 40, 50, 50, 50, 50, 50, 50, 40, 30}
        };

        theaterSeating seatGram = new theaterSeating(seatingChart);
        seatGram.printChart();
        boolean processDone = false;

        while (!processDone) {
            System.out.println("\nHello and welcome your seat selection experience. \nWill you be choosing based on price or location today? Input 1 for the former or 2 for the latter. \nInput 3 to terminate the selection process.");
            int selectionMethod = in.nextInt();
            if (selectionMethod == 1) {
                System.out.println("Please input your desired price:");
                int seatPrice = in.nextInt();

                int[] seatCords = seatGram.buyingByPrice(seatPrice);
                if (seatCords.length < 2) {
                    System.out.println("Sorry, no seat is available at your desired price.");
                } else {
                    System.out.println("\nGood news! A seat is available for $" + seatPrice + " in row " + (seatCords[0] + 1) + " at seat " + (seatCords[1] + 1) + "\n");
                    matrix[seatCords[0]][seatCords[1]] = 0;
                    seatGram.printChart();
                }
            } else if (selectionMethod == 2) {
                System.out.println("Please input your desired row:");
                int seatRow = in.nextInt();
                System.out.println("Please input your desired seat in that row:");
                int seatCol = in.nextInt();

                int priceOfSeat = seatGram.buyingByCord(seatRow - 1, seatCol - 1);
                if (priceOfSeat == 0) {
                    System.out.println("Sorry, your selected seat is not available.");
                } else {
                    System.out.println("\nGood news! The seat " + seatCol + " at row " + seatRow + " is available for $" + priceOfSeat + "\n");
                    seatGram.printChart();
                }
            } else if (selectionMethod == 3) {
                processDone = true;
            }
        }
    }
}
