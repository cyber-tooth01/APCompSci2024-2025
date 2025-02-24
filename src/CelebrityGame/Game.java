package CelebrityGame;

import java.util.ArrayList;

public class Game {
    public boolean isGameOver;
    public int gameScore;
    public String winner;

    public String[] celebrityNames = {"Karla Sofía Gascón", "Demi Moore", "Timothée Chalamet", "Ariana Grande", "Fernanda Torres", "Colman Domingo"};
    public String[] hints = {"Who is the leading actress in “Emilia Perez”?", "Who is the leading actress in “The Substance”?", "Who is the leading actor in “A Complete Unknown”?", "Who is an actress in a supporting role in “Wicked”?", "Who is the leading actress in “I'm Still Here”?", "Who is the lead actor in “Sing Sing”?"};

    public ArrayList<Celebrity> celebrities;

    public Game(){
        isGameOver = false;
        gameScore = 0;
        winner = "";

        celebrities = new ArrayList<Celebrity>(6);

        for (int i = 0; i < 6; i++) {
            celebrities.add(new Celebrity(celebrityNames[i], hints[i]));
        }


    }

    public void getArray(){
        for (Celebrity c : celebrities){
            System.out.println(c.getName() + ": " + c.getHint());
        }
    }

    public static void main(String[] args) {


    }
}
