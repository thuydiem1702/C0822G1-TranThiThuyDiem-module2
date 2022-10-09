package ss3_array_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Min {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        do {
            System.out.print("Nhập vào số lượng phần tử mảng: ");
            n = Integer.parseInt(scanner.nextLine());
            if (n <= 0) {
                System.out.print("Số lượng phần tử mảng phải >0,xin nhập lại!!!");
            }
        } while (n <= 0);
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhập vào a[" + i + "]: ");
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(arr));
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.print("Phần tử nhỏ nhất là : " + min);
    }
}

