package exercise;

import java.util.Arrays;
import java.util.Scanner;

public class _2_so_lan_xuat_hien {
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
        countFreq(arr, size);
    }

    public static void countFreq(int[] arr, int size) {
        boolean[] array = new boolean[size];
        for (int i = 0; i < size; i++) {
            if (array[i]) {
                continue;
            }

            int count = 0;
            for (int j = i; j < size; j++) {
                if (arr[i] == arr[j]) {
                    array[j] = true;
                    count++;
                }
            }

            System.out.println(arr[i] + " xuất hiện " + count + " lần");
        }
    }
}
