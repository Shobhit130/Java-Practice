package files;
import java.io.*;
import java.util.*;
public class FileReaderClass {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		try {
			File obj = new File("D:\\Sem4\\Java\\files","shobhit.txt");
			FileReader fin = new FileReader(obj);
			//read one character from the file and returns an integer value
//			int data = fin.read();
//			System.out.println((char)data);
//			fin.close();
			
			//reading in an array of characters
//			char c[] = new char[5];
//			fin.read(c);
//			for(char k:c) {
//				System.out.print(k);
//			}
			//reading specific characters
			//start writing from location 1 in c[] and write 3 characters
			char c[] = new char[5];
			fin.read(c,1,3);
			String s;
			for(char k:c) {
				System.out.println(k);
			}
			fin.close();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
