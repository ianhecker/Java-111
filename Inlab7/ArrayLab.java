
/**
 * Holds methods that create and test an array
 * 
 * @author (Ian Hecker) 
 * @version (3/11/2016)
 */
public class ArrayLab
{
    private int arraySize, search;
    private int[] array;
    private double averageValue, maximumValue, minimumValue;
    
    public ArrayLab(int arraySize) {
        array = new int[arraySize];
        this.arraySize = arraySize;
    }
    
    public void print() {
        for(int i=0; i<arraySize; i++) {
            if(i<9) {
                System.out.print(array[i]+",");
            }
            else {
                System.out.print(array[i]+"\n");
                System.out.println();
            }
        }
    }
    
    public void initialize() {
        for(int i=0; i<arraySize; i++) {
            array[i] = (int)(Math.random()*10+1);
        }
    }
    
    public void printStats() {
        for(int i=0; i<arraySize; i++) {
            averageValue+= array[i];
            if(array[i]>maximumValue) {
                maximumValue = array[i];
            }
            if(array[i]<minimumValue) {
                minimumValue = array[i];
            }
        }
        averageValue = averageValue/arraySize;
        
        System.out.println("Average Value: "+averageValue);
        System.out.println("Maximum Value: "+maximumValue);
        System.out.println("Minimum Value: "+minimumValue);
    }
    
    public void search(int number) {
        for(int i=0; i<arraySize; i++) {
            if(array[i]==number) {
                search+=1;
            }
        }
        if(search>=1) {
            System.out.println(number+" was found.");
        }
        else {
            System.out.println(number+" was not found.");
        }
    }
}
