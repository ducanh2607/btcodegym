package stringandregex;

public class PhoneNumberTest {
    public static final String[] phoneNumberCheck = {"(84)-(0978489648)", "(a8)-(22222222)", "(12)-(1234567891)", "(13)-(0123456789)"};

    public static void main(String[] args) {
        PhoneNumber phoneNumber = new PhoneNumber();
        for (String phone : phoneNumberCheck){
            boolean isValid = phoneNumber.validate(phone);
            System.out.println(isValid);
        }
    }

}
