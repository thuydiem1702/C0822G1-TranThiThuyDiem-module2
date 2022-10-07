package ss3_array_java.exercise;

import java.util.Scanner;

public class Char {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chuỗi: ");
        String string = scanner.nextLine();

        System.out.print("String: " + string);

        System.out.print("Nhập ký tự cần đếm : ");
        char character = scanner.nextLine().charAt(0);
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (character == string.charAt(i)) {
                count++;
            }
        }
        System.out.print("tổng số ký tự trong chuỗi: " + count);
    }
}
