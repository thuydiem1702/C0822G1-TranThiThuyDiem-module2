package case_study.service.impl;

import case_study.model.Customer;
import case_study.service.ICustomerService;
import case_study.util.MenuUtil;
import case_study.util.ReadWriteCustomerFileUtil;
import case_study.util.RegexExceptionUtil;

import java.util.List;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    public static final Scanner SCANNER = new Scanner(System.in);
    public static final String PATH = "src/case_study/data/customer.csv";

    @Override
    public void edit() {
        List<Customer> customers = ReadWriteCustomerFileUtil.readCustomerFile(PATH);

        System.out.print("Nhập mã khách hàng cần chỉnh sửa: ");
        String idEdit = SCANNER.nextLine();

        boolean isExit = false;
        for (Customer customer : customers) {
            if (idEdit.equals(String.valueOf(customer.getId()))) {
                System.out.println("Khách hàng bạn muốn sửa: ");
                System.out.println(customer);

                do {
                    System.out.println("Chỉnh sửa thông tin khách hàng:\n" +
                            "1. Chỉnh sửa mã nhân viên.\n" +
                            "2. Chỉnh sửa tên.\n" +
                            "3. Chỉnh sửa ngày sinh.\n" +
                            "4. Chỉnh sửa giới tính.\n" +
                            "5. Chỉnh sửa số CMND.\n" +
                            "6. Chỉnh sửa số điện thoại.\n" +
                            "7. Chỉnh sửa email.\n" +
                            "8. Chỉnh sửa loại khách.\n" +
                            "9. Chỉnh sửa địa chỉ.\n" +
                            "10. Kết thúc chỉnh sửa.");

                    System.out.print("Mời bạn nhập lựa chọn: ");
                    String choose = SCANNER.nextLine();

                    switch (choose) {
                        case "1":
                            System.out.print("Nhập mã khách hàng: ");
//                            customer.setId(SCANNER.nextLine());
                            customer.setId(RegexExceptionUtil.getIdCustomer());
                            break;
                        case "2":
                            System.out.print("Nhập tên: ");
//                            customer.setName(SCANNER.nextLine());
                            customer.setName(RegexExceptionUtil.getToUpperCaseFirstWord());
                            break;
                        case "3":
                            System.out.print("Nhập ngày sinh: ");
//                            customer.setDateOfBirth(SCANNER.nextLine());
                            customer.setDateOfBirth(RegexExceptionUtil.getDateFormat());
                            break;
                        case "4":
                            System.out.print("Nhập giới tính: ");
//                            customer.setGender(SCANNER.nextLine());
                            customer.setGender(MenuUtil.getGender());
                            break;
                        case "5":
                            System.out.print("Nhập số CMND: ");
                            customer.setIdCard(SCANNER.nextLine());
                            break;
                        case "6":
                            System.out.print("Nhập số điện thoại: ");
//                            customer.setPhone(SCANNER.nextLine());
                            customer.setPhone(RegexExceptionUtil.getPhone());
                            break;
                        case "7":
                            System.out.print("Nhập email: ");
//                            customer.setEmail(SCANNER.nextLine());
                            customer.setEmail(RegexExceptionUtil.getEmail());
                            break;
                        case "8":
                            System.out.print("Nhập loại khách: ");
//                            customer.setCustomerType(SCANNER.nextLine());
                            customer.setCustomerType(MenuUtil.getCustomerType());
                            break;
                        case "9":
                            System.out.print("Nhập địa chỉ: ");
                            customer.setAddress(SCANNER.nextLine());
                            break;
                        case "10":
                            ReadWriteCustomerFileUtil.writeCustomerFile(PATH, customers);
                            System.out.println("Chỉnh sửa thành công!");
                            return;
                        default:
                            System.out.println("Lựa chọn của bạn không có, vui lòng chọn lại!");
                    }
                } while (true);
            }
        }
        if (!isExit) {
            System.out.println("Không tìm thấy!");
        }

    }

    @Override
    public void add() {
        List<Customer> customers = ReadWriteCustomerFileUtil.readCustomerFile(PATH);

        System.out.print("Nhập mã khách hàng: ");
//        String id = SCANNER.nextLine();
        String id = RegexExceptionUtil.getIdCustomer();

        System.out.print("Nhập họ tên khách hàng: ");
//        String name = SCANNER.nextLine();
        String name = RegexExceptionUtil.getToUpperCaseFirstWord();

        System.out.print("Nhập ngày sinh của khách hàng: ");
//        String dayOfBirth = SCANNER.nextLine();
        String dayOfBirth = RegexExceptionUtil.getDateFormat();

        System.out.print("Nhập giới tính của khách hàng: ");
//        String gender = SCANNER.nextLine();
        String gender = MenuUtil.getGender();

        System.out.print("Nhập số CMND của khách hàng: ");
        String idCard = SCANNER.nextLine();

        System.out.print("Nhập số điện thoại của khách hàng: ");
//        String phone = SCANNER.nextLine();
        String phone = RegexExceptionUtil.getPhone();

        System.out.print("Nhập email của khách hàng: ");
//        String email = SCANNER.nextLine();
        String email = RegexExceptionUtil.getEmail();

        System.out.print("Nhập loại khách hàng: ");
//        String customerType = SCANNER.nextLine();
        String customerType = MenuUtil.getCustomerType();

        System.out.print("Nhập địa chỉ của khách hàng: ");
        String address = SCANNER.nextLine();

        customers.add(new Customer(id, name, dayOfBirth, gender, idCard, phone, email, customerType, address));
        ReadWriteCustomerFileUtil.writeCustomerFile(PATH, customers);
        System.out.println("Thêm mới khách hàng thành công!");

    }

    @Override
    public void display() {
        List<Customer> customers = ReadWriteCustomerFileUtil.readCustomerFile(PATH);
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
}
