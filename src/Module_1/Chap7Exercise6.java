package Module_1;

import java.util.Scanner;
public class Chap7Exercise6 {
    static int startingYear = 2021;
    static double startingPopulation = 130.3;
    static double growthRate = 1.1;


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        double desiredPopulation = 0.0;

        System.out.println("Enter your desired target population (in millions): ");
        desiredPopulation = in.nextDouble();

        while(startingPopulation <= desiredPopulation){
            startingPopulation *= growthRate;
            startingYear++;
        }
        System.out.println("Mexico will reach the desired population in the year: " + startingYear);
    }
}
