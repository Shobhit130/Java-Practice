package files;
import java.util.*;
import java.io.*;
public class buffered_output {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedInputStream bufin = new BufferedInputStream(System.in);
		int data = bufin.read();
		bufin.close();
		BufferedOutputStream bufout = new BufferedOutputStream(System.out);
		bufout.write(data);
		bufout.close();
	}

}
