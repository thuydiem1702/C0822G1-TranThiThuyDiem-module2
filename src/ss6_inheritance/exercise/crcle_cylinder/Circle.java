package ss6_inheritance.exercise.crcle_cylinder;

public class Circle {
    protected double radius;
    protected String color;
    protected Circle() {
    }
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }

    @Override
    public String toString() {
        return "radius : "+ radius +
                " and color : " + color +
                " and area : " + getArea();
    }
}
