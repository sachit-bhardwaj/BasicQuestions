public class zeroDivision {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // This will cause an ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: Division by zero is not allowed.");
        } finally{
            System.out.println("Execution of the try-catch block is completed.");
        }
        
        System.out.println("Program continues...");
    }
}

