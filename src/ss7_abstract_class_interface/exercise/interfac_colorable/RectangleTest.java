package ss7_abstract_class_interface.exercise.interfac_colorable;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);

        rectangle = new Rectangle("red", true, 1.5, 4.0);
        System.out.println(rectangle);
    }
}
