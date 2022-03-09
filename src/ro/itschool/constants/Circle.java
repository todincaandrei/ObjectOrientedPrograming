package ro.itschool.constants;

public class Circle {

    public static final double pi = 3.14;
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return pi * Math.pow(radius, 2);

    }

}
