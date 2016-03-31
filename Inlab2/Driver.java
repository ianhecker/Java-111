//Ian Hecker
//Driver class: Runs calculations for Book Class
//Date: 1/27/16
//Version 0.1

public class Driver {
    public static void main(String[] args) {
        Book book1 = new Book("Dracula", 22, 7.55);
        Book book2 = new Book("Frankenstein", 21, 8.95);
        
        System.out.println(book1.getTitle() + " costs $" + book1.getCost() + " and has " + book1.getStock() + " copies in stock.");
        System.out.println(book2.getTitle() + " costs $" + book2.getCost() + " and has " + book2.getStock() + " copies in stock.");

        System.out.println("\nGetting Total Value... \n");
        book1.totalValue();
        book2.totalValue();
        
        System.out.println("The stock of " + book1.getTitle() + " has a total value of $" + book1.totalValue());
        System.out.println("The stock of " + book2.getTitle() + " has a total value of $" + book2.totalValue());
    }
}