package case_study.controller;

import case_study.service.IPromotionService;
import case_study.service.impl.PromotionService;

import java.util.Scanner;

public class PromotionController {
    public void menuProMotionManagement() {

        Scanner scanner = new Scanner(System.in);
        IPromotionService iPromotionService = new PromotionService();

        do {
            System.out.println("\n QUẢN LÍ QUẢNG CÁO\n "
                    + "1. Hiển thị danh sách khách hàng sử dụng dịch vụ\n "
                    + "2. Hiển thị danh sách khách hàng nhận voucher\n "
                    + "3. Trở về menu chính.");

            System.out.print("Nhập lựa chọn của bạn: ");
            int choose = Integer.parseInt(scanner.nextLine());

            switch (choose) {
                case 1:
                    iPromotionService.displayUseService();
                    break;
                case 2:
                    iPromotionService.displayGetVoucher();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Lựa chọn của bạn không có, vui lòng chọn lại!");
            }
        } while (true);
    }
}
