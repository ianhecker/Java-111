import java.lang.Math;
/**
 * Class for the PetalsGame that will roll dice and return answers
 * @author Ian Hecker 
 * @version 2/26/16
 */
public class PetalsGame
{
    public int[] diceArray = new int[5] ;
    public PetalsGame()
    {
        this.diceArray = diceArray;
    }

    public void rollDice() 
    {
        for(int i=0; i<5; i++) {
           diceArray[i] = (int)(Math.random()*6+1);
        }
    }

    public void printDice()
    {  
        for(int i=0; i<5; i++) {
            if(i==0) {
                System.out.print("You rolled the following: ");
            }
            System.out.print(diceArray[i] + ", ");
            /**Tried to remove unnecessary commma at end by print out diceArray[4] 
            *seperately,but it wouldnt print at all and got cut off by another 
            *print statement in the driver**/
        }
        System.out.println();
    }
    
    public int calculateAllPetals()
    {
        int petalTotal = 0;
        for(int i=0; i<5; i++) {
            if(diceArray[i] == 3) {
                petalTotal += 2; }
            else if(diceArray[i] == 5) {
                petalTotal += 4; }
        }
        return petalTotal;
    }
}
