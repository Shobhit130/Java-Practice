package exception_handling;
import java.util.*;
public class inheritance_in_exceptions2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num;
		num = input.nextInt();
		try {
			if(num == 2) {
				throw new slaveException1("Number 2 not allowed");
			}
			if(num == 3) {
				throw new slaveException2("Number 3 not allowed");
			}
			System.out.println("The entered number is "+num);
		}
//		catch(slaveException1 e) {
//			System.out.println(e.getMessage());
//		}
//		catch(slaveException2 e) {
//			System.out.println(e.getMessage());
//		}
//		catch(masterException e) {
//			System.out.println(e.getMessage());
//		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			if(e instanceof slaveException1) {
				System.out.println("You entered 2.Please change");
			}
			if(e instanceof slaveException2) {
				System.out.println("You entered 3.Please change");
			}
		}
		System.out.println("Thanks");
	}

}
class masterException extends Exception{
	public masterException(String s) {
		super(s);
	}
}
class slaveException1 extends masterException{
	public slaveException1(String s) {
		super(s);
	}
}
class slaveException2 extends masterException{
	public slaveException2(String s) {
		super(s);
	}
}
