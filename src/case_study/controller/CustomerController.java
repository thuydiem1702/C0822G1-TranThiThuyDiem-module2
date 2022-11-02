package case_study.controller;

import case_study.service.ICustomerService;
import case_study.service.impl.CustomerService;

import java.util.Scanner;

public class CustomerController {
    public void menuCustomerManagement() {

        Scanner scanner = new Scanner(System.in);
        ICustomerService iCustomerService = new CustomerService();

        do {
            System.out.println("\n QUẢN LÍ KHÁCH HÀNG \n "
                    + "1. Hiển thị danh sách khách hàng \n "
                    + "2. Thêm mới khách hàng \n "
                    + "3. Chỉnh sửa khách hàng \n "
                    + "4. Trở về menu chính.");

            System.out.print("Nhập lựa chọn của bạn: ");
            int choose = Integer.parseInt(scanner.nextLine());

            switch (choose) {
                case 1:
                    iCustomerService.display();
                    break;
                case 2:
                    iCustomerService.add();
                    break;
                case 3:
                    iCustomerService.edit();
                case 4:
                    return;
                default:
                    System.out.println("Lựa chọn của bạn không có, vui lòng chọn lại!");
            }
        } while (true);
    }
}
