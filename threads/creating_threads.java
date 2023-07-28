package threads;

public class creating_threads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//main method itself is a thread
		
//		even obj1 = new even();
//		odd obj2 = new odd();
		//start method will execute the run() method
		//start() method is only available in the Thread class
//		obj1.start();
		
		//if we use Runnable interface then
//		Thread thr = new Thread(obj2);
//		thr.start();
		//instead of creating a separate class
		//we can create an anonymous object of type runnable
		Thread thr1 = new Thread(new Runnable() {
			public void run() {
				for(int i=1;i<=100;i++) {
					if(i%2==0) {
						System.out.println("The even number is "+i);
					}
				}
				
			}
		});
		//in constructor of thread class we are passing an object of type Runnable
		Thread thr2 = new Thread(new Runnable() {
			public void run() {
					for(int i=101;i<=200;i++) {
						if(i%2!=0) {
							System.out.println("The odd number is "+i);
						}
					}
				}
		});
		thr1.start();
		thr2.start();
		for(int i=201;i<=300;i++) {
			System.out.println("The number from main method is "+i);
		}
		System.out.println("Thanks for using our software");
	}

}

//one way of creating threads is to create a class for each part that we want to execute independently
//and extends the Thread class
//Thread class implements Runnable Interface
//Runnable interface has the run() method
//We have to give the definition (override) of run() in the class
//class even extends Thread{
//	//overriding the run() method
//	public void run() {
//		//inside this we can just write the code for the part which we want to execute independently
//		for(int i=1;i<=100;i++) {
//			if(i%2==0) {
//				System.out.println("The even number is "+i);
//			}
//		}
//	}
//}
//second way can be by implementing the Runnable interface - rest will be same
//class odd implements Runnable{
//	public void run() {
//		for(int i=101;i<=200;i++) {
//			if(i%2!=0) {
//				System.out.println("The odd number is "+i);
//			}
//		}
//	}
//}

//MEMORY ALLOCATION FOR THREADS
//on the stack memory for every thread we have a separate stack frame 
//when we create an object inside the thread that object will be allocated on the heap
//whereas the reference will lie on the stack
//in ppt - run() method will be the first to be created on the stack and local variable
//a = 5 is assigned here, run() is calling addmethod(), that comes on the top of the stack 
//and b = 6, local variable is assigned here and addmethod() is calling the resultmethod()
//so that will be on the top of the stack
//if we create another thread then another stack frame will be created 
//there will be two stack frames for two different threads and one thread will not have
//access to local variables declared in another thread
//if we create an object in the resultmethod(), then the object will lie in the stack
//whereas the object allocation will be on the heap,local variables will be in the stack

//PRIORITY OF THREADS
//we have a priority associated with each thread
//priority varies from 1 to 10, 1-minimum and 10-maximum
//a thread scheduler will take care of assigning the threads to the processor 
//priority 5 is the (default priority) normal priority, if we create a main thread, it's priority will be 5
//pre-emptive priority scheduling will be there 