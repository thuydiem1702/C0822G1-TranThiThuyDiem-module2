package ss3_array_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 0, 0};
        System.out.println(Arrays.toString(arr));
        Scanner scanner = new Scanner(System.in);
        int x;
        int index;

        do {
            System.out.print("Nhập vào số cần chèn: ");
            x = Integer.parseInt(scanner.nextLine());
            System.out.print("Nhập vào vị trí cần chèn: ");
            index = Integer.parseInt(scanner.nextLine());
            if (x <= -1) {
                System.out.print("Số cần chèn phải >=0,xin nhập lại!!!");
            }
            if (index >= arr.length) {
                System.out.println("Vị trí cần chèn phải nhỏ hơn độ dài mảng,xin nhập lại!!! ");
            }
        } while (x <= -1 && index >= arr.length);

        for (int i = arr.length - 1; i >= index; i--) {
            arr[i] = arr[i - 1];
            if (i == 1) {
                break;
            }
        }
        arr[index] = x;
        System.out.println(Arrays.toString(arr));
    }
}
