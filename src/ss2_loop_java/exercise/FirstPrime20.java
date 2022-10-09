package ss2_loop_java.exercise;

import java.util.Scanner;

public class FirstPrime20 {
    public static boolean check(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter prime = ");
        int n = scanner.nextInt();
        System.out.print(n + " prime is : ");
        int count = 0;
        int i = 2;
        while (count < n) {
            if (check(i)) {
                System.out.print(i + " ");
                count++;
            }
            i++;
        }
    }
}
