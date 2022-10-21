package ss13_search_algorithm.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    int binarySearch(int[] arr, int left, int right, int value) {
        if (right >= left) {
            int middle = (left + right) / 2;
            if (arr[middle] == value) {
                return middle;
            }
            if (arr[middle] > value) {
                return binarySearch(arr, left, middle - 1, value);
            }
            return binarySearch(arr, middle + 1, right, value);
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinarySearch binarySearch = new BinarySearch();

        System.out.print("Nhập số phần tử của mảng: ");
        int size = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[size];

        System.out.println("Nhập các phần tử của mảng: ");
        for (int i = 0; i < size; i++) {
            System.out.printf("arr[%s] = ", i);
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Mảng nhập vào : " + Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println("Mảng đã được sắp xếp: " + Arrays.toString(arr));

        System.out.print("Nhập phần tử muốn tìm vị trí : ");
        int num = Integer.parseInt(scanner.nextLine());
        int result = binarySearch.binarySearch(arr, 0, arr.length - 1, num);
        if (result == -1) {
            System.out.println("Phần tử không tồn tại trong mảng !!!");
        } else {
            System.out.println("Phần tử được tìm thấy tại vị trí : " + result);
        }
    }
}

