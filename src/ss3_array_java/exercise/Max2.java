package ss3_array_java.exercise;

import java.util.Scanner;

public class Max2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m;

        do {
            System.out.print("Nhập vào hàng: ");
            m = Integer.parseInt(scanner.nextLine());
            if (m <= 0) {
                System.out.print("Số lượng hàng <0,xin nhập lại!");
            }
        } while (m <= 0);
        int n;

        do {
            System.out.print("Nhập vào cột: ");
            n = Integer.parseInt(scanner.nextLine());
            if (n <= 0) {
                System.out.print("Số lượng cột <0,xin nhập lại!");
            }
        } while (n <= 0);
        int[][] arr = new int[m][n];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Nhập vào a[" + i + "][" + j + "]: ");
                arr[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%2d", arr[i][j]);
            }
            System.out.println();
        }
        int max = arr[0][0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.print("Phần tử lớn nhất là : " + max);
    }
}
