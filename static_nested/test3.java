package static_nested;
public class test3 {
	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		Run o = new Run();
		Run o1 = new Run();
		Thread t = new Thread(o);
		Thread t1 = new Thread(o1);
		t.start();
		t.join();
		t1.start();
	}

}
class Run implements Runnable{
	public void run() {
		String s = Thread.currentThread().getName();
		if(s.equals("Thread-0")) {
			System.out.println("Thread-1");
		}else {
			try {
				Thread.sleep(1,10);
			}
			catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}