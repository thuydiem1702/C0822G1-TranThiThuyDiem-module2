package exercise;

import java.util.Scanner;

public class _1_so_nguyen_to {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so");
        int num = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < num; i++) {
            int count = 0;
            for (int j = 1; j <= num; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count != 2) {
                System.out.println(i);
            }
        }
    }
}
