package case_study.model;

public abstract class Facility {
    private String serviceId;
    private String serviceName;
    private double usableArea;
    private int rentalCosts;
    private int maxNumberOfPeople;
    private String rentalType;

    public Facility() {
    }

    public Facility(String serviceId, String serviceName, double usableArea, int rentalCosts,
                    int maxNumberOfPeople, String rentalType) {
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.usableArea = usableArea;
        this.rentalCosts = rentalCosts;
        this.maxNumberOfPeople = maxNumberOfPeople;
        this.rentalType = rentalType;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(double usableArea) {
        this.usableArea = usableArea;
    }

    public int getRentalCosts() {
        return rentalCosts;
    }

    public void setRentalCosts(int rentalCosts) {
        this.rentalCosts = rentalCosts;
    }

    public int getMaxNumberOfPeople() {
        return maxNumberOfPeople;
    }

    public void setMaxNumberOfPeople(int maxNumberOfPeople) {
        this.maxNumberOfPeople = maxNumberOfPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    public abstract String getInfor();

    @Override
    public String toString() {
        return "Resort " +
                "Mã dịch vụ: '" + serviceId + '\'' +
                ", Tên dịch vụ: '" + serviceName + '\'' +
                ", Diện tích sử dụng: " + usableArea +
                ", Chi phí thuê: " + rentalCosts +
                ", Số lượng người tối đa: " + maxNumberOfPeople +
                ", Kiểu thuê: '" + rentalType + '\'';
    }
}
