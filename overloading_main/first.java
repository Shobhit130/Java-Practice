//package overloading_main;
//
//public class first {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		//goto - Run->Run Configurations->Arguments
//		//write some strings and that will be passed
//		//tp main method
//		for(int i=0;i<args.length;i++) {
//			System.out.println(args[i] + " ");
//		}
//		
//		//calling the overloaded static main method
//		first.main(2, 3);
//		
//	}
//	
//	//overloading main method which is static in JAVA
//	//as static methods can be overloaded
//	public static void main(int a,int b) {
//		System.out.println(a+b);
//	}
//	
//}
package overloading_main;
import java.util.*;
public class first {

	public static void main(String[] args) {
		first.main();
		
	}
	public static void main() {
		Scanner input = new Scanner(System.in);
		int n;
		System.out.println("Enter the number of elements");
		n = input.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<n;i++) {
			a[i] = input.nextInt();
		}
		int p = 0,c = 0;
		for(int i=0;i<n;i++) {
			if(isPrime(a[i])) {
				p++;
			}else {
				c++;
			}
		}
		System.out.println("The number of prime numbers are "+p);
		System.out.println("The number of composite numbers are "+c);
	}
	public static boolean isPrime(int d) {
		int flag = 0;
		for(int i=2;i<=d/2;i++) {
			if(d%i==0) {
				flag =1;
				break;
			}
		}
		if(flag == 0 && d!=1) {
			return true;
		}else {
			return false;
		}
	}
	
}
