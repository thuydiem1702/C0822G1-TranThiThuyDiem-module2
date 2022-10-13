package ss7_abstract_class_interface.exercise.interfac_colorable;

public class SquareTest {
    public static void main(String[] args) {
        Square[] squares = new Square[3];
        squares[0] = new Square();
        squares[1] = new Square(2.0);
        squares[2] = new SquareColorable(5);
        for (int i = 0; i < squares.length; i++) {
            System.out.println("Area square " + i + " is: " + squares[i].getArea());
            if (squares[i] instanceof SquareColorable) {
                System.out.println("Square has Colorable is Square " + i + ": ");
                System.out.println(" Color All Four Size");
            }
        }
    }
}
