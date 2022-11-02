package case_study.model;

public class Villa extends Facility {
    private String roomStandard;
    private double poolArea;
    private int numberOfFloors;

    public Villa() {
    }

    public Villa(String serviceId, String serviceName, double usableArea, int rentalCosts, int maxNumberOfPeople,
                 String rentalType, String roomStandard, double poolArea, int numberOfFloors) {
        super(serviceId, serviceName, usableArea, rentalCosts, maxNumberOfPeople, rentalType);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return super.toString() + "Villa " +
                "Tiêu chuẩn phòng: '" + roomStandard + '\'' +
                ", Diện tích hồ bơi: " + poolArea +
                ", Số tầng: " + numberOfFloors;
    }

    @Override
    public String getInfor() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s\n", this.getServiceId(), this.getServiceName(),
                this.getUsableArea(), this.getRentalCosts(), this.getMaxNumberOfPeople(),
                this.getRentalType(), this.getRoomStandard(), this.getPoolArea(), this.getNumberOfFloors());
    }
}
