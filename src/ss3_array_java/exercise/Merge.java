package ss3_array_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Merge {
    public static void main(String[] args) {
        System.out.print("Nhập mảng 1 có độ dài m = ");
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int[] arr1 = new int[m];

        for (int i = 0; i < m; i++) {
            System.out.print("Nhập vào a[" + i + "]: ");
            arr1[i] = scanner.nextInt();
        }
        System.out.println();
        System.out.print("Nhập mảng 2 có độ dài n = ");
        int n = scanner.nextInt();
        int[] arr2 = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập vào a[" + i + "]: ");
            arr2[i] = scanner.nextInt();
        }
        System.out.println();
        int[] array = new int[m + n];

        for (int i = 0; i < m; i++) {
            array[i] = arr1[i];
        }

        for (int i = 0; i < n; i++) {
            array[i + m] = arr2[i];
        }
        System.out.println(Arrays.toString(array));
    }
}
