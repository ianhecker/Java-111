
/**Ian Hecker
 * 2/11/16
 * Player class
 */
public class Player {
    public String name;
    public int score;
    public int rounds;
    public double average;
    
    public Player(String getName) {
        name = getName;
    }
    
    public void setRounds(int getRounds) {
        rounds = getRounds;
    }
    
    public void setScore(int getScore) {
        score = getScore;
    }
    
    public double getAverage() {
        return (double)score/(double)rounds;
    }


















}