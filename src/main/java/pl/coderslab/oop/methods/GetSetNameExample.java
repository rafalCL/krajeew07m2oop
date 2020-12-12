package pl.coderslab.oop.methods;

public class GetSetNameExample {
    public static void main(String[] args) {
        Product p = new Product();
        p.setName("ajfon");
        String productName = p.getName();
        System.out.println(productName);
    }
}
