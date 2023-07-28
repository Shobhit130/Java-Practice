package files_practice;
import java.util.*;
import java.io.*;
public class hashmapsFiles {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try {
			File obj = new File("D:\\Sem4\\Java\\files","shobhit.txt");
			HashMap<String,String> c = new HashMap<String,String>();
			c.put("1", "Shobhit");
			c.put("2", "Agrawal");
			FileWriter fwrite = new FileWriter(obj);
			BufferedWriter bufwrite = new BufferedWriter(fwrite);
			for(Map.Entry<String, String> j:c.entrySet()) {
				bufwrite.write(j.getKey() + ":" + j.getValue());
				bufwrite.newLine();
			}
			char c1[] = {'a','b'};
			bufwrite.write(c1);
			bufwrite.close();
			fwrite.close();
			FileReader fread = new FileReader(obj);
			BufferedReader bufread = new BufferedReader(fread);
			String s;
			while((s = bufread.readLine()) != null) {
				System.out.println(s);
			}
			bufread.close();
			fread.close();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
