package ss3_array_java.exercise;

import java.util.Scanner;

public class Sum_diagonal_line {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m;

        do {
            System.out.print("Nhập vào cạnh : ");
            m = Integer.parseInt(scanner.nextLine());
            if (m <= 0) {
                System.out.print("Độ dài cạnh phải >0,xin nhập lại!");
            }
        } while (m <= 0);
        int[][] arr = new int[m][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Nhập vào a[" + i + "][" + j + "]: ");
                arr[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("%2d", arr[i][j]);
            }
            System.out.println();
        }
        int sum = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if (i == j || i + j == m - 1) {
                    sum += arr[i][j];
                }
            }
        }
        System.out.println("tổng của các số ở đường chéo chính là " + sum);
    }
}

