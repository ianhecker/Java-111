
/**
 * FrootLoops is a collection of functions to 
 * test various loops (and a chance to think about cereal.
 * @author (Ian Hecker) 
 * @version (03/11/2016)
 */
public class FrootLoops
{
    public FrootLoops() {
    }
   
    public void red(int lowerBound, int upperBound, int step) {
        System.out.println("-----------------------------------------------");
        System.out.println("Red Loop "+"(lowerBound="+lowerBound+", upperBound="+upperBound+", step="+step+")");
        for(int i=lowerBound; i<upperBound+1; i+=step) {
            System.out.println(i);
        }
    }
    
    public void green(int lowerBound, int upperBound, int step) {
        System.out.println("-----------------------------------------------");
        System.out.println("Green Loop "+"(lowerBound="+lowerBound+", upperBound="+upperBound+", step="+step+")");
        int i=lowerBound;
        while(i<upperBound+1) {
            System.out.println(i);
            i+=step;
        }
    }
    
    public void purple() {
        System.out.println("-----------------------------------------------");
        System.out.println("Purple Loop");
        String alphabet = "";
        for(char i='a'; i<='z'; i++) {
            alphabet+= (char)i;
            System.out.println(alphabet);
        }
    }
    
    public void blue(int val) {
        System.out.println("-----------------------------------------------");
        System.out.println("Blue Loop");
        int [] valueArray = new int[10];
        int count = 0;
        for(int i=0; i<10; i++) {
            valueArray[i]=(int)(Math.random()*10+1);
            if(valueArray[i] == val) {
                count+=1;
            }
        }
        System.out.println(val+" was found "+count+" times.");
    }
    
    public void orange(int val) {
        System.out.println("-----------------------------------------------");
        System.out.println("Orange Loop");
        int [] valueArray = new int[100];
        int count = 0; int iterations = 0;
        while(count!=5) {
            valueArray[iterations]=(int)(Math.random()*10+1);
            if(valueArray[iterations] == val) {
                count+=1;
            }
            iterations+=1;
        }
        System.out.println("It took "+iterations+" iterations to generate "+val+" five times.");
    }
}
