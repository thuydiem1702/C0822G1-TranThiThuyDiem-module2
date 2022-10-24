package ss14_sort_algorithm.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class IllustrationInsertionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng : ");
        int size = Integer.parseInt(scanner.nextLine());
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("array[%d] = ", i);
            array[i] = Integer.parseInt(scanner.nextLine());
        }

        System.out.println("Mảng vừa tạo : " + Arrays.toString(array));

        int x;
        int pos;

        for (int i = 1; i < array.length; i++) {
            x = array[i];
            pos = i;

            while (pos > 0 && x < array[pos - 1]) {
                array[pos] = array[pos - 1];
                pos--;
                System.out.println(Arrays.toString(array));
            }
            array[pos] = x;
//            for (pos = i - 1; pos >= 0 && array[pos] > x; pos--) {
//                array[pos + 1] = array[pos];
//            }
//            array[pos + 1] = x;
        }
        System.out.println("Mảng được sắp xếp : " + Arrays.toString(array));
    }
}
