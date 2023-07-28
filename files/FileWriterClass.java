package files;
import java.io.*;
import java.util.*;
public class FileWriterClass {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		try {
			File obj = new File("D:\\Sem4\\Java\\files","shobhit2.txt");
			FileWriter fiw = new FileWriter(obj);
			char c[] = {'s','h','o'};
			fiw.write(c);
//			go to offset 1 and write 2 characters from there
			fiw.write(c,1,2);
			
			//appending data in file(instead of erasing it)
//			File obj = new File("D:\\Sem4\\Java\\files","shobhit2.txt");
//			FileWriter fiw = new FileWriter(obj,true);
//			char c[] = {'s','h','o'};
//			fiw.write('s');
//			fiw.write(c);
//			String s = "hello world";
//			fiw.write(s);
			fiw.close();
			System.out.println("File writing success");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
