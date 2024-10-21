public class NullPointer {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Exception caught: Cannot access a method on a null object.");
        } finally {
            System.out.println("Null pointer example complete.");
        }
    }
}

