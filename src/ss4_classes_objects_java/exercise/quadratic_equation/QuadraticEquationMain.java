package ss4_classes_objects_java.exercise.quadratic_equation;

import java.util.Scanner;

public class QuadraticEquationMain {
    public static void main(String[] args) {
        QuadraticEquation quadraticEquation = new QuadraticEquation();
        Scanner scanner = new Scanner(System.in);
        System.out.println(" enter your a number  : ");
        double a = scanner.nextDouble();
        System.out.println(" enter your b number : ");
        double b = scanner.nextDouble();
        System.out.println(" enter your c number: ");
        double c = scanner.nextDouble();
        quadraticEquation.setA(a);
        quadraticEquation.setB(b);
        quadraticEquation.setC(c);
        System.out.println(" result : " + quadraticEquation.getDiscriminant());
        if (quadraticEquation.getDiscriminant() >= 0) {
            System.out.println("result number 1: " + quadraticEquation.getRoot1() + "\n result number 2 : " + quadraticEquation.getRoot2());
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println("result number 1 : " + quadraticEquation.getRoot1() + "\n result number 2 : " + quadraticEquation.getRoot2());
        } else {
            System.out.println(" The equation has no roots");
        }
    }
}
