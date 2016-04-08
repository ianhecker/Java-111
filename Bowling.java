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
    private static final String strike = "X";
    private static final String spare = "/";
        
    public Bowling(int [] rolls, int frames) { /**makes rolls[] and frames instance vars*/
        this.rolls  = rolls;
        this.frames = frames;
    }
    
    public void play() { /**holds the scoring system for the Bowling class*/
        int iterations = frames*2; //value to run for-loop that changes in case of strikes
        int[] totalScore = new int[frames]; /**to keep a list of frame totals for printing*/
        int previousTotal = 0; //to prevent counter = -1 --->out of bounds error
        int counter = 0; //counter for totalScore array position because i jumps around
        for(int i=0; i < iterations; i++) { //runs through entire list of rolls
            if(rolls[i] == 10) { //if roll is a strike
                if(counter != 0) { //to prevent counter = -1 --->out of bounds error
                    previousTotal = totalScore[counter-1];
                }
                totalScore[counter] = previousTotal+ 10 + rolls[i+1] + rolls[i+2];
                iterations -= 1; //Because one strike = two rolls worth
                counter++; //move totalScore position
            }
            else if((rolls[i] + rolls[i+1] == 10)) {
                if(counter != 0) { //to prevent counter = -1 --->out of bounds error
                    previousTotal = totalScore[counter-1];
                }
                totalScore[counter] = previousTotal + 10 + rolls[i+2];
                i++; //Because we dont want to add the second roll again
                counter++; //move totalScore position
            }
            else {
                if(counter != 0) { //to prevent counter = -1 --->out of bounds error
                    previousTotal = totalScore[counter-1]; 
                }
                totalScore[counter] = previousTotal + rolls[i] + rolls[i+1];
                i++; //Because we dont want to add the second roll in the pair again
                counter++; //move totalScore position
            }
        }
        formatPrint(totalScore);
    }
    
    
    
    
    
    
    public void formatPrint(int[] totalScore) {
        int iterations = frames*2;
        int frameCounter = 1;
        int counter = 0;
        for(int i=0; i < iterations; i++) {
            int bracketSize = 0;
            
            if(rolls[i] == 10) {
                bracketSize = 3;
                iterations -= 1;
                
            }
            else if((rolls[i] + rolls[i+1] == 10)) { //check for spare
                bracketSize = 3;
                i++;
            }
            else {
                bracketSize = 2;
                i++;
            }
            for(int firstRow=0; firstRow < bracketSize; firstRow++) {
                System.out.printf("+---");
                if(bracketSize-firstRow == 1) {
                    System.out.printf("+   Frame"+frameCounter+"\n");
                    frameCounter++;
                }
            }
            for(int secondRow=0; secondRow < bracketSize; secondRow++) {
                System.out.printf("| %s ", "O");
                if(bracketSize-secondRow == 1) {
                    System.out.printf("|\n");
                }
            }
            for(int thirdRow=0; thirdRow < bracketSize; thirdRow++) {
                System.out.printf("+---");
                if(bracketSize-thirdRow == 1) {
                    System.out.printf("+\n");
                }
            }
            System.out.printf("|");
            if(bracketSize == 2) {
                if(totalScore[counter] < 10) {
                    System.out.printf("     "+totalScore[counter]+" |\n");
                    counter++;
                }
                else if(totalScore[counter] > 10 && totalScore[counter] < 100) {
                    System.out.printf("    "+totalScore[counter]+" |\n");
                    counter++;
                }
                else {
                    System.out.printf("   "+totalScore[counter]+" |\n");
                    counter++;
                }
            }
            else {
                if(totalScore[counter] < 10) {
                    System.out.printf("         "+totalScore[counter]+" |\n");
                    counter++;
                }
                else if(totalScore[counter] > 10 && totalScore[counter] < 100) {
                    System.out.printf("        "+totalScore[counter]+" |\n");
                    counter++;
                }
                else {
                    System.out.printf("       "+totalScore[counter]+" |\n");
                    counter++;
                }
            }
            for(int fifthRow=0; fifthRow < bracketSize; fifthRow++) {
                if(fifthRow == 0) {
                    System.out.printf("+");
                }
                System.out.printf("---");
                if(bracketSize-fifthRow == 1) {
                    if(bracketSize == 2) {
                        System.out.printf("-+\n\n");
                    }
                    else{
                        System.out.printf("--+\n\n");
                    }
                }
            }
        }
    }
}
