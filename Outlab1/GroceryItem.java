//Grocery Item List that has names, prices, and isle number
//Ian Hecker
//Date: 1/24/16
//Version: 1.0

public class GroceryItem {
    
    private String name;
    private double cost;
    private int aisleNum;
    private double changeCost;
    
    GroceryItem(String getName, double getCost, int getAisle) {
        name = getName;
        cost = getCost;
        aisleNum = getAisle;
    }
    
    String getName() {
        return name; }
    double getCost() {
        return cost; }
    int getAisle() {
        return aisleNum; }
    public void changeCost(double changeCost) {
        changeCost = cost; }
}

