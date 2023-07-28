package threads;

public class threads_join {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		generate obj = new generate();
		Thread thr1 = new Thread(new Runnable(){
			public void run() {
				obj.generateEven();
			}
		});
		Thread thr2 = new Thread(new Runnable() {
			public void run() {
				obj.generateOdd();
			}
		});
		thr1.start();
		thr1.setPriority(1);
		thr1.join();
		thr2.start();
		thr2.setPriority(10);
		thr2.join();
		//JOIN - waits for a thread to die
		//the next step in the program won't execute until the thread terminates
		System.out.println("Thanks for using our software");
	}

}
class generate{
	public void generateEven() {
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				System.out.println("The even number is "+i);
			}
		}
	}
	public void generateOdd() {
		for(int i=101;i<=200;i++) {
			if(i%2!=0) {
				System.out.println("The odd number is "+i);
			}
		}
	}
}