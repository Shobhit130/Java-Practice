package exception_handling;
import java.util.*;
public class inheritance_exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = input.nextInt();
		try {
			if(num == 2) {
				throw new number2Exception("Number 2 not allowed");
			}
			if(num == 3) {
				throw new number3Exception("Number 3 not allowed");
			}
			System.out.println("The entered number is "+num);
		}
		//A BASE CLASS CAN HANDLE CHILD CLASS EXCEPTIONS
		//shobhitException is base class for both
//		catch(shobhitException e) {
//			System.out.println(e.getMessage());
//		}
		//Exception class is base class for shobhitException
		//OR
		catch(Exception e) {
			System.out.println(e.getMessage());
			//if we also want to display our own message also we can use instanceof
			if(e instanceof number2Exception) {
				System.out.println("Please don't enter 2 again");
			}
			if(e instanceof number3Exception) {
				System.out.println("Please don't enter 3 again");
			}
		}
		System.out.println("Thanks for using our software");
	}

}
class shobhitException extends Exception{
	public shobhitException(String s) {
		super(s);
	}
}
class number2Exception extends shobhitException{
	public number2Exception(String s) {
		super(s);
	}
}
class number3Exception extends shobhitException{
	public number3Exception(String s) {
		super(s);
	}
}