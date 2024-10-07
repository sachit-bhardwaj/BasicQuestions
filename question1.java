public class question1 {
public static void main(String[] args) {
int num1 = 0; 
int num2 = 1;

System.out.println("Fibonacci Series up to 100:");
System.out.print(num1 + ", " + num2);

while (num2 <= 100) {
int nextNum = num1 + num2;
if (nextNum > 100) {
break;
}

System.out.print(", " + nextNum);
num1 = num2;
num2 = nextNum;
}
}
}


