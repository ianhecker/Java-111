//Ian Hecker
//Book Class: Contains variables for "Book" Driver
//Date: 1/27/16
//Version 0.1

public class Book {
        private String title;
        private int stock;
        private double cost;
        private double totalValue;
        
       
        
        public Book(String getTitle, int getStock, double getCost) {
            title = getTitle;
            stock = getStock;
            cost = getCost;
        }
        
        public String getTitle() {
            return title; }
        public int getStock() {
            return stock; }
        public double getCost() {
            return cost; }
        public double totalValue() {
            totalValue = cost * stock;
            return totalValue; }
        }