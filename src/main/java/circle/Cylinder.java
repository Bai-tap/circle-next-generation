package circle;

public class Cylinder extends Circle {
    private double height = 1;

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return height * Math.PI * getRadius() * getRadius();
    }

    @Override
    public String toString() {
        return "A " + getColor() + " cylinder with radius = " + getRadius() + " and volume = " + getVolume();
    }
}
