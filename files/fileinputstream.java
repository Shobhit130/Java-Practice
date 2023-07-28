package files;
import java.util.*;
import java.io.*;
public class fileinputstream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//always include try catch for FileNotFoundException
			try {
				File obj = new File("D:\\Sem4\\Java\\files","shobhit.txt");
				FileInputStream fin = new FileInputStream(obj);
			//read() will read one byte from the file
			//always gives integer value
//			int data = fin.read();
//			System.out.println(data);
//			System.out.println((char)data);
			//printing all the data
			//end of the file marker is -1
//			int data;
//			while((data=fin.read())!=-1) {
//				System.out.print((char)data);
//			}
			
			//read(byte[] b) reading an array of bytes
//			byte b[] = new byte[5];
//			fin.read(b);
//			for(byte k:b) {
//				System.out.print((char)k);
//			}
			//available() - returns how many number of bytes is available to read from file
				int data = fin.read();
				System.out.println(fin.available());
				while(fin.available()>0) {
					data = fin.read();
					System.out.println(data);
				}
				fin.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("Exception handled here");
		}
	}

}
