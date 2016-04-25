/**
 * Spot class represents one spot in the Battleship board.
 */
public class Spot
{
    private boolean visited;    //has the user guessed this spot?
    private int ship;           //ship type in spot (5 - Carrier, 4 - Battleship, ..., 0 - Vacant)
    
    public boolean getVisited()
    {
        return visited;
    }
    
    public void setVisited(boolean val)
    {
        visited = val;
    }
    
    public int getShip()
    {
        return ship;
    }

    public void setShip(int val)
    {
        ship = val;
    }    
}
