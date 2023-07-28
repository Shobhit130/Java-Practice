package collections;
import java.util.*;
import java.util.Map.Entry;
public class hash_maps {
	public static void main(String[] args) {
		HashMap<String,ArrayList<String>> h1 = new HashMap<String,ArrayList<String>>();
		int n;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of students");
		n = input.nextInt();
		for(int i=0;i<n;i++) {
			String name;
			System.out.println("Enter the name");
			name = input.next();
			System.out.println("Enter the number of courses");
			int n1 = input.nextInt();
			ArrayList<String> s = new ArrayList<String>();
			for(int j=0;j<n1;j++) {
				String sub;
				sub = input.next();
				s.add(sub);
			}
			h1.put(name, s);
		}
		HashMap<String,String> h2 = new HashMap<String,String>();
		int m;
		System.out.println("Enter the number of courses");
		m = input.nextInt();
		for(int i=0;i<m;i++) {
			String name;
			System.out.println("Enter the course name");
			name = input.next();
			String fac;
			System.out.println("Enter the faculty name");
			fac = input.next();
			h2.put(name, fac);
		}
		String studentName;
		System.out.println("Enter the student name");
		studentName = input.next();
		String courses[] = new String[3];
		for(Map.Entry<String, ArrayList<String>> j:h1.entrySet()) {
			if(j.getKey().equals(studentName)) {
				ArrayList<String> s1 = new ArrayList<String>();
				s1 = (ArrayList<String>)j.getValue();
				s1.toArray(courses);
			}
			for(Map.Entry<String,String> k:h2.entrySet()) {
				for(int l=0;l<courses.length;l++) {
					if(k.getKey().equals(courses[l])) {
						System.out.println(k.getValue());
					}
				}
			}
		}
		
	}

}
