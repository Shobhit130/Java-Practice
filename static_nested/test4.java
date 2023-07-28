package static_nested;
import java.util.*;
public class test4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String license = input.next();
		int flag = 0;
		try {
			if(license.length()!=15) {
				flag = 1;
				throw new not_recognized_state_code("Invalid length of license number");
			}
		}
		catch(not_recognized_state_code e) {
			System.out.println(e.getMessage());
		}
		try {
			for(int i=0;i<license.length();i++) {
				if(Character.isAlphabetic(license.charAt(i))==false && Character.isDigit(license.charAt(i))==false) {
					flag = 1;
					throw new not_valid_code("License should contain digits and alphabets only");
				}
			}
		}
		catch(not_valid_code e) {
			System.out.println(e.getMessage());
		}
		try {
			String s1 = license.substring(0,2);
			String s2 = license.substring(2);
			for(int i=0;i<s1.length();i++) {
				if(Character.isAlphabetic(s1.charAt(i))==false) {
					flag = 1;
					throw new not_valid_code("First two characters must be alphabets");
				}
			}
			for(int i=0;i<s2.length();i++) {
				if(Character.isDigit(s2.charAt(i))==false) {
					flag = 1;
					throw new not_valid_code("From 3rd position characters must be digits");
				}
			}
		}
		catch(not_valid_code e) {
			System.out.println(e.getMessage());
		}
		if(flag == 0) {
			System.out.println("Valid driving license");
		}
	}

}
class not_recognized_state_code extends Exception{
	public not_recognized_state_code(String s) {
		super(s);
	}
}
class not_valid_code extends Exception{
	public not_valid_code(String s) {
		super(s);
	}
}
