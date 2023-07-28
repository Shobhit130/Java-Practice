package threads;
import java.io.*;
public class threads_files {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		file1 f1 = new file1();
		file2 f2 = new file2();
		Thread thr1 = new Thread(new Runnable() {
			public void run() {
				try {
					f1.writeFile1();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		});
		Thread thr2 = new Thread(new Runnable() {
			public void run() {
				try {
					f2.writeFile2();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		});
		Thread thr3 = new Thread(new Runnable() {
			public void run() {
				try {
					f1.readFile1();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		});
		Thread thr4 = new Thread(new Runnable() {
			public void run() {
				try {
					f2.readFile2();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		});
		thr1.start();
		thr2.start();
		thr1.join();
		thr2.join();
		thr3.start();
		thr3.join();
		thr4.start();
		
	}

}
class file1{
	File obj = new File("D:\\Sem4\\Java\\files","shobhit1.txt");
	public void writeFile1() throws IOException {
		FileOutputStream fout = new FileOutputStream(obj);
		DataOutputStream dout = new DataOutputStream(fout);
		for(int i1=1;i1<=100;i1++) {
			dout.writeInt(i1);
		}
		dout.close();
		fout.close();
	}
	public void readFile1() throws IOException {
		FileInputStream fin = new FileInputStream(obj);
		DataInputStream din = new DataInputStream(fin);
		for(int i=1;i<=100;i++) {
			System.out.print(din.readInt() + " ");
		}
		System.out.println();
		din.close();
		fin.close();
	}
}
class file2{
	File obj1 = new File("D:\\Sem4\\Java\\files","shobhit.txt");
	public void writeFile2() throws IOException{
		FileOutputStream fout1 = new FileOutputStream(obj1);
		DataOutputStream dout1 = new DataOutputStream(fout1);
		for(int i1=101;i1<=200;i1++) {
			dout1.writeInt(i1);
		}
		fout1.close();
		dout1.close();	
	}
	public void readFile2() throws IOException{
		FileInputStream fin1 = new FileInputStream(obj1);
		DataInputStream din1 = new DataInputStream(fin1);
		for(int i=1;i<=100;i++) {
			System.out.print(din1.readInt() + " ");
		}
		din1.close();
		fin1.close();
	}
}