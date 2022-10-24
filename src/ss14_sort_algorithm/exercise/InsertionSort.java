package ss14_sort_algorithm.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng : ");
        int size = Integer.parseInt(scanner.nextLine());
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("array[%d] = ", i);
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Mảng trước khi sắp xếp : " + Arrays.toString(array));
        System.out.println("Mảng sau khi sắp xếp : " + Arrays.toString(insertionSort(array)));
    }

    private static int[] insertionSort(int[] array) {
        int x;
        int pos;
        for (int i = 1; i < array.length; i++) {
            x = array[i];
            pos = i;

            while (pos > 0 && x < array[pos - 1]) {
                array[pos] = array[pos - 1];
                pos--;
            }

            array[pos] = x;
        }

        return array;
    }
}
