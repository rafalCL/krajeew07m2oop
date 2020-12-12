package pl.coderslab.oop.methods;

public class Product {
    private String name;

    public String getName(){
        return this.name;
    }

    public void setName(String newName){
        this.name = newName;
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
