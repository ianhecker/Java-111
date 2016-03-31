
/**Ian Hecker
 * 2/11/16
 * Team Class for Inlab 4
 */
public class Team
{
    private String teamName;
    private int totalRounds;
    private int totalScore;
    private double totalAverage;
    public Player p1;
    public Player p2;
    public Player p3;
    public Player p4;
    
    public Team(String getTeamName, Player getp1, Player getp2, Player getp3, Player getp4) {
        teamName = getTeamName;
        p1 = getp1;
        p2 = getp2;
        p3 = getp3;
        p4 = getp4;
    }
    
    public void printStats() {
        totalRounds = p1.rounds + p2.rounds + p3.rounds + p4.rounds;
        totalScore = p1.score + p2.score + p3.score + p4.score;
        totalAverage = (double)totalScore/(double)totalRounds;
        System.out.println("Dream Foursome: ");
        System.out.println("  Number of Rounds: " + totalRounds);
        System.out.println("  Total Score: " + totalScore);
        System.out.println("  Round Average: " + totalAverage);
        System.out.println("  Players:");
        System.out.println("    "+p1.name+" ---> # Rounds: "+p1.rounds+", Score: "+p1.score+", Round Average: "+p1.getAverage());
        System.out.println("    "+p2.name+" ---> # Rounds: "+p2.rounds+", Score: "+p2.score+", Round Average: "+p2.getAverage());
        System.out.println("    "+p3.name+" ---> # Rounds: "+p3.rounds+", Score: "+p3.score+", Round Average: "+p3.getAverage()); 
        System.out.println("    "+p4.name+" ---> # Rounds: "+p4.rounds+", Score: "+p4.score+", Round Average: "+p4.getAverage()); 
    }
}
