package exception_handling;
import java.util.*;
public class throws_keyword2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			try{
				divideZero d = new divideZero();
				d.divide();
			}
			catch(user e) {
				System.out.println(e.getMessage());
			}
			catch(InputMismatchException e) {
				System.out.println("Input Invalid");
			}
			catch(NullPointerException e) {
				System.out.println("Memory not allocated");
			}
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Thanks");
		}
	}

}
class divideZero{
	int a;
	int b;
	public divideZero() throws InputMismatchException,NullPointerException{
		Scanner input = new Scanner(System.in);
		a = input.nextInt();
		b = input.nextInt();
	}
	public void divide() throws ArithmeticException, user{
		if(a == 3) {
			throw new user("Number 3 not allowed");
		}
		System.out.println(a/b);
	}
}
class user extends Exception{
	public user(String s) {
		super(s);
	}
}