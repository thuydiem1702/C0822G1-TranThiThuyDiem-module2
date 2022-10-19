package case_study_furama.model.person;

public class Employee extends Person {
    private String level;
    private String position;
    private double wage;

    public Employee() {
    }

    public Employee(String id, String name, String dateOfBirth, boolean gender, int idNumber, int phoneNumber, String email, String level, String position, double wage) {
        super(id, name, dateOfBirth, gender, idNumber, phoneNumber, email);
        this.level = level;
        this.position = position;
        this.wage = wage;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "Employee : " + super.toString() +
                "level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", wage=" + wage ;
    }
}
