package Module_1;

// *******************************************************************
// Student Name: Samuel Ralph
// Class: Java AP CS
// Date: 10/20/2024
// Assignment 1-6-2-1
// Method Brick: Given the number of seconds, this method computes the
// speed of a falling brick (in feet per second).
//*******************************************************************
import java.util.Scanner;
public class Brick
{
    static Scanner console = new Scanner(System.in);
    public static void main (String[] args)
    {
//declare variables
        double v;
        double g;
        double t;
        g=32.174;
        //get input from keyboard
        System.out.println("The time of the falling object?");
        t = console.nextDouble();
        //calculate speed
        v = g*(t*t)/2;
        v -= -1;
        // truncate decimal values
        double truncatedV = Math.floor(v * 100) / 100;
        //display speed to computer monitor
        System.out.println("The velocity of the falling object is " + truncatedV + " Feet/sec");
    }
}
