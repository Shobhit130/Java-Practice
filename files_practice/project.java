package files_practice;
import java.util.*;
import java.io.*;
public class project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File obj = new File("D:\\Sem4\\Java\\files","projects.txt");
			obj.createNewFile();
			Scanner input1 = new Scanner(System.in);
			Scanner input2 = new Scanner(System.in);
			String projectName,projectID,location;
			int budget;
			int choice;
			Project_manipulation p[] = new Project_manipulation[4];
			int i = 0;
			do {
				System.out.println("Options");
				System.out.println("1.Submit Project Data\n2.View Project Data\n3.Exit");
				System.out.println("Enter your choice");
				choice = input1.nextInt();
				switch(choice) {
				case 1:
					FileOutputStream fout = new FileOutputStream(obj,true);
					ObjectOutputStream oout = new ObjectOutputStream(fout);
					System.out.println("Enter the project name");
					projectName = input2.next();
					System.out.println("Enter the project ID");
					projectID = input2.next();
					System.out.println("Enter the project location");
					location = input2.next();
					System.out.println("Enter the project budget");
					budget = input1.nextInt();
					p[i] = new Project_manipulation(projectName,projectID,budget,location);
					oout.writeObject(p[i]);
					i++;
					oout.close();
					fout.close();
					break;
				case 2:
					FileInputStream fin = new FileInputStream(obj);
					ObjectInputStream oin = new ObjectInputStream(fin);
					Project_manipulation p2[] = new Project_manipulation[Project_manipulation.count];
					for(int j=0;j<p2.length;j++) {
						p2[j] = (Project_manipulation)oin.readObject();
						p2[j].display();
					}
					oin.close();
					fin.close();
					break;
				case 3:
					break;
				}
			}while(choice!=3);
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
		catch(ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

}
class Project_manipulation implements Serializable{
	String projectName;
	String projectID;
	int budget;
	String location;
	static int count = 0;
	public Project_manipulation(String projectName,String projectID,int budget,String location) {
		this.projectName = projectName;
		this.projectID = projectID;
		this.budget = budget;
		this.location = location;
		count++;
	}
	public void display() {
		System.out.println(projectName + " - " + projectID + " - " + location + " - " + budget);
	}
}