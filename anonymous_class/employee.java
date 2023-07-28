package anonymous_class;

public class employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//this is nested/inner anonymous class having no name
		//it is going to be used only once	
		employees e = new employees() {
			public void display() {
				System.out.println("I am an employee");
			}
		};
		e.display();
	}

}
//abstract class employees{
//	public abstract void display();
//}
//same for interfaces
interface employees{
	void display();
}