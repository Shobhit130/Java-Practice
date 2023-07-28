package class_practice_questions;
import java.util.*;
public class professor_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String designation;
		System.out.println("Enter the number of faculty members");
		int n = input.nextInt();
		dependent d[] = new dependent[n];
		for(int i=0;i<d.length;i++) {
			System.out.println("Enter the designation");
			designation = input.next();
			if(designation.equals("Professor")) {
				d[i] = new professor();
			}else if(designation.equals("Associate Professor")) {
				d[i] = new associate();
			}else if(designation.equals("Assisstant Professor")) {
				d[i] = new assistant();
			}else if(designation.equals("TRA")) {
				d[i] = new tra();
			}
			d[i].calcsalary();
		}
		for(int i=0;i<d.length;i++) {
			d[i].display();
		}
		String search;
		System.out.println("Enter the id of the faculty you want to search");
		search = input.next();
		for(int i=0;i<d.length;i++) {
			if(d[i].id.equals(search)) {
				d[i].display();
			}
		}
	}

}
abstract class dependent{
	String id,name,phone,dob;
	double salary;
	public void get() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter details");
		id = input.next();
		name = input.next();
		phone = input.next();
		dob = input.next();
	}
	public void display() {
		System.out.println(id + " " + name + " " + phone + " " + dob + " " + salary);
	}
	public abstract void calcsalary();
}
class professor extends dependent{
	public void calcsalary() {
		super.get();
		salary = 150000 + (0.3*150000);
//		super.display();
	}
}
class associate extends dependent{
	public void calcsalary() {
		super.get();
		salary = 120000 + (0.2*120000);
//		super.display();
	}
}
class assistant extends dependent{
	public void calcsalary() {
		super.get();
		salary = 100000 + (0.1*100000);
//		super.display();
	}
}
class tra extends dependent{
	public void calcsalary() {
		super.get();
		salary = 20000;
//		super.display();
	}
}