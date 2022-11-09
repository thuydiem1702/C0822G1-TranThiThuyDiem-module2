package exercise;

import java.util.Arrays;
import java.util.Scanner;

public class _4_tb_cong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        do {
            System.out.print("Nhập độ dài của mảng: ");
            size = Integer.parseInt(scanner.nextLine());
            if (size <= 0 || size > 50) {
                System.out.print("Độ dài không cho phép nhỏ hơn 0 và dài quá 50: ");
            }

        } while (size <= 0 || size > 50);

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + " : ");
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Mảng bạn vừa nhập là: " + Arrays.toString(arr));

        int sum = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0 && arr[i] % 2 == 0) {
                sum += arr[i];
                count++;
            }
        }
        if (count > 0) {
            int average = sum / count;
            System.out.println("Trung bình cộng của só chẵn tại vị trí lẻ trong mảng là: " + average);
        } else {
            System.out.print("Mảng không có số chẵn ở trị trí lẻ");
        }
    }
}
