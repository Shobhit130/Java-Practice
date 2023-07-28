package threads_exercise;

public class third {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thr = new Thread(new Runnable() {
			public void run() {
				System.out.println("Hello World");
			}
		});
		thr.start();
	}

}
