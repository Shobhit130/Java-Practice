package files;
import java.io.*;
import java.util.*;
public class sequence_input {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File obj1 = new File("D:\\Sem4\\Java\\files","shobhit1.txt");
		FileInputStream f1 = new FileInputStream(obj1);
		File obj2 = new File("D:\\Sem4\\Java\\files","shobhit2.txt");
		FileInputStream f2 = new FileInputStream(obj2);
		File obj3 = new File("D:\\Sem4\\Java\\files","shobhit.txt");
		FileOutputStream f3 = new FileOutputStream(obj3);
		SequenceInputStream seq = new SequenceInputStream(f1,f2);
		int i;
		while((i=seq.read())!=-1) {
			f3.write(i);
		}
		f3.close();
		f1.close();
		f2.close();
	}

}
