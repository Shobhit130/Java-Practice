package files;
import java.io.*;
import java.util.*;
public class serialization_arrayofObjects {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		// TODO Auto-generated method stub
		File obj = new File("D:\\Sem4\\Java\\files","shobhit.txt");
		employee e[] = new employee[2];
		System.out.println("Enter the employee details");
		Scanner input = new Scanner(System.in);
		String name,address,empid;
		FileOutputStream fout = new FileOutputStream(obj);
		ObjectOutputStream objectout = new ObjectOutputStream(fout);
		for(int i=0;i<2;i++) {
			System.out.println("Enter the employee name");
			name = input.next();
			System.out.println("Enter the employee ID");
			empid = input.next();
			System.out.println("Enter the employee address");
			address = input.next();
			e[i] = new employee(name,empid,address);
			objectout.writeObject(e[i]);
		}
		objectout.writeObject(new endoffile());
		objectout.close();
		fout.close();
		FileInputStream fin = new FileInputStream(obj);
		ObjectInputStream objectin = new ObjectInputStream(fin);
		Object objmap = null;
		//reading every object and mapping it to objmap until we reach end of file
		while((objmap = objectin.readObject()) instanceof endoffile == false) {
			System.out.println(((employee)objmap).name);
			System.out.println(((employee)objmap).empid);
			System.out.println(((employee)objmap).address);
		}
		objectin.close();
		fin.close();
	}

}
class employee implements Serializable{
	String name;
	String empid;
	String address;
	public employee(String name,String empid,String address) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.empid = empid;
		this.address = address;
	}
}
//this class will act as end of file marker
class endoffile implements Serializable{
	
}