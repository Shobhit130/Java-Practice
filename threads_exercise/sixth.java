package threads_exercise;
public class sixth {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		evenodd obj = new evenodd();
		Thread thr1 = new Thread(new Runnable() {
			public void run() {
				obj.generateEven();
			}
		});
		Thread thr2 = new Thread(new Runnable() {
			public void run() {
				obj.generateOdd();
			}
		});
		Thread thr3 = new Thread(new Runnable() {
			public void run() {
				obj.display();
			}
		});
		thr3.setPriority(10);
		thr1.setPriority(1);
		thr2.setPriority(1);
		thr1.start();
		thr1.join();
		thr2.start();
		thr2.join();
		thr3.start();
		System.out.println("Thanks for using our software");
	}

}
class evenodd {
	int even[] = new int[50];
	int odd[] = new int[50];
	public void generateEven() {
		int j = 0;
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				even[j] = i;
				j++;
			}
		}
	}
	public void generateOdd() {
		int j = 0;
		for(int i=1;i<=100;i++) {
			if(i%2!=0) {
				odd[j] = i;
				j++;
			}
		}
	}
	public void display() {
		for(int k:even) {
			System.out.println("The even number is "+k);
		}
		for(int k:odd) {
			System.out.println("The odd number is "+k);
		}
	}
}