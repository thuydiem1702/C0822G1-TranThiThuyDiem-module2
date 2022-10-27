package ss17_io_binary2.exercise.utils;

import ss17_io_binary2.exercise.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteProductFileUtil {
    public static List<Product> readProductFile(String path) {
        List<Product> productList = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream("src\\ss17_io_binary2\\exercise\\data\\product.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            productList = (List<Product>) ois.readObject();
            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return productList;
    }

    public static void writeProductFile(String path, List<Product> productManagenmentList) {
        try {
            FileOutputStream fos = new FileOutputStream("src\\ss17_io_binary2\\exercise\\data\\product.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(productManagenmentList);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
