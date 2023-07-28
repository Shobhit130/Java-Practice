package files_practice;
import java.util.*;
import java.io.*;
public class courses {

	public static void main(String[] args) throws IOException,ClassNotFoundException{
		// TODO Auto-generated method stub
		try {
			Scanner input = new Scanner(System.in);
			File obj = new File("D:\\Sem4\\Java\\files","course.txt");
			obj.createNewFile();
			FileOutputStream fout = new FileOutputStream(obj);
			ObjectOutputStream oout = new ObjectOutputStream(fout);
			course c[] = new course[4];
			String courseID,courseName,courseOfferedBy,course_slot;
			for(int i=0;i<c.length;i++) {
				System.out.println("Enter the course ID");
				courseID = input.next();
				System.out.println("Enter the course name");
				courseName = input.next();
				System.out.println("Enter the course slot");
				course_slot = input.next();
				System.out.println("Enter the school");
				courseOfferedBy = input.next();
				c[i] = new course(courseID,courseName,courseOfferedBy,course_slot);
				oout.writeObject(c[i]);
			}
			oout.close();
			fout.close();
			FileInputStream fin = new FileInputStream(obj);
			ObjectInputStream oin = new ObjectInputStream(fin);
			course c2[] = new course[4];
			for(int i=0;i<4;i++) {
				c2[i] = (course)oin.readObject();
			}
			oin.close();
			fin.close();
			for(course k:c2) {
				if(k.courseName.equals("Java") && k.course_slot.equals("C1") && k.courseOfferedBy.equals("SCOPE")) {
					k.display();
				}
			}
			
		}
		catch(ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
class course implements Serializable{
	 public String courseID;
	 public String courseName;
	 public String courseOfferedBy;
	 public String course_slot;
	 
	 public course(String a, String b, String c, String d) {
	        this.courseID = a;
	        this.courseName = b;
	        this.courseOfferedBy = c;
	        this.course_slot = d;
	    }
	 public void display() {
	        System.out.println(courseID + " - " + courseName + " - " + courseOfferedBy + " - " + course_slot);
	    }
}