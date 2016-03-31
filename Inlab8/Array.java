/**
 * Write a description of class Array here.
 * 
 * @author (Ian Hecker) 
 * @version (3/24/16)
 */
public class Array
{
    private int[] array;
    public Array(int size)
    {
        array = new int[size];
    }
    
    public int[] fill() {
        for(int i=0; i < array.length; i++){
            array[i]=(int)(Math.random()*10);
        }
        return array;
    }

    public int[] sort() {
        boolean num_swap = true;
        int counter = 0;
        int number_pushed_up;
        while(num_swap){
            num_swap = false;
            counter ++;
            for(int i=0; i < array.length-counter; i++){
                if(array[i] > array[i+1]){
                    number_pushed_up = array[i];
                    array[i] = array[i+1];
                    array[i+1] = number_pushed_up;
                    num_swap = true;
                }
            }
        }
        return array;
    }
    
    public void print() {
        System.out.println("-----------");
        for(int i=0; i < array.length; i++){
            if(i==array.length-1){ 
                System.out.print("|"+array[i]+"|");
            }
            else{
                System.out.print("|"+array[i]);
            }
        }
        System.out.println("\n-----------");              
    }
    
    public void printFrequency() {
        int tally = 0;
        for(int i=0; i < 10; i++){
            tally = 0;
            for(int j=0; j < array.length; j++){
                if(array[j]==i){
                    tally+=1;
                }
            }
            System.out.printf("There are %s, %s's\n", tally, i);
        }
    }
}
