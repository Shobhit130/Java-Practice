package threads;

public class threads_notifyall {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		accounts1 obj = new accounts1(2000);
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
				try {
					obj.withdraw(40000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		Thread thr3 = new Thread(new Runnable() {
			public void run() {
				obj.deposit(400000);
			}
		});
		thr1.start();
		thr2.start();
		thr3.start();
		thr1.join();
		thr2.join();
		thr3.join();
		System.out.println(obj.balance);
	}

}
class accounts1{
	int balance;
	public accounts1(int balance) {
		this.balance = balance;
	}
	public synchronized void withdraw(int amount) throws InterruptedException {
		System.out.println("This is withdrawal "+Thread.currentThread().getId());
		while(amount>this.balance) {
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
		//notifying all the threads waiting on a particular object
		notifyAll();
	}
}