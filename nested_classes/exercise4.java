//import java.util.Scanner;
//
//import faculty.degree;
//public class Shobhit_20BDS0162 {
//	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		System.out.println("Enter the number of faculties");
//		int n = input.nextInt();
//		faculty f[] = new faculty[n];
//		int numberOfDegrees[] = new int [10];
//		for(int i=0;i<f.length;i++) {
//			f[i] = new faculty();
//			System.out.println("Enter the number of degress for faculty "+(i+1));
//			numberOfDegrees[i] = input.nextInt();
//			f[i].setFacultyDetails(numberOfDegrees[i]);
//		}
//		for(int i=0;i<f.length;i++) {
//			f[i].getFacultyDetails(numberOfDegrees[i]);
//		}
//		System.out.println("Enter a faculty name for which you want to display the number of degrees");
//		String name = input.next();
//		for(int i=0;i<f.length;i++) {
//			if(f[i].name.equals(name)) {
//				System.out.println("The number of degrees for " + name + " is " + numberOfDegrees[i]);
//				break;
//			}
//		}
//	}
//}
//class faculty{
//	public String name;
//	public String empid;
//	public degree d[] = new degree[3];
//	Scanner input = new Scanner(System.in);
//	public class degree{
//		String degname;
//		String degyear;
//		String deguni;
//		public void setDegreeDetails() {
//			System.out.println("Enter the degree name");
//			degname = input.next();
//			System.out.println("Enter the degree awarded year");
//			degyear = input.next();
//			System.out.println("Enter the awarded by university");
//			deguni = input.next();
//		}
//		public void getDegreeDetails() {
//			System.out.println("Degree name: "+degname);
//			System.out.println("Degree awarded year: "+degyear);
//			System.out.println("Awarded by university: "+deguni);
//		}
//	}
//	public void setFacultyDetails(int n) {
//		System.out.println("Enter the faculty name");
//		name = input.next();
//		System.out.println("Enter the employee ID");
//		empid = input.next();
//		for(int i=0;i<n;i++) {
//			d[i] = new degree();
//			d[i].setDegreeDetails();
//		}
//	}
//	public void getFacultyDetails(int n) {
//		System.out.println("Name: "+name+"\nEmployee ID: "+ empid);
//		for(int i=0;i<n;i++) {
//			d[i].getDegreeDetails();
//		}
//	}
//}

//import java.util.InputMismatchException;
//import java.util.Scanner;
//
//public class Shobhit_20BDS0162 { 
//	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		try {
//			System.out.println("Enter the number of faculties");
//			int n = input.nextInt();
//			faculty f[] = new faculty[n];
//			int numberOfDegrees[] = new int [10];
//			for(int i=0;i<f.length;i++) {
//				f[i] = new faculty();
//				System.out.println("Enter the number of degress for faculty "+(i+1));
//				numberOfDegrees[i] = input.nextInt();
//				f[i].setFacultyDetails(numberOfDegrees[i]);
//			}
//			for(int i=0;i<f.length;i++) {
//				f[i].getFacultyDetails(numberOfDegrees[i]);
//			}
//			System.out.println("Enter a faculty name for which you want to display the number of degrees");
//			String name = input.next();
//			for(int i=0;i<f.length;i++) {
//				if(f[i].name.equals(name)) {
//					System.out.println("The number of degrees for " + name + " is " + numberOfDegrees[i]);
//					break;
//				}
//			}
//		}
//		catch(InputMismatchException e) {
//			System.out.println("Input mismatch exception has occured");
//		}
//		catch(degreeYearException e) {
//			System.out.println(e.getMessage());
//		}
//		catch(NullPointerException e) {
//			System.out.println("Memory not allocated");
//		}
//	}
//
//}
//class faculty{
//	public String name;
//	public String empid;
//	public degree d[] = new degree[3];
//	Scanner input = new Scanner(System.in);
//	public class degree{
//		String degname;
//		String degyear;
//		String deguni;
//		public void setDegreeDetails() throws degreeYearException,InputMismatchException{
//				System.out.println("Enter the degree name");
//				degname = input.next();
//				System.out.println("Enter the degree awarded year");
//				degyear = input.next();
//				if(degyear.compareTo("2022")>=0) {
//					throw new degreeYearException("Enter the correct year");
//				}
//				System.out.println("Enter the awarded by university");
//				deguni = input.next();
//			}
//
//		public void getDegreeDetails() {
//			System.out.println("Degree name: "+degname);
//			System.out.println("Degree awarded year: "+degyear);
//			System.out.println("Awarded by university: "+deguni);
//		}
//	}
//	public void setFacultyDetails(int n) throws degreeYearException,InputMismatchException,NullPointerException{
//			System.out.println("Enter the faculty name");
//			name = input.next();
//			System.out.println("Enter the employee ID");
//			empid = input.next();
//			for(int i=0;i<n;i++) {
//				d[i] = new degree();
//				d[i].setDegreeDetails();
//			}
//	}
//	public void getFacultyDetails(int n) {
//		System.out.println("Name: "+name+"\nEmployee ID: "+ empid);
//		for(int i=0;i<n;i++) {
//			d[i].getDegreeDetails();
//		}
//	}
//}
//class degreeYearException extends Exception{
//	public degreeYearException(String s) {
//		super(s);
//	}
//}