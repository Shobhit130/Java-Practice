package class_practice_questions;

public class salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee e = new employee(25,2000);
		employee e1 = new employee(40, 3000);
		e.calcSalary();
		e.display();
		e1.calcSalary();
		e1.display();
	}

}
class employee{
	double salary,bp;
	int hours;
	public employee(int hours,double bp) {
		this.hours = hours;
		this.bp = bp;
	}
	public void calcSalary() {
		if(hours<=35) {
			salary = bp*hours; 
		}else if(hours>35 && hours<=65) {
			salary = bp*35 + bp*(0.05);
		}
	}
	public void display() {
		System.out.println(salary);
	}
}