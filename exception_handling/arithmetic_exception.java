package exception_handling;
import java.util.*;
public class arithmetic_exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1,n2;
		Scanner input = new Scanner(System.in);
		n1 = input.nextInt();
		n2 = input.nextInt();
		try {
			System.out.println(n1/n2);
		}
		catch(ArithmeticException e) {
			System.out.println("Divide by zero not allowed");
		}
		System.out.println("Thank You");
	}

}
