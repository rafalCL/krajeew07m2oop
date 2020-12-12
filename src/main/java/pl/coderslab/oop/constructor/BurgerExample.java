package pl.coderslab.oop.constructor;

public class BurgerExample {
    public static void main(String[] args) {
        Burger b = new Burger("large", 19.99);

        System.out.println(b.getPrice());
        System.out.println(b.getSize());

        Burger b2 = new Burger();

        System.out.println(b2.getPrice());
        System.out.println(b2.getSize());
    }
}
