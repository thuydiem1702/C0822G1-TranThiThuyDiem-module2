package ss17_io_binary2.exercise.service.impl;

import ss17_io_binary2.exercise.exception.DuplicateIDException;
import ss17_io_binary2.exercise.model.Product;
import ss17_io_binary2.exercise.service.IProductService;
import ss17_io_binary2.exercise.utils.ReadWriteProductFileUtil;

import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final String PATH = "src\\ss17_io_binary\\exercise\\data\\product.dat";


    @Override
    public void add() {
        List<Product> productList = ReadWriteProductFileUtil.readProductFile(PATH);

        int id;
        while (true) {
            try {
                System.out.print("Nhập id: ");
                id = Integer.parseInt(SCANNER.nextLine());
                for (Product product : productList) {
                    if (product.getId() == id) {
                        throw new DuplicateIDException("Trùng id, vui lòng nhập lại!");
                    }
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số!");
            } catch (DuplicateIDException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.print("Nhập tên sản phẩm: ");
        String name = SCANNER.nextLine();

        System.out.print("Nhập hãng sản xuất: ");
        String manufacturer = SCANNER.nextLine();

        int price;
        while (true) {
            try {
                System.out.print("Nhập giá sản phẩm(VND): ");
                price = Integer.parseInt(SCANNER.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số!");
            }
        }
        productList.add(new Product(id, name, manufacturer, price));
        ReadWriteProductFileUtil.writeProductFile(PATH, productList);
        System.out.println("Thêm sản phẩm thành công!");
    }


    @Override
    public void display() {
        List<Product> productList = ReadWriteProductFileUtil.readProductFile(PATH);
        System.out.println("Danh sách sản phẩm: ");
        for (Product product : productList) {
            System.out.println(product);
        }
    }


    @Override
    public void find() {
        List<Product> productList = ReadWriteProductFileUtil.readProductFile(PATH);
        System.out.print("Nhập tên sản phẩm cần tìm: ");
        String nameFind = SCANNER.nextLine();
        boolean isExit = false;

        for (Product product : productList) {
            if (product.getName().contains(nameFind)) {
                System.out.println(product);
                isExit = true;
            }
        }
        if (!isExit) {
            System.out.println("Không tìm thấy sản phẩm!");
        }
    }
}
