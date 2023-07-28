package exception_handling;
import java.util.*;
public class unreachable_code_error {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = input.nextInt();
		try {
			if(num == 4) {
				throw new number4exception("Number 4 not allowed");
			}
			System.out.println("The entered number is "+num);
		}
		//after this catch block we will directly go to the end of the code rather than next block
		catch(number4exception e) {
			System.out.println(e.getMessage());
		}
		catch(allExceptions e) {
			System.out.println("All exceptions");
		}
		System.out.println("Thanks");
	}

}
class allExceptions extends Exception{
	public allExceptions(String s) {
		// TODO Auto-generated constructor stub
		super(s);
	}
}
class number4exception extends allExceptions{
	public number4exception(String s) {
		// TODO Auto-generated constructor stub
		super(s);
	}
}

//output
//Enter a number
//4
//Number 4 not allowed
//Thanks