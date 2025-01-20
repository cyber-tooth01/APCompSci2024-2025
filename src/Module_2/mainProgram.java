package Module_2;

public class mainProgram {
    public static void main(String[] args) {
        SoccerTeam teamA = new SoccerTeam();
        SoccerTeam teamB = new SoccerTeam();
        SoccerTeam teamC = new SoccerTeam();
        SoccerTeam teamD = new SoccerTeam();

        teamA.played(teamB, 3, 1);
        teamB.played(teamC, 2, 3);
        teamC.played(teamD, 4, 1);
        teamD.played(teamA, 1, 2);

        System.out.println("Team A Points: " + teamA.calcPoints());
        System.out.println("Team B Points: " + teamB.calcPoints());
        System.out.println("Team C Points: " + teamC.calcPoints());
        System.out.println("Team D Points: " + teamD.calcPoints());

        System.out.println("Total Games Played: " + SoccerTeam.getTotalGames());
        System.out.println("Total Goals Scored: " + SoccerTeam.getTotalGoals());

        teamA.reset();
        teamB.reset();
        teamC.reset();
        teamD.reset();

        SoccerTeam.startTournament();

    }
}
