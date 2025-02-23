package Module_1;

import java.util.Scanner;
public class Dollars {
    public static void main(String[] args){
        DollarFinder();
    }
    public static void DollarFinder(){
        Scanner in = new Scanner(System.in);
        int cents;
        System.out.println("Input your desired amount of cents: ");
        cents = in.nextInt();
        System.out.println((cents/100) + " dollars" + " and " + (cents% 100) + " cents.");
    }
}
