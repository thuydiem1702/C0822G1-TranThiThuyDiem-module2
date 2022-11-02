package case_study.controller;

import case_study.service.IFacilityService;
import case_study.service.impl.FacilityService;

import java.util.Scanner;

public class FacilityController {
    public void menuFacilityManagement() {

        Scanner scanner = new Scanner(System.in);
        IFacilityService iFacilityService = new FacilityService();

        do {
            System.out.println("\n QUẢN LÍ CƠ SỞ\n "
                    + "1. Hiển thị danh sách cơ sở\n "
                    + "2. Thêm mới cơ sở\n "
                    + "3. Hiển thị danh sách bảo trì cơ sở\n "
                    + "4. Trở về menu chính.");

            System.out.print("Nhập lựa chọn của bạn: ");
            int choose = Integer.parseInt(scanner.nextLine());

            switch (choose) {
                case 1:
                    iFacilityService.display();
                    break;
                case 2:
                    iFacilityService.add();
                    break;
                case 3:
                    iFacilityService.displayMaintain();
                case 4:
                    return;
                default:
                    System.out.println("Lựa chọn của bạn không có, vui lòng chọn lại!");
            }
        } while (true);
    }
}