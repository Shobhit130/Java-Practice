package files;
import java.io.*;
import java.util.*;
import java.util.*;
public class readingDataAsBytes {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		File obj = new File("D:\\Sem4\\Java\\files","shobhit1.txt");
		obj.createNewFile();
		FileOutputStream fout = new FileOutputStream(obj);
		fout.write(104);
		//104 will be converted to a character using ANSI(for windows)
		byte b[] = new byte[5];
		for(int i=0;i<5;i++) {
			b[i] = input.nextByte();
		}
		fout.close();
		FileInputStream fin = new FileInputStream(obj);
		int data = fin.read();
		System.out.println((char)data);
		fin.close();
	}

}
