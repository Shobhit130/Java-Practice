package threads;

public class priority_threads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		evenodd obj = new evenodd();
		//if we want to give the thread thr1 a name, then we pass that as a second argument
		Thread thr1 = new Thread(new Runnable() {
			public void run() {
				try {
					obj.generateEven();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		},"shobhit");
		Thread thr2 = new Thread(new Runnable() {
			public void run() {
				obj.generateOdd();
			}
		});
		//setting priority for a thread
//		thr1.setPriority(10);
		thr1.start();
		//interrupting the thread that is sleeping
//		thr1.interrupt();
		System.out.println(Thread.currentThread().isInterrupted());
//		thr2.setPriority(1);
		thr2.start();
		
		//for this main thread default priority will be 5
		System.out.println("Thanks for using our software");
	}

}
class evenodd extends Thread{
	public void generateEven() throws InterruptedException {
		for(int i=1;i<=100;i++) {
//			if(i%2==0) {
//				//returning the priority of the current thread 
//				System.out.println("Generate even priority is "+Thread.currentThread().getPriority());
//				//checking whether the thread is alive or not - gives true or false
//				System.out.println(Thread.currentThread().isAlive());
//				//toString() - returns the thread name, priority everything as a string
//				System.out.println(Thread.currentThread().toString());
//				//getting name of a thread - shobhit 
//				System.out.println(Thread.currentThread().getName());
//				//when the thread is created, an ID is set by default
//				System.out.println(Thread.currentThread().getId());
//				System.out.println("The even number is "+i);
//			}
//			//sleep method - pause the thread execution
			System.out.println(i);
			try {
				if(i==5) {
					//time in milliseconds
					//pause for 10 seconds
					System.out.println("Thread is entering sleep mode");
					//we are not using currentThread because sleep is a static method
					//it is a class level definition in the Thread class 
					Thread.sleep(10000);
				}
			}
			//while interrupting a thread, we will get an exception  
			//if the thread is interrupted, the thread will raise an exception
			//and it will come out of the sleep and start again it's execution
			catch(InterruptedException e) {
				System.out.println("Exception handled here");
			}
		}
	}
	public void generateOdd() {
		for(int i=101;i<=200;i++) {
			if(i%2!=0) {
				//as we have not assigned any priority, the default priority will be assigned i.e. 5
				System.out.println("Generate odd priority is "+Thread.currentThread().getPriority());
				System.out.println("The odd number is "+i);
			}
		}
	}
}