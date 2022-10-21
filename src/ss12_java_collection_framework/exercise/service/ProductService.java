package ss12_java_collection_framework.exercise.service;

import ss12_java_collection_framework.exercise.model.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ProductService implements IService {
    Scanner scanner = new Scanner(System.in);
    private static final ArrayList<Product> productArrayList = new ArrayList<>();

    static {
        productArrayList.add(new Product(1, "a", 2000));
        productArrayList.add(new Product(5, "d", 5000));
        productArrayList.add(new Product(3, "b", 4000));
        productArrayList.add(new Product(8, "c", 1000));
        productArrayList.add(new Product(2, "e", 3000));
    }

    @Override
    public void display() {
        for (Object s : productArrayList) {
            System.out.println(s);
        }
    }

    @Override
    public void add() {
        System.out.println("Nhập id sản phẩm");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên sản phẩm");
        String name = scanner.nextLine();
        System.out.println("Nhập gia sản phẩm");
        int cost = Integer.parseInt(scanner.nextLine());
        Product product = new Product(id, name, cost);
        // them mới dùng add()
        productArrayList.add(product);
        display();
    }

    @Override
    public void edit() {
        display();
        System.out.println(" Chọn sản phẩm cần sửa ");
        int edit = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < productArrayList.size(); i++) {
            if (edit == productArrayList.get(i).getId()) {
                System.out.println("Nhập id sản phẩm");
                productArrayList.get(i).setId(Integer.parseInt(scanner.nextLine()));
                System.out.println("Nhập tên sản phẩm");
                productArrayList.get(i).setName(scanner.nextLine());
                System.out.println("Nhập gia sản phẩm");
                productArrayList.get(i).setCost(Integer.parseInt(scanner.nextLine()));
                break;
            }
        }
        display();
    }

    @Override
    public void delete() {
        display();
        System.out.println(" Nhập id sản phẩm cần xoá ");
        int idDelete = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < productArrayList.size(); i++) {
            if (idDelete == productArrayList.get(i).getId()) {
                productArrayList.remove(i);
                break;
            }

        }
        //cach 2
//        return this.productArrayList.remove(product);

    }



    @Override
    public void searchByName(String name) {
        //cach 1
//        int count =0;
//        for (int i = 0; i < productArrayList.size(); i++) {
//            if (name.equals(productArrayList.get(i).getName())) {
//                System.out.println(" ten can tim la " + productArrayList.get(i));
//                break;
//            }else {
//               count++;
//            }
//        }if (count>0)
//            System.out.println(" ten cua ban tim ko co");
        // cach 2
        int count = 0;
        for (Product s : productArrayList) {
            if (s.getName().contains(name)) {
                System.out.println(s);
            } else {
                count++;
            }
        }if (count>0)
            System.out.println("Sản phẩm bạn tìm không có !");
    }

    @Override
    public void sort() {
        display();
        System.out.println("-----");
        productArrayList.sort(Comparator.comparing(Product::getCost));
        display();
    }


}
