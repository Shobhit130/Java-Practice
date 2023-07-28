package collections;
import java.util.*;
public class linked_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of students");
		n = input.nextInt();
		student s[] = new student[n];
		String name,regno;
		for(int i=0;i<s.length;i++) {
			name = input.next();
			regno = input.next();
			s[i] = new student(name,regno);
		}
		LinkedList<student> l = new LinkedList<>();
		for(int i=0;i<n;i++) {
			l.add(s[i]);
		}
		ListIterator<student> itr = l.listIterator();
		System.out.println("The students from SCOPE are");
		while(itr.hasNext()) {
			student obj = (student)itr.next();
			if(obj.regno.substring(2,5).equals("BCE")) {
				obj.display();
			}
		}
	}

}
class student{
	String name;
	String regno;
	public student(String name,String regno) {
		this.name = name;
		this.regno = regno;
	}
	public void display() {
		System.out.println(name + " " + regno);
	}
}