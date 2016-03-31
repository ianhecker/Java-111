
/**
 * Write a description of class Ship here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ship
{
    private String name;
    private int fuelCapacity;
    private int usedFuel;
    private int fuel;
    
    public Ship(String in_name, int in_fuel) {
        name = in_name;
        fuel = in_fuel;
        fuelCapacity = in_fuel;
        usedFuel = 0;
    }
    
    public String getName() {
        return name;
    }    
        
    public void setShipName(String in_name) {
        name = in_name;
    }
    
    public void setFuel(int getFuel) {
        fuel = getFuel;
    }
    
    public void reFuel() {
        fuel = fuelCapacity;
    }
    
    public int getFuel() {
        return fuel;
    }    
    
    public int getUsedFuel() {
        return usedFuel;
    }

    public void deploy() {
        int fuelUsed = fuel/2;
        usedFuel = usedFuel + fuelUsed;
        fuel = fuel - fuelUsed;
    }    
}
