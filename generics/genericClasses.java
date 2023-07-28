package generics;
import java.util.*;
public class genericClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student<Integer,String> s = new student(14, "Shobhit");
		s.display();
		student<String,Integer> s1 = new student("Shobhit", 14);
		s1.display();
	}

}
class student<T,U>{
	T marks;
	U name;
	public student(T marks,U name) {
		this.marks = marks;
		this.name = name;
	}
	public void display(){
		System.out.println(marks);
		System.out.println(name);
	}
}