package anonymous_class;

public class lambda_expressions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//implementing display using an anonymous class
//		emp e = new emp() {
//			public void display() {
//				System.out.println("I am an employee");
//			}
//		};
//		e.display();
		
		//lambda expression
//		emp e = (name,designation)->{System.out.println("I am the employee "+name+" and designation is "+designation);};
//		e.display("shobhit","student");
		
		//lambda expression with a return type
		emp e = (a,b)->{return a+b;};
		int res = e.add(3, 2);
		System.out.println(res);
		Runnable r = ()->{System.out.println("hello");};
		Thread thr = new Thread(r);
		thr.start();
	}

}
//functional interface - an interface that has only one abstract method
//for such interfaces we can use lambda expressions (no need to create anonymous class)
interface emp{
//	void display(String name,String designation);
	int add(int a,int b);
}