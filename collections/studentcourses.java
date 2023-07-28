package collections;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;
public class studentcourses {
	public static void main(String[] args) {
		ArrayList<student1> s = new ArrayList<student1>();
		int n;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of students");
		n = input.nextInt();
		student1 obj[] = new student1[n];
		for(int i=0;i<n;i++) {
			obj[i] = new student1();
			obj[i].getCourse();
			s.add(obj[i]);
		}
		ListIterator<student1> itr = s.listIterator();
		int count = 0;
		String sub;
		System.out.println("Enter the subject");
		sub = input.next();
		while(itr.hasNext()) {
			student1 temp = (student1)itr.next();
			for(int i=0;i<temp.n;i++) {
				if(temp.courses[i].equals(sub)) {
					count++;
					break;
				}
			}
		}
		System.out.println(count);
	}
}
class student1{
	String courses[] = new String[10];
	int n;
	public void getCourse() {
		System.out.println("Enter the number of courses");
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		System.out.println("Enter the courses");
		for(int i=0;i<n;i++) {
			courses[i] = input.next();
		}
	}
}