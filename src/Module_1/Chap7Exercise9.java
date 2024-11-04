package Module_1;

import java.util.Scanner;
public class Chap7Exercise9 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int inputInt = 0;
        int sum = 0;

        System.out.println("Enter a positive integer under 10: ");
        inputInt = in.nextInt();

        for (int i = 1; i <= inputInt; i++) {
            sum += i;
            System.out.print(i);
            if (i < inputInt) {
                System.out.print(" + ");
            }
        }
        System.out.println(" = " + sum);
    }
}


