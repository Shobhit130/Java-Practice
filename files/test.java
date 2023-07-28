package files;
import java.io.*;
public class test {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		File obj = new File("D:\\Sem4\\Java\\files","shobhit1.txt");
		FileOutputStream fout = new FileOutputStream(obj);
		DataOutputStream dout = new DataOutputStream(fout);
		for(int i=1;i<=100;i++) {
			dout.writeInt(i);
		}
		dout.close();
		fout.close();
		File obj1 = new File("D:\\Sem4\\Java\\files","shobhit.txt");
		FileOutputStream fout1 = new FileOutputStream(obj1);
		DataOutputStream dout1 = new DataOutputStream(fout1);
		for(int i=101;i<=200;i++) {
			dout1.writeInt(i);
		}
		fout1.close();
		dout1.close();
		FileInputStream fin = new FileInputStream(obj);
		DataInputStream din = new DataInputStream(fin);
		for(int i=1;i<=100;i++) {
			System.out.print(din.readInt() + " ");
		}
		System.out.println();
		din.close();
		fin.close();
		FileInputStream fin1 = new FileInputStream(obj1);
		DataInputStream din1 = new DataInputStream(fin1);
		for(int i=1;i<=100;i++) {
			System.out.print(din1.readInt() + " ");
		}
		din1.close();
		fin1.close();
	}

}
