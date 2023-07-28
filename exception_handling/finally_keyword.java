package exception_handling;

public class finally_keyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 3;
		int num2 = 0;
		try {
			System.out.println(num1/num2);
		}
		catch(ArithmeticException e) {
			System.out.println("Exception is handled here");
		}
		//finally block will execute whether an exception happens or not
		//we CANNOT use finally without a try
		//we can also use finally with only a try block BUT
		//if there is an exception, that will disrupt our flow of the code
		//but finally will still be executed
		finally {
			//used for releasing any resources - closing files,closing connections
			System.out.println("This is from the finally block");
		}
		//this line won't be executed if try block is there only and an exception occurs
		System.out.println("Thanks");
		
	}

}

//output
//if exception is not there
//3
//This is from the finally block
//Thanks
//if exception is there
//Exception is handled here
//This is from the finally block
//Thanks
//if only try block is there and an exception occurs
//This is from the finally block
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//	at exception_handling.finally_keyword.main(finally_keyword.java:11)
