public class OutOfBound {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]);
        } catch (Exception e) {
            System.out.println("Exception type: " + e +"  "+ "Exception caught: Array index out of bounds.");
        } finally {
            System.out.println("Finished array access.");
        }
    }
}

