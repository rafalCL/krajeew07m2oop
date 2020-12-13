package pl.coderslab.oop.inheritance;

public class ShapeTester {
    public static void main(String[] args) {
        Shape s1 = new Shape(0,0,"blue");
        Shape s2 = new Shape(3,4,"yellow");

        double distanceBetweenS1ToS2 = s1.getDistance(s2);
        System.out.println(distanceBetweenS1ToS2);
    }
}
