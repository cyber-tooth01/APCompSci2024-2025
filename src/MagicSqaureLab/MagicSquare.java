package MagicSqaureLab;

public class MagicSquare {
    int[][] matrix;
    int compNum;

    public MagicSquare(int[][] array){
        matrix = array;
        for (int b : matrix[0]){
            compNum += b;
        }
    }

    public boolean checkRow() {
        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
            if (sum != compNum) {
                return false;
            }
        }
        return true;
    }
    public boolean checkCol() {
        for (int j = 0; j < matrix[0].length; j++) {
            int sum = 0;
            for (int i = 0; i < matrix.length; i++) {
                sum += matrix[i][j];
            }
            if (sum != compNum) {
                return false;
            }
        }
        return true;
    }

    public boolean checkMainDiagonal() {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }
        return sum == compNum;
    }

    public boolean checkSecondaryDiagonal() {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][matrix.length - 1 - i];
        }
        return sum == compNum;
    }

    public boolean isMagicSquare() {
        return checkRow() && checkCol() && checkMainDiagonal() && checkSecondaryDiagonal();
    }

    public static void main(String[] args) {
        int[][] array = new int[4][4];
        int[] firstRow = {16, 3, 2, 13};
        int[] secondRow = {5, 10, 11, 8};
        int[] thirdRow = {9, 6, 7, 12};
        int[] fourthRow = {4, 15, 14, 1};

        System.arraycopy(firstRow, 0, array[0], 0, 4);
        System.arraycopy(secondRow, 0, array[1], 0, 4);
        System.arraycopy(thirdRow, 0, array[2], 0, 4);
        System.arraycopy(fourthRow, 0, array[3], 0, 4);

        MagicSquare magicTime = new MagicSquare(array);

        if (magicTime.isMagicSquare()) {
            System.out.println("The matrix is a magic square.");
        } else {
            System.out.println("The matrix is NOT a magic square.");
        }
    }
}
