package files;
import java.util.*;
import java.io.*;
public class buffered_reader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		BufferedReader bufread = new BufferedReader(new InputStreamReader(System.in,"UTF-16"));
		BufferedReader bufread = new BufferedReader(new InputStreamReader(System.in));
		int data = bufread.read();
		char c[] = new char[4];
		System.out.println((char)data);
		bufread.read(c);
		for(char k:c) {
			System.out.println(k);
		}
		bufread.close();
		BufferedWriter bufwrite = new BufferedWriter(new OutputStreamWriter(System.out));
		bufwrite.write(data);
		bufwrite.close();
	}

}
