package ss15_exception_debug.exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
    private static void calculate() {

        Triangle triangle = new Triangle();

        do {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Hãy nhập a: ");
                int a = scanner.nextInt();
                System.out.println("Hãy nhập b: ");
                int b = scanner.nextInt();
                System.out.println("Hãy nhập c: ");
                int c = scanner.nextInt();
                triangle.check(a, b, c);
                System.out.println("a b c la canh cua tam giac" + a + b + c);
                break;
            } catch (InputMismatchException e) {
                System.err.println("Hãy nhập vào số");

            } catch (IllegalTriangleException e) {
                e.printStackTrace();

            }
        }
        while (true);
    }

    public static void main(String[] args) {
        calculate();
    }
}
