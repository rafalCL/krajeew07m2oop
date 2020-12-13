package pl.coderslab.oop.inheritance;

public class Shape {
    private double x;
    private double y;
    private String color;

    public Shape(double x, double y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public double getDistance(Shape other){
        double dx = other.x - this.x;
        double dy = other.y - this.y;

        double distance = Math.sqrt(Math.pow(dx,2) + dy*dy);

        return distance;
    }
}
