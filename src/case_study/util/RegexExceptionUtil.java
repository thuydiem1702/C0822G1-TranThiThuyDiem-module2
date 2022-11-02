package case_study.util;

import java.util.Scanner;

public class RegexExceptionUtil {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static String getEmail() {
        String email;
        while (true) {
            try {
                email = SCANNER.nextLine();
                if (!email.matches("^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]{2,}(\\.[A-Za-z0-9]{2,}){1,2}$")) {
                    throw new Exception("Sai định dạng email, vui lòng nhập lại!");
                }

                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        return email;
    }

    private static boolean isLeapYear(int year) {
        boolean isDivisible4 = year % 4 == 0;
        boolean isDivisible100 = year % 100 == 0;
        boolean isDivisible400 = year % 400 == 0;

        return (isDivisible4 && !isDivisible100) || isDivisible400;
    }

    public static String getDateFormat() {
        String dateOfBirth;
        while (true) {
            try {
                dateOfBirth = SCANNER.nextLine();
                if (!dateOfBirth.matches("(0[1-9]|[12]\\d|3[0-1])/(0[1-9]|1[0-2])/(19|20)\\d{2}")) {
                    throw new Exception("Vui lòng nhập đúng định dạng dd/mm/yyyy!");
                }

                String[] str = dateOfBirth.split("/");
                if (str[1].equals("04") || str[1].equals("06") || str[1].equals("09") || str[1].equals("11")) {
                    if (Integer.parseInt(str[0]) > 30) {
                        throw new Exception("Vui lòng nhập đúng số ngày trong tháng (tháng này có tối đa 30 ngày)!");
                    }
                } else if (str[1].equals("02")) {
                    if (isLeapYear(Integer.parseInt(str[2]))) {
                        if (Integer.parseInt(str[0]) > 29) {
                            throw new Exception("Vui lòng nhập đúng số ngày trong tháng (tháng 2 có tối đa 29 ngày vì là năm nhuận)!");
                        }
                    } else {
                        if (Integer.parseInt(str[0]) > 28) {
                            throw new Exception("Vui lòng nhập đúng số ngày trong tháng (tháng 2 có tối đa 28 ngày)!");
                        }
                    }
                }

                return dateOfBirth;

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static int numbersGreaterThan0() {
        int number;
        while (true) {
            try {
                number = Integer.parseInt(SCANNER.nextLine());
                if (number <= 0) {
                    throw new Exception("Giá trị nhập vào phải lớn hơn 0, vui lòng nhập lại!");
                }

                break;
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số!");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        return number;
    }

    public static String getToUpperCaseFirstWord() {
        String str;
        while (true) {
            try {
                str = SCANNER.nextLine();
                if (!str.matches("^([A-Z][a-z]+ )+[A-Z][a-z]*$")) {
                    throw new Exception("Phải viết hoa những chữ cái đầu, vui lòng nhập lại!");
                }

                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        return str;
    }

    public static String getIdCustomer() {
        String str;
        while (true) {
            try {
                str = SCANNER.nextLine();
                if (!str.matches("^C\\d{4}$")) {
                    throw new Exception("Mã vừa nhập không phù hợp,vui lòng mã nhập vào phải bắt đầu là chữ C và sau đó là 4 số từ 0-9");
                }

                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return str;
    }

    public static String getIdEmployee() {
        String str;
        while (true) {
            try {
                str = SCANNER.nextLine();
                if (!str.matches("^E\\d{3}$")) {
                    throw new Exception("Mã vừa nhập không phù hợp,vui lòng mã nhập vào phải bắt đầu là chữ  và sau đó là 3 số từ 0-9");
                }

                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return str;
    }

    public static String getPhone() {
        String str;
        while (true) {
            try {
                str = SCANNER.nextLine();
                if (!str.matches("^\\d{10}$")) {
                    throw new Exception("Số điện thoại nhập vào không hợp lệ, vui lòng nhập lại!");
                }

                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return str;
    }
}
