//package exception_handling;
//import java.util.*;
//public class throws_keyword {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		try {
//			divideByZero d = new divideByZero();
//			d.divideNumber();
//		}
//		catch(InputMismatchException e) {
//			System.out.println(e.getMessage());
//		}
//		catch(NullPointerException e) {
//			System.out.println(e.getMessage());
//		}
//		catch(ArithmeticException e){
//			System.out.println(e.getMessage());
//		}
//	}
//
//}
////throws class specifies exceptions that a method throws
////throws is used in the method whereas throw is used for throwing an exception
////it tells what all exceptions a method can possibly throw of a class
//class divideByZero{
//	private int a;
//	private int b;
//	Scanner input = new Scanner(System.in);
//	//constructor can also throw an exception
//	public divideByZero() throws InputMismatchException,NullPointerException {
////		a = 10;
////		b = 0;
//		System.out.println("Enter first number");
//		a = input.nextInt();
//		System.out.println("Enter second number");
//		b = input.nextInt();
//	}
//	public void divideNumber() throws ArithmeticException{
//		System.out.println(a/b);
//	}
//}

//nested example
package exception_handling;
import java.util.*;
public class throws_keyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			try {
				divideByZero d = new divideByZero();
				d.divideNumber();
			}
			catch(NullPointerException e) {
				System.out.println("Memory not allocated for class object");
			}
			catch(InputMismatchException e) {
				System.out.println("Please enter a number");
			}
			finally {
				System.out.println("Finally from the inner try");
			}
		}
		catch(ArithmeticException e){
			System.out.println(e.getMessage());
		}
		System.out.println("Thanks");
	}

}
//throws class specifies exceptions that a method throws
//throws is used in the method whereas throw is used for throwing an exception
//it tells what all exceptions a method of a class can possibly throw 
class divideByZero{
	private int a;
	private int b;
	Scanner input = new Scanner(System.in);
	//constructor can also throw an exception
	public divideByZero() throws InputMismatchException,NullPointerException {
//		a = 10;
//		b = 0;
		System.out.println("Enter first number");
		a = input.nextInt();
		System.out.println("Enter second number");
		b = input.nextInt();
	}
	public void divideNumber() throws ArithmeticException{
		if(b == 0) {
			throw new ArithmeticException("Divide by zero not allowed");
		}
		System.out.println(a/b);
	}
}

