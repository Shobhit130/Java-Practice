package static_nested;
import java.io.*;
public class test12 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File obj = new File("D:\\Sem4\\Java\\files","shobhit.txt");
		FileReader fread = new FileReader(obj);
		BufferedReader bufread = new BufferedReader(fread);
		String data;
		while((data = bufread.readLine())!=null) {
			System.out.println(data);
		}
	}

}
