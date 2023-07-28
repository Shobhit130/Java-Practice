package static_nested;
import java.util.*;
public class test2 {
	public static void main(String[] args) throws InterruptedException{
		account shobhit = new account(2000);
		Thread thr1 = new Thread(new Runnable() {
			public void run() {
				for(int i=0;i<50;i++) {
					try {
						shobhit.withdraw(100);
					}
					catch(InterruptedException e) {
						System.out.println(e.getMessage());
					}
				}
			}
		});
		Thread thr2 = new Thread(new Runnable() {
			public void run() {
				for(int i=0;i<50;i++) {
					try {
						shobhit.deposit(1000);
					}
					catch(InterruptedException e) {
						System.out.println(e.getMessage());
					}
				}
			}
		});
		thr1.start();
		thr2.start();
		thr1.join();
		thr2.join();
		System.out.println("The final balance is "+shobhit.balance);
	}

}
class account{
	int balance;
	public account(int amount) {
		this.balance = amount;
	}
	public synchronized void withdraw(int amount) throws InterruptedException{
		while(this.balance < amount) {
			System.out.println("Not enough balance");
			System.out.println("Withdrawal Thread "+Thread.currentThread().getId()+" waiting for withdraw");
			wait();
		}
		System.out.println("Withdrawing");
		this.balance -= amount;
	}
	public synchronized void deposit(int amount) throws InterruptedException{
		System.out.println("Depositer Thread "+Thread.currentThread().getId()+" depositing");
		this.balance += amount;
		System.out.println("Deposited");
		System.out.println("Notifying withdrawal thread");
		notify();
	}
}