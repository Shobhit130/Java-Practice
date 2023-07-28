package nested_classes;
import java.util.*;
public class nested_classes_exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stud
		faculty2 f[] = new faculty2[2];
		for(int i=0;i<f.length;i++) {
			f[i] = new faculty2();
			f[i].setFacultyDetails();
		}
		for(int i=0;i<f.length;i++) {
			f[i].getFacultyDetails();
		}
	}

}
class faculty2{
	private String name;
	private String empid;
	private degree2 d[] = new degree2[3];
	Scanner input = new Scanner(System.in);
	public class degree2{
		String degname;
		String degyear;
		String deguni;
		public void setDegreeDetails() {
			System.out.println("Enter the degree name");
			degname = input.next();
			System.out.println("Enter the degree year");
			degyear = input.next();
			System.out.println("Enter the degree university");
			deguni = input.next();
		}
		public void getDegreeDetails() {
			System.out.println("Degree name: "+degname);
			System.out.println("Degree year: "+degyear);
			System.out.println("Degree university: "+deguni);
		}
	}
	public void setFacultyDetails() {
		System.out.println("Enter the faculty name");
		name = input.next();
		System.out.println("Enter the empid");
		empid = input.next();
		for(int i=0;i<d.length;i++) {
			d[i] = new degree2();
			d[i].setDegreeDetails();
		}
	}
	public void getFacultyDetails() {
		System.out.println(name + " " + empid);
		for(int i=0;i<d.length;i++) {
			d[i].getDegreeDetails();
		}
	}
}