package pl.coderslab.oop.constructor;

public class Burger {
    private String size;
    private double price;

    public Burger(){
        size = "medium";
        price = 10.99;
    }

    public Burger(String size, double price){
        this.size = size;
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }
}
