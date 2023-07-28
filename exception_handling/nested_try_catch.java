package exception_handling;
import java.util.*;
public class nested_try_catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 3;
		int num2 = 0;
		try {
			try {
				System.out.println(num1/num2);
			}
			//if a nested catch does not handle an exception
			//then it will be passed to outer catch
			catch(InputMismatchException e) {
				System.out.println("Inner InputMismatch handled here");
			}
			catch(ArithmeticException e) {
				System.out.println("inner Arithmetic exception handled here");
			}
			finally {
				System.out.println("Inner finally");
			}
		}
		catch(ArithmeticException e) {
			System.out.println("Outer Arithmetic exception handled here");
		}
		finally {
			System.out.println("Outer finally");
		}
		System.out.println("Thanks");
	}

}
