package threads;

public class memory_consistency {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		account shobhit = new account(20000);
		Thread thr1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					shobhit.withdraw(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		Thread thr2 = new Thread(new Runnable() {
			public void run() {
				shobhit.deposit(1000);
			}
		});
		//thread interference - both the threads thr1 and thr2 executing the same function in an interleaved fashion
		thr1.start();
		thr2.start();
		thr1.join();
		thr2.join();
		//final balance should be displayed only after both threads completes
		System.out.println(shobhit.balance);

	}

}
class account{
	public int balance;
	public account(int balance) {
		this.balance = balance;
	}
	//solving the issue using synchronized keyword
	public void withdraw(int amount) throws InterruptedException {
		//if we don't want the whole method to be synchronized, then we can synchronize a block
		synchronized (this) {
			System.out.println("This is withdrawal");
			Thread.sleep(10000);
			this.balance -= amount;
		}
		System.out.println("I am not synchronized");
	}
	public synchronized void deposit(int amount) {
		System.out.println("This is deposit");
		this.balance += amount;
	}
}