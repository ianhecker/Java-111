/**Ian Hecker
 * Cart class for Inlab3
 * Date: 2/4/16
 */
public class Cart {
    
    private String cartName;
    private int quantity1;
    private int quantity2;
    private GroceryItem item1;
    private GroceryItem item2;
    
    public Cart(String name) {
        cartName = name; }
    
    public String getName() {
        return cartName; }
    
    public void addItem1(GroceryItem item, int newQuantity) {
        item1 = item;
        quantity1 = newQuantity;
        item1.updateStock(quantity1);
    }
    public void addItem2(GroceryItem item, int newQuantity) {
        item2 = item;
        quantity2 = newQuantity;
        item2.updateStock(quantity2);
    }
    public void printReceipt() {
        double printReceipt1 = quantity1 * item1.getCost();
        double printReceipt2 = quantity2 * item2.getCost();
        double totalPrice = printReceipt1 + printReceipt2;
        double tax = totalPrice * 0.07;
        System.out.println("Shopper name: " + getName());
        System.out.println("---------------------");
        System.out.println(item1.getName() + ": " + quantity1 + " units at $" + item1.getCost() + " per unit = $" + printReceipt1);
        System.out.println(item2.getName() + ": " + quantity2 + " units at $" + item2.getCost() + " per unit = $" + printReceipt2);
        System.out.println("   ----> Subtotal = $" + totalPrice);
        System.out.println("   ----> 7% tax = $" + tax);
        System.out.println("   ----> Total = $" + (totalPrice + tax));
        System.out.println();
        
        
        
    }
    
    
  
        
    
    

























}
