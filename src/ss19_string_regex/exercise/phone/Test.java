package ss19_string_regex.exercise.phone;

public class Test {
    private static final String[] validName = new String[]{"(84)-(0978489648)", "(84)-(0962517223)"};
    private static final String[] invalidName = new String[]{"(a8)-(22222222)", "(34)-(012345678)"};

    public static void main(String[] args) {
        ValidatePhone validatePhoneNumber = new ValidatePhone();

        for (String phoneNumber : validName) {
            boolean invalid = validatePhoneNumber.validate(phoneNumber);
            System.out.println("Name is: " + phoneNumber + " is valid: " + invalid);
        }

        for (String phoneNumber : invalidName) {
            boolean invalid = validatePhoneNumber.validate(phoneNumber);
            System.out.println("Name is: " + phoneNumber + " is valid: " + invalid);
        }
    }
}
