package case_study.controller;

import case_study.util.RegexExceptionUtil;

import java.util.Scanner;

public class FuramaController {
    public static void displayMainMenu() {
        EmployeeController employeeController = new EmployeeController();
        CustomerController customerController = new CustomerController();
        FacilityController facilityController = new FacilityController();
        BookingController bookingController = new BookingController();
        PromotionController promotionController = new PromotionController();

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("\n ỨNG DỤNG QUẢN LÍ KHU NGHĨ DƯỠNG FURAMA:\n"
                    + "1. Quản lí nhân viên.\n"
                    + "2. Quản lí khách hàng.\n"
                    + "3. Quản lí cơ sở.\n"
                    + "4. Quản lí đặt chỗ.\n"
                    + "5. Quản lí quảng cáo.\n"
                    + "6. Thoát\n");

            System.out.print("Nhập lựa chọn của bạn: ");
//            int choose = Integer.parseInt(scanner.nextLine());
            int choose = RegexExceptionUtil.numbersGreaterThan0();

            switch (choose) {
                case 1:
                    employeeController.menuEmployeeManagement();
                    break;
                case 2:
                    customerController.menuCustomerManagement();
                    break;
                case 3:
                    facilityController.menuFacilityManagement();
                    break;
                case 4:
                    bookingController.menuBookingManagement();
                    break;
                case 5:
                    promotionController.menuProMotionManagement();
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn của bạn không có, vui lòng nhập lại! ");
            }
        } while (true);
    }
}
