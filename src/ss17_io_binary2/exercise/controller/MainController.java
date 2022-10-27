package ss17_io_binary2.exercise.controller;

import ss17_io_binary2.exercise.exception.DuplicateIDException;
import ss17_io_binary2.exercise.model.Product;
import ss17_io_binary2.exercise.service.IProductService;
import ss17_io_binary2.exercise.service.impl.ProductService;
import ss17_io_binary2.exercise.utils.ReadWriteProductFileUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainController {
    public static void menuController() throws DuplicateIDException {
        String path = "src\\ss17_io_binary2\\exercise\\data\\product.dat";
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "Kẹo", "Nhật Bản", 200000));
        productList.add(new Product(2, "Kem", "Hàn Quốc", 200000));
        productList.add(new Product(3, "Sữa", "Italia", 200000));
        productList.add(new Product(4, "Bánh", "Mỹ", 200000));
        productList.add(new Product(5, "Bơ", "Việt Nam", 200000));
        ReadWriteProductFileUtil.writeProductFile(path, productList);
        Scanner scanner = new Scanner(System.in);
        IProductService iProductService = new ProductService();
        do {
            System.out.println("QUẢN LÍ SẢN PHẨM\n " +
                    "1. Thêm mới sản phẩm\n" +
                    " 2. Hiển thị danh sách sản phẩm\n" +
                    " 3. Tìm kiếm thông tin sản phẩm\n" +
                    " 4. Thoát.");
            int choose = 0;
            try {
                System.out.print("Nhập lựa chọn của bạn: ");
                choose = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số!");
            }
            switch (choose) {
                case 1:
                    iProductService.add();
                    break;
                case 2:
                    iProductService.display();
                    break;
                case 3:
                    iProductService.find();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn của bạn không có, vui lòng nhập lại!");
            }
        } while (true);
    }
}
