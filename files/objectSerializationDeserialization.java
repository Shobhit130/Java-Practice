package files;
import java.io.*;
import java.util.*;
public class objectSerializationDeserialization {

	public static void main(String[] args) throws IOException{
		try {
			student s = new student("Shobhit","20BDS0162");
			//can i write this object to a file
			//transforming an object into a series of bits
			//into a file is called serialization of the object
			//also known as writing object to a file
			//we will use ObjectOutputStream and FileOutputStream
			File obj = new File("D:\\Sem4\\Java\\files","shobhit.txt");
			FileOutputStream fout = new FileOutputStream(obj);
			ObjectOutputStream objectout = new ObjectOutputStream(fout);
			objectout.writeObject(s);
			objectout.close();
			fout.close();
			
			//deserializing the object (reading the object back)
			FileInputStream fin = new FileInputStream(obj);
			ObjectInputStream objectin = new ObjectInputStream(fin);
			student instudent = null;
			instudent = (student)objectin.readObject();
			System.out.println(instudent.name + " " + instudent.regno);
			objectin.close();
			fin.close();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
class student implements Serializable{
	String name;
	String regno;
	public student(String name, String regno) {
		this.name = name;
		this.regno = regno;
	}
}