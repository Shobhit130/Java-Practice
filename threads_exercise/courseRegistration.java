package threads_exercise;
import java.util.*;
public class courseRegistration {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		course c = new course();
//		Thread thr1 = new Thread(new Runnable() {
//			public void run() {
//				try {
//					c.RegisterSeat();
//				}
//				catch(InterruptedException e) {
//					System.out.println(e.getMessage());
//				}
//			}
//		});
		Runnable r1 = ()->{try {
			c.RegisterSeat();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}};
		Thread thr1 = new Thread(r1);
		Thread thr2 = new Thread(new Runnable() {
			public void run() {
				try {
					c.RegisterSeat();
				} 
				catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		Thread thr3 = new Thread(new Runnable() {
			public void run() {
				try {
					c.AllocateSeat(30);
				} 
				catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		Thread thr4 = new Thread(new Runnable() {
			public void run() {
				System.out.println("Seats after allocating "+c.NumberOfSeats);
			}
		});
		thr1.start();
		thr2.start();
		thr3.start();
		thr1.join();
		thr2.join();
		thr3.join();
		thr4.start();
		
	}

}
class course{
	String CourseName;
	String FacultyName;
	int NumberOfSeats;
	
	public course() {
		CourseName = "Java Programming";
		FacultyName = "Satish C.J";
		NumberOfSeats = 0;
	}
	
	public synchronized void RegisterSeat() throws InterruptedException{
		while(NumberOfSeats <= 0) {
			System.out.println(Thread.currentThread().getId() + " waiting to register one seat");
			wait();
		}
		System.out.println(Thread.currentThread().getId() + " registered one seat");
		NumberOfSeats -= 1;
	}
	
	public synchronized void AllocateSeat(int Seats) throws InterruptedException{
		System.out.println(Thread.currentThread().getId() + " allocating " + Seats + " seats");
		NumberOfSeats = Seats;
		notifyAll();
	}
	
}
