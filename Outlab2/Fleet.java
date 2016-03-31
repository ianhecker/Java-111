/** Ian Hecker
 *  Outlab2
 *  Fleet class
 *  Date: 2/10/16
 */
public class Fleet {
    private Ship ship1, ship2, ship3, ship4;
    private String fleetName; 
 
    public Fleet(Ship in_ship1, Ship in_ship2, Ship in_ship3, Ship in_ship4) {
        ship1 = in_ship1;
        ship2 = in_ship2;
        ship3 = in_ship3;
        ship4 = in_ship4;
    }
    
    public void deploy() {
        ship1.deploy();
        ship2.deploy();
        ship3.deploy();
        ship4.deploy();
    }
   
    public void refuel() {
        ship1.reFuel();
        ship2.reFuel();
        ship3.reFuel();
        ship4.reFuel();
    }
    public void printSummary() {
        System.out.println("Ship Name: "+ship1.getName()+" Fuel Used: "+ship1.getUsedFuel());
        System.out.println("Ship Name: "+ship2.getName()+" Fuel Used: "+ship2.getUsedFuel());
        System.out.println("Ship Name: "+ship3.getName()+" Fuel Used: "+ship3.getUsedFuel());
        System.out.println("Ship Name: "+ship4.getName()+" Fuel Used: "+ship4.getUsedFuel());
    }
}    