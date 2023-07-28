package exception_handling;
import java.util.*;
public class multiple_try_catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1,n2;
		Scanner input = new Scanner(System.in);
		try {
			n1 = input.nextInt();
			n2 = input.nextInt();
			System.out.println(n1/n2);
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage() + " not allowed");
		}
		catch(Exception e) {
			if(e instanceof InputMismatchException) {
				System.out.println(e.getMessage() + " input invalid");
			}
		}
		System.out.println("Thanks");
	}

}