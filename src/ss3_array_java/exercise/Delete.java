package ss3_array_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Delete {
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
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "\t");
        }
        System.out.println(Arrays.toString(arr));
        System.out.print("Nhập số cần xoá:");
        int number = scanner.nextInt();
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == number) {
                for (int d = arr[j]; d < arr.length; d++) {
                    arr[j] = arr[j + 1];
                    arr[arr.length - 1] = 0;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
