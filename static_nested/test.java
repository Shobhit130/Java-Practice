package static_nested;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		numbers num = new numbers();
		Thread thr1 = new Thread(new Runnable() {
			public void run() {
				num.even();
			}
		});
		Thread thr2 = new Thread(new Runnable() {
			public void run() {
				try {
					num.odd();
				}
				catch(InterruptedException e) {
					System.out.println(e.getMessage());
				}
			}
		});
		thr1.start();
		thr2.start();
		thr1.interrupt();
		thr2.interrupt();
	}

}
class numbers{
	public void even() {
		int count = 0;
		for(int i=1;i<=100;i++) {
			try {
				if(count == 6) {
					count++;
					System.out.println("Even sleeping");
					Thread.sleep(10000);
				}
				else {
					if(i%2==0) {
						System.out.println("The even number is "+i);
						count++;
					}
				}
			}
			catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
	public void odd() throws InterruptedException{
		int count = 0;
		for(int i=101;i<=200;i++) {
			if(count == 6) {
				count++;
				System.out.println("Odd sleeping");
				Thread.sleep(10000);
			}
			else {
				if(i%2!=0) {
					System.out.println("The odd number is "+i);
					count++;
				}
			}
		}
	}
}