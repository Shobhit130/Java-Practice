package static_nested;
import java.util.*;
import java.lang.*;
public class test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cap c = (String s)->{
			String temp = "";
			String s1[] = s.split(" ");
			for(int i=0;i<s1.length;i++) {
				String word = s1[i];
				String l = word.substring(0,1);
				temp += l.toUpperCase() + word.substring(1) + " ";
			}
			System.out.println(temp);
		};
		c.printCapitalized("vellore institute of technology");
		
	}

}
interface cap{
	void printCapitalized(String s);
}