package case_study_furama.service.impl;

import case_study_furama.model.Booking;
import case_study_furama.model.facility.Facility;
import case_study_furama.model.person.Customer;
import case_study_furama.service.IBookingService;
import case_study_furama.util.BookingComparator;
import case_study_furama.util.ReadAndWriteCSV;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;

public class BookingService implements IBookingService {
    private static final String PATH_FILE_VILLA = "src\\case_study_furama\\data\\Villa.csv";
    private static final String PATH_FILE_HOUSE = "src\\case_study_furama\\data\\House.csv";
    private static final String PATH_FILE_ROOM = "src\\case_study_furama\\data\\Room.csv";
    private static final String PATH_FILE_CUSTOMER = "src\\case_study_furama\\data\\Customer.csv";
    private static final String PATH_FILE = "src\\case_study_furama\\data\\Booking.csv";
    private static final Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        Set<Booking> bookingSet = ReadAndWriteCSV.readBookingtoCSV(PATH_FILE);
        if (bookingSet.isEmpty()) {
            System.out.println("Chưa có dữ liệu, mời bạn nhập thêm dữ liệu !!!");
        } else {
            for (Booking b : bookingSet) {
                System.out.println(b);
            }
        }
    }

    @Override
    public void add() {
        Set<Booking> bookingSet = new TreeSet<>(new BookingComparator());
        Set<Booking> bookingSet1 = ReadAndWriteCSV.readBookingtoCSV(PATH_FILE);
        int id = 1;
        if (!bookingSet1.isEmpty()) {
            id = bookingSet1.size() + 1;
        }

        LocalDate dateNow = LocalDate.now();
        LocalDate startDay;
        do {
            try {
                System.out.println("Nhập bắt đầu theo dd/MM/yyyy và trong 10 năm gần đây");
                String day = scanner.nextLine();
                startDay = LocalDate.parse(day, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                Period periodToNextJavaRelease = Period.between(startDay, dateNow);
                if (periodToNextJavaRelease.getYears() < 10) {
                    System.out.println("Cảm ơn bạn đã nhập dữ liệu");
                    break;
                }
                System.out.println("Bạn đã nhập sai, yêu cầu nhâp lại ");
            } catch (DateTimeParseException e) {
                System.err.println("Bạn đã nhập sai, yêu cầu nhâp lại ");
            }
        } while (true);
        LocalDate endDay;
        do {
            try {
                System.out.println("Nhập kết thúc  theo dd/MM/yyyy và trong 10 năm gần đây");
                String day = scanner.nextLine();
                endDay = LocalDate.parse(day, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                Period periodToNextJavaRelease = Period.between(endDay, dateNow);
                if (periodToNextJavaRelease.getYears() < 10) {
                    System.out.println("Cảm ơn bạn đã nhập dữ liệu");
                    break;
                }
                System.out.println("Bạn đã nhập sai, yêu cầu nhâp lại ");
            } catch (DateTimeParseException e) {
                System.err.println("Bạn đã nhập sai, yêu cầu nhâp lại ");
            }
        } while (true);


        String customer = chooseCustomer();
        String facility = chooseFacility();
        Booking booking = new Booking(id, startDay, endDay, customer, facility);
        bookingSet.add(booking);
        ReadAndWriteCSV.writeBookingtoCSV(bookingSet, PATH_FILE, true);
        System.out.println("Đã booking thành công !");
    }

    @Override
    public void edit() {

    }

    public static String chooseCustomer() {

        List<Customer> customerList = ReadAndWriteCSV.readCustomerList(PATH_FILE_CUSTOMER);
        System.out.println(" Danh sách khách hàng ");
        for (Customer customer : customerList) {
            System.out.println(customer.toString());
        }
        System.out.println(" Nhập id khách hàng cần chọn ");
        String id = scanner.nextLine();
        do {
            for (Customer customer : customerList) {
                if (id.equals(customer.getId())) {
                    System.out.println(customer);
                    return customer.toString();
                }
            }
            System.err.println(" Bạn đã nhập sai cần nhập lại id khách hàng cần chọn ");
            id = scanner.nextLine();
        } while (true);
    }

    public static String chooseFacility() {
        Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
        Map<Facility, Integer> facilityVilla = ReadAndWriteCSV.readListFacilityVillaToCSV(PATH_FILE_VILLA);
        Set<Facility> keySetV = facilityVilla.keySet();
        for (Facility key : keySetV) {
            facilityIntegerMap.put(key, facilityVilla.get(key));
        }
        Map<Facility, Integer> facilityHouse = ReadAndWriteCSV.readListFacilityHouseToCSV(PATH_FILE_HOUSE);
        Set<Facility> keySetH = facilityHouse.keySet();
        for (Facility key : keySetH) {
            facilityIntegerMap.put(key, facilityHouse.get(key));
        }

        Map<Facility, Integer> facilityRoom = ReadAndWriteCSV.readListFacilityRoomToCSV(PATH_FILE_ROOM);
        Set<Facility> keySetR = facilityRoom.keySet();
        for (Facility key : keySetR) {
            facilityIntegerMap.put(key, facilityRoom.get(key));
        }
        System.out.println(" Danh sách dịch vụ  ");
        for (Map.Entry<Facility, Integer> f : facilityIntegerMap.entrySet()) {
            System.out.println(f.getKey().toString());
        }
        System.out.println(" Nhập id dịch vụ cần chọn ");

        String id = scanner.nextLine();
        while (true) {
            for (Map.Entry<Facility, Integer> entry : facilityIntegerMap.entrySet()) {
                if (id.equals(entry.getKey().getIdService())) {
                    return entry.getKey().toString();
                }
            }
            System.err.println(" Bạn đã nhập sai !!! Nhập lại id dịch vụ cần chọn : ");
            id = scanner.nextLine();
        }
    }
}
