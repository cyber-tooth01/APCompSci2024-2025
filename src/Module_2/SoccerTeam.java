package Module_2;

public class SoccerTeam {
    int wins = 0;
    int losses = 0;
    int ties = 0;

    static int totalGames = 0;
    static int totalGoals = 0;

    public void played(SoccerTeam other, int myScore, int otherScore){
        if (myScore > otherScore){
            this.wins++;
            other.losses++;
        }else if (myScore < otherScore){
            this.losses++;
            other.wins++;
        }else{
            this.ties++;
            other.ties++;
        }
        totalGames++;
        totalGoals += myScore + otherScore;
    }

    public int calcPoints(){
        return (wins * 3) + (ties * 1);
    }

    public void reset(){
        wins = 0;
        losses = 0;
        ties = 0;
    }

    public static int getTotalGames() {
        return totalGames;
    }

    public static int getTotalGoals() {
        return totalGoals;
    }

    public static void startTournament(){
        totalGames = 0;
        totalGoals = 0;
    }
}

