package exception_handling;
import java.util.*;
public class employee {
	public static void main(String[] args) {
		try {
			emp e1[] = new emp[2];
			for(int i=0;i<e1.length;i++) {
				e1[i] = new emp();
			}
			for(int i=0;i<e1.length;i++) {
				try {
					if(e1[i].years>20 || e1[i].years<5) {
						throw new experienceCheck("Experience does not match");
					}
					if(e1[i].salary >500000 || e1[i].salary<5000) {
						throw new salaryCheck("Salary does not fall within specified range");
					}
					if(e1[i].age > 60 || e1[i].age<25) {
						throw new ageCheck("Age criteria not satisfied");
					}
				}
				catch(experienceCheck e) {
					System.out.println(e.getMessage());
				}
				catch(ageCheck e) {
					System.out.println(e.getMessage());
				}
				catch(salaryCheck e) {
					System.out.println(e.getMessage());
				}
			}
			
		}
		catch(NullPointerException e) {
			System.out.println("Memory not allocated");
		}
		catch(InputMismatchException e) {
			System.out.println("Invalid Input");
		}
		finally {
			System.out.println("Thanks for using our software");
		}
	}

}
class emp{
	String name,empid,designation,department;
	int age,years,salary;
	Scanner input = new Scanner(System.in);
	public emp() throws InputMismatchException{
		System.out.println("Enter the employee details");
		this.empid = input.next();
		this.name = input.next();
		this.age = input.nextInt();
		this.designation = input.next();
		this.years = input.nextInt();
		this.department = input.next();
		this.salary = input.nextInt();
	}
}
class experienceCheck extends Exception{
	public experienceCheck(String s) {
		super(s);
	}
}
class ageCheck extends Exception{
	public ageCheck(String s) {
		super(s);
	}
}
class salaryCheck extends Exception{
	public salaryCheck(String s) {
		super(s);
	}
}
