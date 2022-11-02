package case_study.controller;

import case_study.service.IBookingService;
import case_study.service.impl.BookingService;

import java.util.Scanner;

public class BookingController {
    public void menuBookingManagement() {

        Scanner scanner = new Scanner(System.in);
        IBookingService iBookingService = new BookingService();

        do {
            System.out.println("\n QUẢN LÍ ĐẶT CHỖ\n "
                    + "1. Thêm mới đặt chỗ.\n "
                    + "2. Hiển thị danh sách đặt chỗ.\n "
                    + "3. Trở về menu chính.");

            System.out.print("Nhập lựa chọn của bạn: ");
            int choose = Integer.parseInt(scanner.nextLine());

            switch (choose) {
                case 1:
                    iBookingService.add();
                    break;
                case 2:
                    iBookingService.display();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Lựa chọn của bạn không có, vui lòng chọn lại!");
            }
        } while (true);
    }
}
