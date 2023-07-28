package collections;
import java.util.*;
public class array_list_class_object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		country c[] = new country[2];
		String name;
		int id;
		Scanner input = new Scanner(System.in);
		for(int i=0;i<2;i++) {
			name = input.next();
			id = input.nextInt();
			c[i] = new country(name,id);
		}
		country c2[] = new country[2];
		int i=0;
		ArrayList<country> a = new ArrayList<country>();
		for(i=0;i<2;i++) {
			a.add(c[i]);
		}
		i = 0;
		ListIterator<country> itr = a.listIterator();
		while(itr.hasNext()) {
			c2[i] = (country)itr.next();
			i++;
		}
		for(i=0;i<2;i++) {
			System.out.println(c2[i].countryId + " " + c2[i].countryName);
		}
	}

}
class country{
	String countryName;
	int countryId;
	public country(String countryName,int countryId) {
		this.countryName = countryName;
		this.countryId = countryId;
	}
}