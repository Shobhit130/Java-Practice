package threads_exercise;
import java.util.Scanner;
public class tenth{ 
	public static void main(String[] args) throws InterruptedException {
		matrix m1 = new matrix();
		matrix m2 = new matrix();
		Thread thr1 = new Thread(new Runnable() {
			public void run() {
				System.out.println("Enter the elements of the matrix 1");
				m1.get();
			}
		});
		Thread thr2 = new Thread(new Runnable() {
			public void run() {
				System.out.println("Enter the elements of the matrix 2");
				m2.get();
			}
		});
		Thread thr3 = new Thread(new Runnable() {
			public void run() {
				System.out.println("The addition is");
				m1.add(m2);
			}
		});
		thr1.start();
		thr1.join();
		thr2.start();
		thr2.join();
		thr3.start();
		
	}
}
class matrix{
	int a[][] = new int[3][3];
	public void get() {
		Scanner input = new Scanner(System.in);
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				a[i][j] = input.nextInt();
			}
		}
	}
	public void add(matrix m) {
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				this.a[i][j] += m.a[i][j];
			}
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(this.a[i][j] + " ");
			}
			System.out.println();
		}
	}
}
