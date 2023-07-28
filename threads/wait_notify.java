package threads;

public class wait_notify {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		accounts obj = new accounts(2000);
		Thread thr1 = new Thread(new Runnable() {
			public void run() {
				try {
					obj.withdraw(30000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		Thread thr2 = new Thread(new Runnable() {
			public void run() {
				obj.deposit(40000);
			}
		});
		thr1.start();
		thr2.start();
		thr1.join();
		thr2.join();
		System.out.println(obj.balance);
	}

}
class accounts{
	int balance;
	public accounts(int balance) {
		this.balance = balance;
	}
	public synchronized void withdraw(int amount) throws InterruptedException {
		System.out.println("This is withdrawal "+Thread.currentThread().getId());
		while(amount>this.balance) {
			//wait will release the lock on the accounts object and goes into the passive mode
			//deposit comes in, acquires the lock
			System.out.println("Thread is waiting");
			wait();
		}
		System.out.println("Withdrawal happening "+Thread.currentThread().getId());
		this.balance -= amount;
	}
	public synchronized void deposit(int amount) {
		System.out.println("This is deposit "+Thread.currentThread().getId());
		this.balance += amount;
		System.out.println("Notifying "+Thread.currentThread().getId());
		//notifying only a single thread, thr1 starts withdrawing, it acquires the lock again on the object
		notify();
	}
}