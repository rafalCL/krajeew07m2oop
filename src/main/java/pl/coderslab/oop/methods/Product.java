package pl.coderslab.oop.methods;

public class Product {
    private String name;

    public Product(){
        this.name="not set";
    }

    public Product(String name){
        this.name = name;
    }

    public Product(Product other){
        this.name = other.name;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String newName){
        name = newName;
    }

    // alternatywnie do "chainingu"
//    public Product setName(String newName){
//        this.name = newName;
//        return this;
//    }

    public String toString(){
        return "Klasa Product, pola: name=" + this.name;
    }
}
