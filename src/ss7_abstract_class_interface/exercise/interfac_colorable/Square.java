package ss7_abstract_class_interface.exercise.interfac_colorable;

public class Square extends Shape {
    public double side = 1.0;

    public Square() {
    }


    public Square(double side) {
        this.side = side;
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void howToColor() {
        System.out.println(getColor());
    }

    public double getArea() {
        return side * side;
    }

    @Override
    public String toString() {
        return "Square : " +
                "side=" + side;
    }
}
