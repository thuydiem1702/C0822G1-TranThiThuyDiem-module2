package ss11_dsa_stack_queue.exercise.reverse;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class StringReserve {
    public static void main(String[] args) {
        Stack<String> stringReserve = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi bất kì: ");
        StringBuilder string = new StringBuilder(scanner.nextLine());

        String[] stringArr = string.toString().split("");
        System.out.println(Arrays.toString(stringArr));

        for (String item : stringArr) {
            stringReserve.push(item);
        }

        string = new StringBuilder();
        while (!stringReserve.isEmpty()) {
            string.append(stringReserve.pop());
        }
        System.out.println(string);
    }
}
