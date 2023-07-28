package static_nested;
import java.util.*;
public class test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		str obj = ()->{ArrayList<String> a = new ArrayList<String>();
		a.add("Shobhit");
		a.add("Agrawal");
		a.add("Varun");
		a.add("Bid");
		a.add("Eshaan");
		String s[] = new String[a.size()];
		a.toArray(s);
		for(int i=0;i<s.length-1;i++) {
			for(int j=0;j<s.length-i-1;j++) {
				if((s[j].charAt(0))>(s[j+1].charAt(0))) {
					String temp = s[j];
					s[j] = s[j+1];
					s[j+1] = temp;
				}
			}
		}
		for(int i=0;i<s.length;i++) {
			System.out.print(s[i]+" ");
		}};
		obj.op();
	}

}
interface str{
	void op();
}