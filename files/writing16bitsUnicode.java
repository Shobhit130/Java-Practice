package files;
import java.io.*;
import java.util.*;
public class writing16bitsUnicode {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File obj = new File("D:\\Sem4\\Java\\files","shobhit.txt");
		FileOutputStream fout = new FileOutputStream(obj);
		OutputStreamWriter iwrite = new OutputStreamWriter(fout,"UTF-16");
		iwrite.write(1013);
		String s = "hello world";
		iwrite.write(s);
		iwrite.close();
		fout.close();
	}

}
