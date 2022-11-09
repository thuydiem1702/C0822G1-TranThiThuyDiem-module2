package exercise;

import java.util.Arrays;
import java.util.Scanner;

public class _6_mang_con {
    public static boolean test(int[] arr, int[] arr1) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[j] == arr[i]) {
                    count++;
                }
            }
        }
        if (count == arr1.length) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        do {
            System.out.print("===Nhập độ dài của mảng: ");
            size = Integer.parseInt(scanner.nextLine());
            if (size <= 0) {
                System.out.println("Độ dài của mảng không phù hợp, vui lòng nhập lại!!! ");
            }

        } while (size <= 0);

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            arr[i] = Integer.parseInt(scanner.nextLine());
        }

        int size1;
        do {
            System.out.print("===Nhập độ dài của mảng: ");
            size1 = Integer.parseInt(scanner.nextLine());
            if (size1 <= 0) {
                System.out.println("Độ dài của mảng không phù hợp, vui lòng nhập lại!!! ");
            }

        } while (size1 <= 0);

        int[] arr1 = new int[size1];
        for (int i = 0; i < size1; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            arr1[i] = Integer.parseInt(scanner.nextLine());
        }

        System.out.println("Mảng đầu tiên là: " + Arrays.toString(arr));
        System.out.println("Mảng thứ hai là: " + Arrays.toString(arr1));

        if (test(arr, arr1)) {
            System.out.println("Mảng thứ 2 là con của mảng thứ nhất: " + true);
        } else {
            System.out.println("Mảng thứ 2 không phải là con của mảng thứ nhất: " + false);
        }
    }
}
