package files;
import java.io.*;
import java.util.*;
public class Datainputstream_practice {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File obj = new File("D:\\Sem4\\Java\\files","shobhit.txt");
//		FileOutputStream fout = new FileOutputStream(obj);
//		DataOutputStream dout = new DataOutputStream(fout);
//		dout.writeBoolean(true);
//		//writing a string
//		dout.writeUTF("shobhit");
//		dout.writeInt(2);
//		dout.close();
//		fout.close();
		FileInputStream fin = new FileInputStream(obj);
		DataInputStream din = new DataInputStream(fin);
		while(din.available()>0) {
			System.out.println(din.readChar());
		}
//		boolean f = din.readBoolean();
//		String name = din.readUTF();
//		int k = din.readInt();
//		System.out.println(f+" "+k+" "+name);
	}

}
