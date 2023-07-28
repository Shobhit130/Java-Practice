package exception_handling;
import java.util.*;
public class exception_login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String username,password;
		System.out.println("Enter the username");
		username = input.next();
		System.out.println("Enter the password");
		password = input.next();
		int res = checkPass(password);
		if(res == 0) {
			System.out.println("Valid");
		}else {
			System.out.println("Not valid");
		}
	}
	
	public static int checkPass(String password) {
		int flag = 0;
		try {
			if(password.length()<8) {
				flag = 1;
				throw new userLoginException("Password length should be minimum 8 characters");
			}
			if(flag == 0) {
				for(int i=0;i<password.length();i++) {
					if(Character.isUpperCase(password.charAt(i))) {
						flag = 0;
						break;
					}else {
						flag = 1;
					}
				}
			}
			if(flag == 1) {
				throw new userLoginException("Password should contain atleast one upper case character");
			}
			if(flag == 0) {
				for(int i=0;i<password.length();i++) {
					if(password.charAt(i) == '#' || password.charAt(i) == '$' || password.charAt(i) == '@') {
						flag = 0;
						break;
					}else {
						flag = 1;
					}
				}
			}
			if(flag == 1) {
				throw new userLoginException("Password should conatin atleast one speical symbol");
			}
			if(flag == 0) {
				try {
					Scanner input = new Scanner(System.in);
					int captcha;
					int rand = (int)((Math.random()*20) + 1);
					System.out.println("Captcha: "+rand);
					System.out.println("Enter the captcha");
					captcha = input.nextInt();
					if(captcha != rand) {
						flag = 1;
						throw new userLoginException("Captcha does not match");
					}else {
						flag = 0;
					}
				}
				catch(userLoginException e) {
					System.out.println(e.getMessage());
				}
			}
		}
		catch(userLoginException e) {
			System.out.println(e.getMessage());
		}
		return flag;
	}

}
class userLoginException extends Exception{
	public userLoginException(String s) {
		super(s);
	}
}