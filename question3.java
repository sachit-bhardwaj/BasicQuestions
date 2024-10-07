import java.util.*;

public class question3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the starting number of the range: ");
       		 int a = sc.nextInt();
        
        System.out.print("Enter the ending number of the range: ");
        	int b = sc.nextInt();

        System.out.println("Prime numbers between " + a + " and " + b + " are:");
	
        for (int i = a; i <= b; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
           	 	}
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i<=num-1; i++) {
            if (num % i == 0) {
                return false;
           	 }
        }
        return true;
   	}
}
	

