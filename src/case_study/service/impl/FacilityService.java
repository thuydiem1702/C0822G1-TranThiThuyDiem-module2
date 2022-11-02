package case_study.service.impl;

import case_study.model.Facility;
import case_study.model.Room;
import case_study.model.Villa;
import case_study.service.IFacilityService;
import case_study.util.MenuUtil;
import case_study.util.ReadWriteFacilityFileUtil;

import java.util.Map;
import java.util.Scanner;

public class FacilityService implements IFacilityService {
    public static final Scanner SCANNER = new Scanner(System.in);
    public static final String PATH_VILLA = "src/case_study/data/villa.csv";
    public static final String PATH_ROOM = "src/case_study/data/room.csv";

    @Override
    public void displayMaintain() {

    }

    @Override
    public void add() {
        while (true) {
            System.out.println("Thêm cơ sở mới:\n " +
                    "1. Thêm mới biệt thự.\n " +
                    "2. Thêm mới phòng.\n " +
                    "3. Trở về menu quản lí cơ sở.");

            String choose = SCANNER.nextLine();

            switch (choose) {
                case "1":
                    Map<Facility, Integer> villaList = ReadWriteFacilityFileUtil.readFacilityFile(PATH_VILLA);

                    System.out.print("Thêm mã dịch vụ: ");
                    String serviceIdVilla = SCANNER.nextLine();

                    System.out.print("Thêm tên dịch vụ: ");
                    String serviceNameVilla = SCANNER.nextLine();

                    System.out.print("Thêm diện tích sử dụng: ");
                    Double usableAreaVilla = Double.parseDouble(SCANNER.nextLine());

                    System.out.print("Nhập chi phí thuê: ");
                    int rentalCostsVilla = Integer.parseInt(SCANNER.nextLine());

                    System.out.print("Nhập số lượng người tối đa: ");
                    int maxNumberOfPeopleVilla = Integer.parseInt(SCANNER.nextLine());

                    System.out.print("Nhập kiểu thuê: ");
//                    String rentalTypeVilla = SCANNER.nextLine();
                    String rentalTypeVilla = MenuUtil.getRentalType();

                    System.out.print("Nhập tiêu chuẩn phòng: ");
                    String roomStandardVilla = SCANNER.nextLine();

                    System.out.print("Nhập diện tích hồ bơi: ");
                    Double poolAreaVilla = Double.parseDouble(SCANNER.nextLine());

                    System.out.print("Nhập số tầng: ");
                    int numberOfFloorsVilla = Integer.parseInt(SCANNER.nextLine());

                    villaList.put(new Villa(serviceIdVilla, serviceNameVilla, usableAreaVilla,
                            rentalCostsVilla, maxNumberOfPeopleVilla, rentalTypeVilla,
                            roomStandardVilla, poolAreaVilla, numberOfFloorsVilla), 0);
                    ReadWriteFacilityFileUtil.writeFacilityFile(PATH_VILLA, villaList);
                    System.out.println("Thêm mới biệt thự thành công!");

                case "2":
                    Map<Facility, Integer> roomList = ReadWriteFacilityFileUtil.readFacilityFile(PATH_ROOM);

                    System.out.print("Thêm mã dịch vụ: ");
                    String serviceIdRoom = SCANNER.nextLine();

                    System.out.print("Thêm tên dịch vụ: ");
                    String serviceNameRoom = SCANNER.nextLine();

                    System.out.print("Thêm diện tích sử dụng: ");
                    Double usableAreaRoom = Double.parseDouble(SCANNER.nextLine());

                    System.out.print("Nhập chi phí thuê: ");
                    int rentalCostsRoom = Integer.parseInt(SCANNER.nextLine());

                    System.out.print("Nhập số lượng người tối đa: ");
                    int maxNumberOfPeopleRoom = Integer.parseInt(SCANNER.nextLine());

                    System.out.print("Nhập kiểu thuê: ");
//                    String rentalTypeRoom = SCANNER.nextLine();
                    String rentalTypeRoom = MenuUtil.getRentalType();

                    System.out.println("Nhập dịch vụ miễn phí đi kèm: ");
                    String freeServiceIncludedRoom = SCANNER.nextLine();

                    roomList.put(new Room(serviceIdRoom, serviceNameRoom, usableAreaRoom, rentalCostsRoom,
                            maxNumberOfPeopleRoom, rentalTypeRoom, freeServiceIncludedRoom), 0);
                    ReadWriteFacilityFileUtil.writeFacilityFile(PATH_ROOM, roomList);
                    System.out.println("Thêm mới phòng thành công!");

                case "3":
                    return;
                default:
                    System.out.println("Lựa chọn của bạn không có, vui lòng chọn lại!");
            }
        }
    }

    @Override
    public void display() {
        System.out.println("\nDanh sách cơ sở: ");

        System.out.println("1. Danh sách biệt thự: ");
        Map<Facility, Integer> villaList = ReadWriteFacilityFileUtil.readFacilityFile(PATH_VILLA);
        for (Facility villa : villaList.keySet()) {
            System.out.println(villa + " | Số lần sử dụng: " + villaList.get(villa));
        }

        System.out.println("2. Danh sách phòng: ");
        Map<Facility, Integer> roomList = ReadWriteFacilityFileUtil.readFacilityFile(PATH_ROOM);
        for (Facility room : roomList.keySet()) {
            System.out.println(room + " | Số lần sử dụng: " + roomList.get(room));
        }
    }
}
