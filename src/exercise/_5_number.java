package exercise;

import java.util.Arrays;
import java.util.Scanner;

public class _5_number {
    public static void compare(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                arr[i] = -1;
            } else if (number % 2 != 0 && arr[i] % 2 == 0) {
                arr[i] += 1;
            } else if (number % 2 == 0 && arr[i] % 2 != 0) {
                arr[i] += 1;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập độ dài của mảng: ");
        int size = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            arr[i] = Integer.parseInt(scanner.nextLine());
        }

        System.out.println("Mảng vừa nhập là: " + Arrays.toString(arr));
        System.out.print("Số muốn kiểm tra là: ");
        int num = Integer.parseInt(scanner.nextLine());
        compare(arr, num);
        System.out.println("Mảng sau khi kiểm tra là: " + Arrays.toString(arr));
    }
}
