package static_nested;
import java.util.*;
import java.io.*;
public class test7 {

	public static void main(String[] args) throws InterruptedException{
		word w1 = new word();
		// TODO Auto-generated method stub
		Thread thr1 = new Thread(new Runnable() {
			public void run() {
				try {
					w1.read1();
				}
				catch(IOException e) {
					System.out.println(e.getMessage());
				}
			}
		});
		Thread thr2 = new Thread(new Runnable() {
			public void run() {
				try {
					w1.read2();
				}
				catch(IOException e) {
					System.out.println(e.getMessage());
				}
			}
		});
		Thread thr3 = new Thread(new Runnable() {
			public void run() {
				System.out.println("Thanks for using our software");
			}
		});
		thr1.start();
		thr2.start();
		thr1.join();
		thr2.join();
		thr3.start();
	}

}
class word{
	File obj1 = new File("D:\\Sem4\\Java\\files","shobhit.txt");
	File obj2 = new File("D:\\Sem4\\Java\\files","shobhit1.txt");
	public void read1() throws IOException{
		Scanner input = new Scanner(obj1);
		int a = 0,and=0,the=0;
		while(input.hasNext()) {
			String w = input.next();
			if(w.equals("a")) {
				a++;
			}else if(w.equals("and")) {
				and++;
			}else if(w.equals("the")) {
				the++;
			}
		}
		System.out.println("a: "+a);
		System.out.println("the: "+the);
		System.out.println("and: "+and);
		input.close();
	}
	public void read2() throws IOException{
		Scanner input = new Scanner(obj2);
		int count = 0;
		while(input.hasNext()) {
			String w = input.next();
			char c = w.charAt(0);
			if((w.equals("a")==false)&&(w.equals("and")==false)&&(w.equals("the")==false)&&(c == 'H')) {
				count++;
			}
		}
		System.out.println(count);
		input.close();
	}
}