package threads_exercise;

public class fourth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Numbers obj = new Numbers();
		Thread thr1 = new Thread(new Runnable() {
			public void run() {
				obj.generatePrime();
			}
		});
		Thread thr2 = new Thread(new Runnable() {
			public void run() {
				obj.generatePrime101();
			}
		});
		thr1.start();
		thr2.start();
	}

}
class Numbers{
	public void generatePrime() {
		int i = 0;
        int num = 0;
        for (i = 1; i <= 100; i++) {
            int counter = 0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {
                System.out.println("Prime number between 1 and 100 is "+i);
            }
        }
	}
	public void generatePrime101() {
		int i = 0;
        int num = 0;
        for (i = 101; i <= 200; i++) {
            int counter = 0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {
                System.out.println("Prime number between 101 and 200 is "+i);
            }
        }
	}
}