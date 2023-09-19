// Step 1: Create a custom exception class
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class UserDefinedExceptionDemo {
    public static void main(String[] args) {
        try {
            // Step 2: Use the custom exception class to throw and catch exceptions
            int age = 15;
            if (age < 18) {
                throw new CustomException("Age must be 18 or older to vote.");
            } else {
                System.out.println("You are eligible to vote!");
            }
        } catch (CustomException e) {
            // Handle the custom exception
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}