package TheaterLab;

import java.util.Scanner;

public class theaterSeating {
    int[][] matrix;
    Scanner in = new Scanner(System.in);

    public theaterSeating(int[][] array){
        matrix = array;
    }

    public void printChart() {
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[0].length; j++) {
                if (this.matrix[i][j] == 0) {
                    System.out.print(" X ");
                } else {
                    System.out.print(" " + this.matrix[i][j] + " ");
                }
            }
            System.out.println();
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
    }
}
