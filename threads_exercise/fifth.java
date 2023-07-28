package threads_exercise;

public class fifth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test obj = new test();
		Thread thr = new Thread(new Runnable() {
			public void run() {
				obj.display();
			}
		},"shobhit20BDS0162");
		thr.start();
	}

}
class test{
	public void display() {
		System.out.println("Hello World");
		System.out.println("The thread name is " + Thread.currentThread().getName());
	}
}