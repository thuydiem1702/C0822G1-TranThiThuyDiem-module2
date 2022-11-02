package case_study.model;

public class Customer extends Person {
    private String customerType;
    private String address;

    public Customer() {
    }

    public Customer(String id, String name, String dateOfBirth,
                    String gender, String idCard, String phone, String email, String customerType, String address) {
        super(id, name, dateOfBirth, gender, idCard, phone, email);
        this.customerType = customerType;
        this.address = address;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return super.toString() + "Customer " + " Loại khách: '" + customerType + '\'' + ", Địa chỉ: '" + address + '\'';
    }

    @Override
    public String getInfor() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s\n", this.getId(), this.getName(), this.getDateOfBirth(),
                this.getGender(), this.getIdCard(), this.getPhone(),
                this.getEmail(), this.getCustomerType(), this.getAddress());
    }
}
