package ss12_java_collection_framework.exercise.controller;

import ss12_java_collection_framework.exercise.service.ProductService;

import java.util.Scanner;

public class MainProduct {
    private static ProductService productService = new ProductService();

    public static void displayMainMenu() {
        boolean flag = true;
        do {
            System.out.println("System Functions" +
                    "\n 1.Add" +
                    "\n 2.Edit" +
                    "\n 3.Delete" +
                    "\n 4.Display" +
                    "\n 5.SearchName" +
                    "\n 6.SortCost" +
                    "\n 7. Exit");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Chọn chức năng");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("Chức năng thêm sản phẩm");
                    productService.add();
                    break;
                case 2:
                    System.out.println("Chức năng sửa thông tin sản phẩm theo id");
                    productService.edit();
                    break;
                case 3:
                    System.out.println("Chức năng xoá sản phẩm theo id");

                    productService.delete();
                    break;
                case 4:
                    System.out.println("Chức năng hiển thị danh sách sản phẩm");
                    productService.display();
                    break;
                case 5:
                    System.out.println("Chức năng tìm kiếm sản phẩm theo tên");
                    System.out.println(" Nhập tên cần tìm ");
                    String name = scanner.nextLine();
                    productService.searchByName(name);
                    break;
                case 6:
                    System.out.println("Chức năng sắp xếp sản phẩm tăng dần theo giá");
                    productService.sort();
                    break;
                default:
                    flag = false;
            }
        } while (flag);
    }
}
