package ss1_introduction_java.exercise;

import java.util.Scanner;

public class MoneyChange {
    public static void main(String[] args) {
        double vnd = 23000;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mời bạn nhập số tiền USD : ");
        double usd = Double.parseDouble(scanner.nextLine());
        double exchange = usd * vnd;
        System.out.print("Số tiền VND: " + exchange + "VNĐ");
    }
}
