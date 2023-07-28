package threads_exercise;

public class producer_consumer {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		pnc obj = new pnc();
		Thread thr1 = new Thread(new Runnable() {
			public void run() {
				for(int i=1;i<=12;i++) {
					try {
						obj.producer(i);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		Thread thr2 = new Thread(new Runnable() {
			public void run() {
				for(int i=1;i<=12;i++) {
					try {
						obj.consumer();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		thr1.start();
		thr2.start();
//		thr2.setPriority(10);
	}

}
class pnc{
	int buffer[] = new int[11];
	int bufferSize = 0;
	public synchronized void producer(int data) throws InterruptedException{
		while(bufferSize == 10){
			System.out.println("Buffer is full");
			wait();
		}
		System.out.println("Producing");
		buffer[bufferSize + 1] = data;
		bufferSize++;	
		notify();
	}
	public synchronized void consumer() throws InterruptedException {
		while(bufferSize == 0){
			System.out.println("Buffer is empty");
			wait();
		}
		System.out.println("Consuming");
		System.out.println(buffer[bufferSize]);
		bufferSize--;
		notify();
	}
}
