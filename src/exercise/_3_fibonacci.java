package exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _3_fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập một số bất kì");
        int number = Integer.parseInt(scanner.nextLine());
        display(number);
    }

    public static void display(int number) {
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i <= number; i++) {
            if (isPrime(i) && isFibonacy(i)) {
                integers.add(i);
            }
        }
        for (Integer value : integers) {
            System.out.println(value);
        }
    }

    public static boolean isPrime(int number) {
        boolean check = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                check = false;
                break;
            }
        }
        return check;
    }

    public static boolean isFibonacy(int number) {
        int a = 1;
        int b = 1;
        boolean check = false;
        int sum;
        for (int i = 0; i <= number; i++) {
            sum = a + b;
            a = b;
            b = sum;
            if (sum == number) {
                check = true;
            }
        }
        return check;
    }
}
