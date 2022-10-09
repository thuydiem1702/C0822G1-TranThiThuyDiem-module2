package ss2_loop_java.exercise;

import java.util.Scanner;

public class PicturePrinting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1.Print the rectangle ");
        System.out.println("2.Print the square triangle  ");
        System.out.println("3.Print isosceles triangle ");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
        while (true) {
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("enter length");
                    int length = input.nextInt();
                    System.out.println("enter width ");
                    int width = input.nextInt();
                    System.out.println("Draw the rectangle");
                    for (int i = 0; i < width; i++) {
                        for (int j = 0; j < length; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Draw the square triangle");
                    System.out.println("enter length");
                    int length1 = input.nextInt();
                    for (int i = 0; i < length1; i++) {
                        for (int j = 0; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Draw the isosceles triangle");
                    System.out.println("enter length");
                    int length2 = input.nextInt();
                    for (int i = length2; i > 0; i--) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
