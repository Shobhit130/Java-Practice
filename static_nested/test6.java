package static_nested;
import java.util.*;
import java.io.*;
public class test6 {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		number n = new number();
		Thread thr1 = new Thread(new Runnable() {
			public void run() {
				try {
					n.generatePrime();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
			}
		});
		Thread thr2 = new Thread(new Runnable() {
			public void run() {
				try {
					n.generatePrime101();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
			}
		});
		Thread thr3 = new Thread(new Runnable() {
			public void run() {
				try {
					n.read1();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		Thread thr4 = new Thread(new Runnable() {
			public void run() {
				try {
					n.read2();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		thr1.start();
		thr2.start();
		thr2.join();
		thr3.start();
		thr3.join();
		thr4.start();
	}

}
class number{
	File obj1 = new File("D:\\Sem4\\Java\\files","shobhit.txt");
	File obj2 = new File("D:\\Sem4\\Java\\files","shobhit1.txt");
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
				try {
					Thread.currentThread().sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
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
				try {
					Thread.currentThread().sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		dout.close();
		fout.close();
	}
	public void read1() throws IOException{
		FileInputStream fin = new FileInputStream(obj1);
		DataInputStream din = new DataInputStream(fin);
		while(din.available()>0) {
			System.out.print(din.readInt()+" ");
		}
		din.close();
		fin.close();
		System.out.println();
	}
	public void read2() throws IOException{
		FileInputStream fin = new FileInputStream(obj2);
		DataInputStream din = new DataInputStream(fin);
		while(din.available()>0) {
			System.out.print(din.readInt()+" ");
		}
		din.close();
		fin.close();
	}
}