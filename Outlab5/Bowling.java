
/**
 * Holds methods to be activated by Driver
 * 
 * @author (Ian Hecker) 
 * @version (3/31/16)
 */
public class Bowling
{
    private int[] rolls;
    private int frames;
    
    public Bowling(int [] rolls, int frames) {
        this.rolls  = rolls;
        this.frames = frames;
    }
    
    public void play() {
        scoreKeeper(rolls, frames);
        
    }
    
    public void scoreKeeper(int [] rolls, int frames) {
        int tally = frames*2;
        
        if(rolls.length != frames*2) {
            
        
        
            for(int i=0; i < frames; i++) {
                if(rolls[i] == 10) {
                    
                }
                
            }
        
            for(int i=0; i < something; i++) {
            
            }
        }
        
    }
    
    public formatPrint() {

    }
}

