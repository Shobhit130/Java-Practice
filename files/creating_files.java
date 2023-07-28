package files;
import java.util.*;
import java.io.*;
public class creating_files {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//FIRST CONSTRUCTOR TYPE OF CLASS FILE
		//File(String Path)
		//Path -> Absolute (When giving whole path or full path from the root directory)
		//File obj = new File("D:\\Sem4\\Java\\files\\test.txt");
		//Path -> Relative (Only give file name, relative to where our program is stored)
		//File obj = new File("test.txt");
		//where we store our program, obj will search for this file in that directory
		//Passing the path in the constructor of File class
		//along with the file name - test.txt
//		File obj = new File("D:\\Sem4\\Java\\files\\test.txt");

//		System.out.println(obj.separator);
		//getting the file name
//		System.out.println(obj.getName());
		//getting the absolute path of the file
//		System.out.println(obj.getAbsolutePath());
		
		//SECOND CONSTRUCTOR TYPE OF CLASS FILE
		//File(String Parent,String Child)
		//Parent -> Directory
		//Child -> File Name
		//File obj = new File("D:\\Sem4\\Java\\files\\","test.txt");
		//if file does not exist then we have to create a file
		//it will create a file when a file of the specified name does not exist in the folder
		//createNewFile() will throw IOException
		//if(obj.createNewFile()) {
			//System.out.println("File is created");
		//}
		
		//THIRD CONSTRUCTOR TYPE OF CLASS FILE
		//File(File Parent,String Child)
		
		File obj1 = new File("D:\\Sem4\\Java\\files");
		File obj = new File(obj1,"test.txt");
		obj.createNewFile();
		System.out.println(obj.exists());
	}

}
