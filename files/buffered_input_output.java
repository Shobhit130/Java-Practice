package files;
import java.util.*;
import java.io.*;
public class buffered_input_output {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		File obj= new File("D:\\Sem4\\Java\\files","shobhit2.txt");
		FileOutputStream fout = new FileOutputStream(obj);
		BufferedOutputStream bout = new BufferedOutputStream(fout);
		bout.write(104);
		byte b[] = new byte[4];
		for(int i=0;i<4;i++) {
			b[i] = input.nextByte();
		}
		bout.write(b);
		bout.close();
		fout.close();
		FileInputStream fin = new FileInputStream(obj);
		BufferedInputStream bin = new BufferedInputStream(fin);
		int data = bin.read();
		System.out.println((char)data);
		byte b1[] = new byte[4];
		bin.read(b1);
		for(byte k:b1) {
			System.out.println((char)k);
		}
		bin.close();
		fin.close();
	}

}
