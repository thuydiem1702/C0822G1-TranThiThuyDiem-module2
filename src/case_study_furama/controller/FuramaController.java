package case_study_furama.controller;

import java.util.Scanner;

public class FuramaController {
    public static void displayMainMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Employee Management");
        System.out.println("2. Customer Management");
        System.out.println("3. Facility Management");
        System.out.println("4. Booking Management");
        System.out.println("5. Promotion Management");
        System.out.println("6. Exit");
        System.out.println("Enter your choice: ");
        while (true) {
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("1. Display list employees");
                    System.out.println("2. Add new employee");
                    System.out.println("3. Delete employee");
                    System.out.println("4. Edit employee");
                    System.out.println("5. Return main menu");
                    System.out.println("Nhập số");
                    choice = sc.nextInt();
                    if (choice == 5) {
                        displayMainMenu();
                    }
                    break;
                case 2:
                    System.out.println("1. Display list customers");
                    System.out.println("2. Add new customer");
                    System.out.println("3. Edit customer");
                    System.out.println("4. Return main menu");
                    System.out.println("Nhập số");
                    choice = sc.nextInt();
                    if (choice == 4) {
                        displayMainMenu();
                    }
                    break;
                case 3:
                    System.out.println("1. Display list facility");
                    System.out.println("2. Add new facility");
                    System.out.println("3. Display list facility maintenance");
                    System.out.println("4. Return main menu");
                    System.out.println("Nhập số");
                    choice = sc.nextInt();
                    if (choice == 4) {
                        displayMainMenu();
                    }
                    break;
                case 4:
                    System.out.println("1. Add new booking");
                    System.out.println("2. Display list booking");
                    System.out.println("3. Return main menu");
                    System.out.println("Nhập số");
                    choice = sc.nextInt();
                    if (choice == 3) {
                        displayMainMenu();
                    }
                    break;
                case 5:
                    System.out.println("1. Display list customers use service");
                    System.out.println("2. Display list customers get voucher");
                    System.out.println("3. Return main menu");
                    System.out.println("Nhập số");
                    choice = sc.nextInt();
                    if (choice == 3) {
                        displayMainMenu();
                    }
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
