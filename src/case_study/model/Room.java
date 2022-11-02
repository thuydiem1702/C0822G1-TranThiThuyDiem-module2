package case_study.model;

public class Room extends Facility {
    private String freeServiceIncluded;

    public Room() {
    }

    public Room(String serviceId, String serviceName, double usableArea, int rentalCosts,
                int maxNumberOfPeople, String rentalType, String freeServiceIncluded) {
        super(serviceId, serviceName, usableArea, rentalCosts, maxNumberOfPeople, rentalType);
        this.freeServiceIncluded = freeServiceIncluded;
    }

    public String getFreeServiceIncluded() {
        return freeServiceIncluded;
    }

    public void setFreeServiceIncluded(String freeServiceIncluded) {
        this.freeServiceIncluded = freeServiceIncluded;
    }

    @Override
    public String toString() {
        return super.toString() + "Room " +
                "Dịch vụ miễn phí đi kèm: '" + freeServiceIncluded + '\'';
    }

    @Override
    public String getInfor() {
        return String.format("%s,%s,%s,%s,%s,%s,%s\n", this.getServiceId(), this.getServiceName(), this.getUsableArea(),
                this.getRentalCosts(), this.getMaxNumberOfPeople(), this.getRentalType(), this.getFreeServiceIncluded());
    }
}
