package files;
import java.io.*;
public class buffered_input {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//reading directly from the console
		BufferedInputStream bufin = new BufferedInputStream(System.in);
		int data = bufin.read();
//		System.out.println((char)data);
//		
//		//reading array of bytes from the buffer
//		byte b[] = new byte[4];
//		bufin.read(b);
//		for(byte k:b) {
//			System.out.println((char)k);
//		}
		
		System.out.println((char)data);
		//mark
		bufin.mark(3);
		byte b[] = new byte[4];
		bufin.read(b);
		for(byte k:b) {
			System.out.println((char)k);
		}
		bufin.reset();
		System.out.println((char)bufin.read());
		bufin.close();
	}

}
