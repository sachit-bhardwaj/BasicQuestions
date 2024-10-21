public class NumberFormat {
    public static void main(String[] args) {
        try {
            String str = "abc";
            int num = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("Exception caught: Invalid number format.");
        } finally {
            System.out.println("Number format check complete.");
        }
    }
}

