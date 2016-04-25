import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 * class Battleship
 * 
 * @author (Ian Hecker) 
 * @version (4/22/16)
 */
public class Battleship
{
    public Spot[][] board;
    private int missesInElOcean = 0;
    private int hitsOnLosShips = 0;
    
    public Battleship(int rows, int columns)
    {      
        board = new Spot[rows][columns]; //Initializing new board
    }
    
    public void setBoard()
    {                        
        //Printing out Battleship board        
        for(int row = 0; row < board.length; row++)
        {         
            for(int col = 0; col < board[row].length; col++)
            {                               
                board[row][col] = new Spot();                                
            }                       
        }                
        for(int shipSize = 5; shipSize >= 2; shipSize--)
        {
            placeShips(shipSize);
        }        
    }
    
    public void placeShips(int shipSize)
    {
        int rowLength = board.length;
        int colLength = board[0].length;
        boolean shipPlaced = false;
        Random r1 = new Random();
        Random r2 = new Random();
        int randomRow, randomCol;
        double shipOrientation; //Determines vertical or horizontal placement
        boolean existingShip = true;
        while(shipPlaced != true)
        {
            randomRow = r1.nextInt((rowLength-1)); //Randomly choosing row
            randomCol = r2.nextInt((colLength-1)); //Randomly choosing column
            shipOrientation = Math.random();
            if(shipOrientation > 0.5) //Placing ship upwards
            {
                if(randomRow + shipSize <= board.length)
                {
                    for(int i=0; i <= shipSize - 1; i++) //Checking for previous ship
                    {
                        if(board[randomRow + i][randomCol].getShip() != 0)
                        { //If previous ship here....TRUE
                            existingShip = true;
                            break;
                        }
                        else //If no previous ship...FALSE
                        {
                            existingShip = false;
                        }
                    }                
                    /**Placing down ships onto board**/
                    if(existingShip == false)
                    {
                        for(int row = randomRow; row < randomRow + shipSize; row++)
                        {
                            board[row][randomCol].setShip(shipSize);
                        }
                        shipPlaced = true;
                    }
                }
            }
            else //Placing ship sideways
            {
                if(randomCol + shipSize <= board[0].length) //Checking for fitting size
                {    
                    for(int j=0; j <= shipSize - 1; j++) //Checking for previous ship
                    {
                        if(board[randomRow][randomCol + j].getShip() != 0)
                        { //If previous ship here...TRUE
                            existingShip = true;                            
                            break;
                        }
                        else //If no previous ship...FALSE
                        {
                            existingShip = false;
                        }
                    }                
                    /**Placing down ships onto board**/
                    if(existingShip == false)
                    {
                        for(int col = randomCol; col < randomCol + shipSize; col++)
                        {
                            board[randomRow][col].setShip(shipSize);
                        }
                        shipPlaced = true;
                    }
                }
            }            
        }        
    }
    
    public void printBoard(boolean answersOrNah) {
        
        int colCounter = board[0].length+1; //How wide to make the print
        int rowCounter = board.length+1; //How tall to make the print

        int row = 0; //Keeps track of printed rows in placedShip array
        int col = 0; //Keeps track of printed col in placedShip array   
        
        int gridNumbers = 1;
        while(rowCounter != 0) //Keeps a tally on how tall to print
        {
            if(col == 0)
            {
                System.out.print("  "); //Printing spacing to match number cells
            }
            while(colCounter != 0)
            {
                System.out.print("+");
                if(colCounter != 1) //Prevents printing after a "+"
                {
                    System.out.print("-");
                }
                colCounter--;
            }
            colCounter = board[0].length+1; //reset counter
            System.out.println(); //new printing line                        
            if(rowCounter != 1) //Prevents printing the number cell line after
            {                   //the finalk border line of "+-+-+"                
                if(col == 0) //only print grid number before first column
                {
                    System.out.print(gridNumbers + " "); //Printing grid numbers
                    gridNumbers++;
                }
                while(colCounter !=0)
                {                    
                    System.out.print("|");
                    /**If statement for answer printing**/
                    if(answersOrNah == true)//Checking to print answers
                    {
                        if(colCounter != 1) //Prevents printing after a "|"
                        {
                            System.out.printf("%s", board[row][col].getShip());
                            col++;
                        }
                    }
                    else //Hide answers except visited locations
                    {
                        if(colCounter != 1) //Prevents printing after a "|"
                        {
                            if(board[row][col].getVisited() == true)
                            {                            
                                System.out.printf("%s", board[row][col].getShip());
                            }
                            else
                            {
                                System.out.print(" ");
                            }
                            col++;
                        }
                    }
                    colCounter--;
                }
                row++;
                col = 0;
                colCounter = board[0].length+1; //reset counter                    
            }
            rowCounter--;
            if(rowCounter == 0) //Checking for last row to print bottom grid numbers
            {
                gridNumbers = 1; //reset gridNumbers
                System.out.print("   ");
                for(int i=0; i < board[0].length; i++)
                {
                    System.out.print(gridNumbers + " ");
                    gridNumbers++;
                }
                System.out.println();
            }
            System.out.println(); //new line
        }
        
    }
    
    public void makeGuess()
    {
        int rowGuess, colGuess;
        try
        {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a row to guess > ");
            rowGuess = (input.nextInt() - 1);
            System.out.print("Enter a column to guess > ");
            colGuess = (input.nextInt() - 1);
        }
        catch (InputMismatchException e)
        {
            System.out.println("Error. you did not enter an integer value. Please" + 
            " try again.\n");
            return;
        }
        if(rowGuess > board.length - 1)
        {
            System.out.println("Invalid row.\n");
            return;
        }
        else if(colGuess > board[0].length - 1)
        {
            System.out.println("Invalid column.\n");
            return;
        }
        else if(board[rowGuess][colGuess].getVisited() == true)
        {
            System.out.println("You already guessed that location!\n");
            return;
        }
        board[rowGuess][colGuess].setVisited(true);
        if(board[rowGuess][colGuess].getShip() == 5)
        {
            System.out.println("Hit!  You just hit the Carrier\n");
            hitsOnLosShips++;
        }
        else if(board[rowGuess][colGuess].getShip() == 4)
        {
            System.out.println("Hit!  You just hit the Battleship\n");
            hitsOnLosShips++;
        }
        else if(board[rowGuess][colGuess].getShip() == 3)
        {
            System.out.println("Hit!  You just hit the Submarine\n");
            hitsOnLosShips++;
        }
        else if(board[rowGuess][colGuess].getShip() == 2)
        {
            System.out.println("Hit! You just hit the Patrol Boat\n");
            hitsOnLosShips++;
        }
        else if(board[rowGuess][colGuess].getShip() == 0)
        {
            System.out.println("Miss!  There was nothing at that location\n");
            missesInElOcean++;
        }        
    }

    public boolean over()
    {
        if(hitsOnLosShips == 14)
        {            
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public void printStatistics()
    {
        printBoard(false);
        System.out.println("\nCongratulations! You sunk the enemy fleet using " 
        + (missesInElOcean + hitsOnLosShips) + " guesses.  Game over.");
        
    }
}

