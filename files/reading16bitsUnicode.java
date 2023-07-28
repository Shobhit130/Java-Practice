package files;
import java.io.*;
import java.util.*;
public class reading16bitsUnicode {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File obj = new File("D:\\Sem4\\Java\\files","shobhit.txt");
		FileInputStream fin = new FileInputStream(obj);
		//as we are reading a UTF-16 character we have to give second argument as UTF-16
		InputStreamReader iread = new InputStreamReader(fin,"UTF-16");
		int data = iread.read();
		System.out.println(data);
		
		//if we want to display the character to the user
		//then we have to change eclipse settings
		System.out.println((char)data);
		iread.close();
		fin.close();
	}

}
