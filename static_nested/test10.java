package static_nested;
import java.util.*;
import java.io.*;
public class test10 {
	public static void main(String[] args) throws InterruptedException{
		num n = new num();
		Thread thr1 = new Thread(new Runnable() {
			public void run() {
				try {
					n.generatePrime();
				}
				catch(IOException e) {
					System.out.println(e.getMessage());
				}
			}
		});
		Thread thr2 = new Thread(new Runnable() {
			public void run() {
				try {
					n.generatePrime101();
				}
				catch(IOException e) {
					System.out.println(e.getMessage());
				}
			}
		});
		Thread thr3 = new Thread(new Runnable() {
			public void run() {
				try {
					n.read1();
				}
				catch(IOException e) {
					System.out.println(e.getMessage());
				}
			}
		});
		thr1.start();
		thr2.start();
		thr1.join();
		thr2.join();
		thr3.start();
	}

}
class num{
	File obj1 = new File("D:\\Sem4\\Java\\files","shobhit1.txt");
	File obj2 = new File("D:\\Sem4\\Java\\files","shobhit2.txt");
	public void generatePrime() throws IOException{
		FileOutputStream fout = new FileOutputStream(obj1);
		DataOutputStream dout = new DataOutputStream(fout);
		for(int i=1;i<=100;i++) {
			int flag = 0;
			for(int j=2;j<i/2;j++) {
				if(i%j==0) {
					flag = 1;
					break;
				}
			}
			if(i!=1 && flag == 0) {
				dout.writeInt(i);
			}
		}
		dout.close();
		fout.close();
	}
	public void generatePrime101() throws IOException{
		FileOutputStream fout = new FileOutputStream(obj2);
		DataOutputStream dout = new DataOutputStream(fout);
		for(int i=101;i<=200;i++) {
			int flag = 0;
			for(int j=2;j<i/2;j++) {
				if(i%j==0) {
					flag = 1;
					break;
				}
			}
			if(i!=1 && flag == 0) {
				dout.writeInt(i);
			}
		}
		dout.close();
		fout.close();
	}
	public void read1() throws IOException {
		FileInputStream fin = new FileInputStream(obj1);
		DataInputStream din = new DataInputStream(fin);
		int sum = 0;
		int data;
		while(din.available()>0) {
			sum += din.readInt();
		}
		System.out.println("The sum of prime between 1 and 100 is "+ sum);
		din.close();
		fin.close();
	}
}