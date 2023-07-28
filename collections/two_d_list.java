package collections;
import java.util.*;
public class two_d_list {

	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println("current thread: "+t.toString());
		try {
			for(int k=0;k<100;k++) {
				System.out.println(--k);
				if(k==1)
					t.interrupt();
				Thread.sleep(1000);
				k+=3;
				if(k==5)
					t.interrupt();
			}
		}
		catch(InterruptedException e) {
			System.out.println("Main thread interrupted "+e.getMessage());
		}
		System.out.println("End of main thread");
	}

}
