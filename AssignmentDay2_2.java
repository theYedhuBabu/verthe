//create custom exception
class PhoneNumberException extends Exception {
    PhoneNumberException(String message) {
        super(message);
    }
}

// Exception with throws
class throwsExpn {
    // validation function to check the length of a phone number
    static void validate(String phone) throws PhoneNumberException {
        if (phone.length() != 13) {
            throw new PhoneNumberException("Phone number not valid");
        } else {
            System.out.println("Valid Phone Number");
        }
    }
}

public class AssignmentDay2_2 {
    public static void main(String[] args) {
        String ph = "+919809685";
        try {
            throwsExpn.validate(ph);
        } catch (PhoneNumberException e) {
            System.out.println("Exception Occured: " + e);
        } finally {
            System.out.println("Enter the details");
        }
    }
}
