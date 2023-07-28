package threads;

public class threads_sleep_interrupt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		number obj = new number();
			Thread thr1 = new Thread(new Runnable() {
				public void run() {
					try {
						obj.generateNumber();
					}
					catch(InterruptedException e) {
						System.out.println(e.getMessage());
					}
			}
		});
		Thread thr2 = new Thread(new Runnable() {
			public void run() {
				// TODO Auto-generated method stub
				obj.generateNumber101();
			}
		});
		thr1.start();
		thr2.start();
		thr1.interrupt();
		System.out.println("Thanks for using our software");
	}

}
class number{
	public void generateNumber() throws InterruptedException{
		for(int i=1;i<=100;i++) {
			System.out.println("The number from 1 to 100 is "+i);
				if(i==5) {
//				try {
					System.out.println("Sleeping");
					Thread.sleep(10000);
//				}
//				catch(InterruptedException e) {
					System.out.println("Exception handled here");
//				}
			}
		}
	}
	public void generateNumber101() {
		for(int i=101;i<=200;i++) {
			System.out.println("The number from 101 to 200 is "+i);
		}
	}
}
