package static_nested;
import java.util.*;
public class test11 {

	public static void main(String[] args) throws InterruptedException{
		Runnable r1 = ()->{
			for(int i=1;i<=100;i++) {
				int flag = 0;
				for(int j=2;j<i/2;j++) {
					if(i%j==0) {
						flag = 1;
						break;
					}
				}
				if(i!=1 && flag == 0) {
					System.out.println("Prime "+i);
				}
			}
		};
		Thread thr1 = new Thread(r1);
		Runnable r2 = ()->{
			for(int i=1;i<=100;i++) {
				if(i%2 == 0) {
					System.out.println("Square "+(i*i));
				}
			}
		};
		Thread thr2 = new Thread(r2);
		thr1.start();
		thr2.start();
	}

}