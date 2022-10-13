package ss7_abstract_class_interface.exercise.interfac_resizeable;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(1, "red", true);
        shapes[1] = new Rectangle("green", true, 10, 20);
        shapes[2] = new Square("yellow", true, 10);
        shapes[0].resizeable(5);
        System.out.println(shapes[0]);

    }
}
