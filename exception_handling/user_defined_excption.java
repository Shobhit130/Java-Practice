package exception_handling;
import java.util.*;
public class user_defined_excption {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		// TODO Auto-generated method stub
		int n1 = input.nextInt();
		try {
			if(n1 == 15) {
				throw new number15Exception("Number 15 not allowed");
			}
			System.out.println(n1);
		}
		catch(number15Exception e){
			System.out.println(e.getMessage());
		}

	}

}
class number15Exception extends Exception{
	public number15Exception(String s) {
		super(s);
	}
}