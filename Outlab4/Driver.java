import java.util.Scanner;
/**
 * Runs the FrootLoop Class methods.
 * 
 * @author (Ian Hecker) 
 * @version (3/11/2016)
 */
public class Driver
{
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        FrootLoops runThrough = new FrootLoops();
        int menuPick = 1;
        
        System.out.println("~~~ FrootLoops ~~~");
        
        while(menuPick !=7) {
            System.out.println("\n-----------------------------------------------");
            System.out.println("1. Run all.");
            System.out.println("2. Red Loop.");
            System.out.println("3. Green Loop.");
            System.out.println("4. Purple Loop.");
            System.out.println("5. Blue Loop.");
            System.out.println("6. Orange Loop.");
            System.out.println("7. Quit FruitLoops.");
            
            System.out.print("\nEnter your choice: ");
            menuPick = in.nextInt();
            
            switch(menuPick) {
                case 1:
                    runThrough.red(1, 10, 1);
                    runThrough.green(1, 10,1);
                    runThrough.red(2, 9, 3);
                    runThrough.green(2, 9, 3);
                    runThrough.purple();
                    runThrough.blue(4);
                    runThrough.orange(4);
                    break;
                case 2:
                    runThrough.red(1, 10, 1);
                    runThrough.red(2, 9, 3);
                    break;
                case 3:
                    runThrough.green(1, 10,1);
                    runThrough.green(2, 9, 3);
                    break;
                case 4:
                    runThrough.purple();
                    break;
                case 5:
                    runThrough.blue(4);
                    break;
                case 6:
                    runThrough.orange(4);
                    break;
                case 7:
                    System.out.println("Done.");
                    break;
                default:
                    System.out.println("Oops! Looks like your entry wasn't 1-7.\n");
            }
        }
    }
}
