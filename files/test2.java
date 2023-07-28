package files;
import java.util.*;
import java.io.*;
public class test2 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		File obj = new File("D:\\Sem4\\Java\\files","shobhit.txt");
//		FileOutputStream fout = new FileOutputStream(obj);
//		DataOutputStream dout = new DataOutputStream(fout);
//		String s;
//		Scanner input = new Scanner(System.in);
//		s = input.nextLine();
//		dout.writeUTF(s);
//		dout.close();
//		fout.close();
//		FileInputStream fin = new FileInputStream(obj);
//		DataInputStream din = new DataInputStream(fin);
//		String s1 = din.readUTF();
//		char s2[] = s1.toCharArray();
//		int count = 0;
//		for(int i=0;i<s2.length;i++) {
//			if(s2[i]>='0' && s2[i]<='9') {
//				count++;
//			}
//			if(s2[i]>='A' && s2[i]<='Z') {
//				count++;
//			}
//		}
//		System.out.println(count);
//		din.close();
//		fin.close();
		FileOutputStream fout = new FileOutputStream(obj);
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		byte b[] = s.getBytes();
		fout.write(b);
		fout.close();
		FileInputStream fin = new FileInputStream(obj);
		fin.read(b);
		for(byte k:b) {
			System.out.print((char)k);
		}
		fin.close();
	}

}
