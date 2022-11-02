package case_study.service.impl;

import case_study.model.Employee;
import case_study.service.IEmployeeService;
import case_study.util.MenuUtil;
import case_study.util.ReadWriteEmployeeFileUtil;
import case_study.util.RegexExceptionUtil;

import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    public static final Scanner SCANNER = new Scanner(System.in);
    public static final String PATH = "src/case_study/data/employee.csv";

    @Override
    public void edit() {
        List<Employee> employees = ReadWriteEmployeeFileUtil.readEmployeeFile(PATH);

        System.out.print("Nhập mã nhân viên cần chỉnh sửa: ");
        String idEdit = SCANNER.nextLine();

        boolean isExit = false;
        for (Employee employee : employees) {
            if (idEdit.equals(String.valueOf(employee.getId()))) {
                System.out.println("Nhân viên bạn muốn sửa: ");
                System.out.println(employee);

                do {
                    System.out.println("Chỉnh sửa thông tin nhân viên:\n" +
                            "1. Chỉnh sửa mã nhân viên.\n" +
                            "2. Chỉnh sửa tên .\n" +
                            "3. Chỉnh sửa ngày sinh.\n" +
                            "4. Chỉnh sửa giới tính.\n" +
                            "5. Chỉnh sửa số CMND.\n" +
                            "6. Chỉnh sửa số điện thoại.\n" +
                            "7. Chỉnh sửa email.\n" +
                            "8. Chỉnh sửa trình độ.\n" +
                            "9. Chỉnh sửa vị trí.\n" +
                            "10. Chỉnh sửa lương.\n" +
                            "11. Kết thúc chỉnh sửa.");

                    System.out.print("Mời bạn nhập lựa chọn: ");
                    String choose = SCANNER.nextLine();

                    switch (choose) {
                        case "1":
                            System.out.print("Nhập mã nhân viên: ");
//                            employee.setId(SCANNER.nextLine());
                            employee.setId(RegexExceptionUtil.getIdEmployee());
                            break;
                        case "2":
                            System.out.print("Nhập tên: ");
//                            employee.setName(SCANNER.nextLine());
                            employee.setName(RegexExceptionUtil.getToUpperCaseFirstWord());
                            break;
                        case "3":
                            System.out.print("Nhập ngày sinh: ");
//                            employee.setDateOfBirth(SCANNER.nextLine());
                            employee.setDateOfBirth(RegexExceptionUtil.getDateFormat());
                            break;
                        case "4":
                            System.out.print("Nhập giới tính: ");
//                            employee.setGender(SCANNER.nextLine());
                            employee.setGender(MenuUtil.getGender());
                            break;
                        case "5":
                            System.out.print("Nhập số CMND: ");
                            employee.setIdCard(SCANNER.nextLine());
                            break;
                        case "6":
                            System.out.print("Nhập số điện thoại: ");
//                            employee.setPhone(SCANNER.nextLine());
                            employee.setPhone(RegexExceptionUtil.getPhone());
                            break;
                        case "7":
                            System.out.print("Nhập email: ");
//                            employee.setEmail(SCANNER.nextLine());
                            employee.setEmail(RegexExceptionUtil.getEmail());
                            break;
                        case "8":
                            System.out.print("Nhập trình độ: ");
//                            employee.setLevel(SCANNER.nextLine());
                            employee.setLevel(MenuUtil.getLevel());
                            break;
                        case "9":
                            System.out.print("Nhập vị trí: ");
//                            employee.setPosition(SCANNER.nextLine());
                            employee.setPosition(MenuUtil.getPosition());
                            break;
                        case "10":
                            System.out.print("Nhập lương: ");
//                            employee.setSalary(Integer.parseInt(SCANNER.nextLine()));
                            employee.setSalary(RegexExceptionUtil.numbersGreaterThan0());
                            break;
                        case "11":
                            ReadWriteEmployeeFileUtil.writeEmployeeFile(PATH, employees);
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
    public void delete() {
        List<Employee> employees = ReadWriteEmployeeFileUtil.readEmployeeFile(PATH);

        boolean isExit = false;
        String idDelete;

        do {
            System.out.print("Mời bạn nhập mã nhân viên cần xóa: ");
            idDelete = SCANNER.nextLine();
            for (Employee employee : employees) {
                if (Objects.equals(idDelete, employee.getId())) {
                    System.out.println("Nhân viên cần xóa: ");
                    System.out.println(employee);
                    System.out.println("Bạn có chắc muốn xóa hay không? \n" +
                            "1. Nhấn phím '1' nếu chọn CÓ. \n" +
                            "2. Nhấn phím khác nếu chọn KHÔNG.");
                    String chooseYesNo = SCANNER.nextLine();

                    if (chooseYesNo.equals("1")) {
                        employees.remove(employee);
                        ReadWriteEmployeeFileUtil.writeEmployeeFile(PATH, employees);
                        System.out.println("Xóa nhân viên thành công!");
                    }
                    isExit = true;
                    break;
                }
            }

            try {
                if (!isExit) {
                    throw new Exception("Nhân viên không tồn tại!");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (!isExit);
    }

    @Override
    public void add() {
        List<Employee> employees = ReadWriteEmployeeFileUtil.readEmployeeFile(PATH);

        System.out.print("Nhập mã nhân viên: ");
//        String id = SCANNER.nextLine();
        String id = RegexExceptionUtil.getIdEmployee();

        System.out.print("Nhập họ tên nhân viên mới: ");
//        String name = SCANNER.nextLine();
        String name = RegexExceptionUtil.getToUpperCaseFirstWord();

        System.out.print("Nhập ngày sinh của nhân viên: ");
//        String dayOfBirth = SCANNER.nextLine();
        String dayOfBirth = RegexExceptionUtil.getDateFormat();

        System.out.print("Nhập giới tính của nhân viên: ");
//        String gender = SCANNER.nextLine();
        String gender = MenuUtil.getGender();

        System.out.print("Nhập số CMND của nhân viên: ");
        String idCard = SCANNER.nextLine();

        System.out.print("Nhập số điện thoại của nhân viên: ");
//        String phone = SCANNER.nextLine();
        String phone = RegexExceptionUtil.getPhone();

        System.out.print("Nhập email của nhân viên: ");
//        String email = SCANNER.nextLine();
        String email = RegexExceptionUtil.getEmail();

        System.out.print("Nhập trình độ của nhân viên: ");
//        String level = SCANNER.nextLine();
        String level = MenuUtil.getLevel();

        System.out.print("Nhập vị trí của nhân viên: ");
//        String position = SCANNER.nextLine();
        String position = MenuUtil.getPosition();

        System.out.print("Nhập lương của nhân viên: ");
//        int salary = Integer.parseInt(SCANNER.nextLine());
        int salary = RegexExceptionUtil.numbersGreaterThan0();

        employees.add(new Employee(id, name, dayOfBirth, gender, idCard, phone, email, level, position, salary));
        ReadWriteEmployeeFileUtil.writeEmployeeFile(PATH, employees);
        System.out.println("Thêm mới nhân viên thành công!");

    }

    @Override
    public void display() {
        List<Employee> employees = ReadWriteEmployeeFileUtil.readEmployeeFile(PATH);
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
