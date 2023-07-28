package files;
import java.io.*;
import java.util.*;
public class files_methods {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File obj = new File("D:\\Sem4\\Java\\files","shobhit.txt");
		obj.createNewFile();
		
		//getting the name of the file
		System.out.println(obj.getName());
		
		//getting the parent(folder) 
		System.out.println(obj.getParent());
		
		//getting the path
		System.out.println(obj.getPath());
		
		//checking whether a path is absolute or not
		System.out.println(obj.isAbsolute());
		
		//getting the machine specified path
		System.out.println(obj.getAbsolutePath());
		
		System.out.println(obj.canRead());
		System.out.println(obj.canWrite());
		System.out.println(obj.exists());
		
		//whether the object is a directory
		//can be used in THIRD CONSTRUCTOR OF CLASS FILE
		System.out.println(obj.isDirectory());
		
		//whether the object is file
		System.out.println(obj.isFile());
		
		//length of the file (Number of bytes in the file)
		System.out.println(obj.length());
		
		//modified date
		Date d = new Date(obj.lastModified());
		System.out.println(d);
		
		//deleting a file(if it returns true,file will be deleted)
//		System.out.println(obj.delete());
		
		//returning list of all the folders and files 
//		File obj1 = new File("D:\\Sem4\\Java");
//		String arr[] = obj1.list();
//		for(String k:arr) {
//			System.out.println(k);
//		}
//		System.out.println();
//		File arr1[] = obj1.listFiles();
//		for(File k:arr1) {
//			System.out.println(k.getName());
//		}
		
		//renaming a file
//		File obj1 = new File("D:\\Sem4\\Java\\files","test1.txt");
//		boolean flag = obj.renameTo(obj1);
//		if(flag) {
//			System.out.println("Success");
//		}else {
//			System.out.println("Failed");
//		}
//		
	}

}
