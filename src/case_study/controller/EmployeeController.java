package case_study.controller;

import case_study.service.IEmployeeService;
import case_study.service.impl.EmployeeService;

import java.util.Scanner;

public class EmployeeController {
    public void menuEmployeeManagement() {

        Scanner scanner = new Scanner(System.in);
        IEmployeeService iEmployeeService = new EmployeeService();

        do {
            System.out.println("\n QUẢN LÍ NHÂN VIÊN \n "
                    + "1. Hiển thị danh sách nhân viên.\n "
                    + "2. Thêm nhân viên mới.\n "
                    + "3. Xoá nhân viên.\n "
                    + "4. Chỉnh sửa nhân viên.\n "
                    + "5. Trở về menu chính.");

            System.out.print("Nhập lựa chọn của bạn: ");
            int choose = Integer.parseInt(scanner.nextLine());

            switch (choose) {
                case 1:
                    iEmployeeService.display();
                    break;
                case 2:
                    iEmployeeService.add();
                    break;
                case 3:
                    iEmployeeService.delete();
                    break;
                case 4:
                    iEmployeeService.edit();
                case 5:
                    return;
                default:
                    System.out.println("Lựa chọn của bạn không có, vui lòng chọn lại!");
            }
        } while (true);
    }
}
