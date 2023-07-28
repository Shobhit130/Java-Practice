package threads_exercise;

public class second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		generateOdd obj = new generateOdd();
		Thread thr = new Thread(obj);
		thr.start();
	}

}
class generateOdd implements Runnable{
	public void run() {
	for(int i=1;i<=100;i++) {
		if(i%2!=0) {
			System.out.println("The odd number is "+i);
		}
	}
}
}