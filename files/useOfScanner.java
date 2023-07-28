package files;
import java.io.*;
import java.util.*;
public class useOfScanner {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//use of scanner class to read data from files
		//read a string from the file
		File obj = new File("D:\\Sem4\\Java\\files","shobhit.txt");
		//we will use a scanner object to read from the file
		Scanner input = new Scanner(obj);
//		String word = input.next();
//		System.out.println(word);
//		
//		//reading every line(line by line data)
//		//while there are lines to read
//		while(input.hasNext()) {
//			String line = input.nextLine(); //read every single line
//			System.out.println(line);
//		}
		
		//reading word by word
		while(input.hasNext()) {//while we have data in file
			String word1 = input.next();
			System.out.println(word1);
		}
		
	}

}
