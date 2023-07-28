package collections;
import java.util.*;
public class array_list_books {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<book> fiction = new ArrayList<book>();
		ArrayList<book> comic = new ArrayList<book>();
		ArrayList<book> cooking = new ArrayList<book>();
		book b[] = new book[6];
		for(int i=0;i<6;i++) {
			b[i] = new book();
			b[i].getInput();
		}
		for(int i=0;i<6;i++) {
			if(b[i].type.equals("fiction")) {
				fiction.add(b[i]);
			}else if(b[i].type.equals("comic")) {
				comic.add(b[i]);
			}else {
				cooking.add(b[i]);
			}
		}
		ListIterator<book> itr1 = fiction.listIterator();
		ListIterator<book> itr2 = comic.listIterator();
		ListIterator<book> itr3 = cooking.listIterator();
		book temp1[] = new book[2];
		book temp2[] = new book[2];
		book temp3[] = new book[2];
		int i=0;
		while(itr1.hasNext()) {
			temp1[i] = (book)itr1.next();
			temp1[i].display();
			i++;
		}
		i=0;
		while(itr2.hasNext()) {
			temp2[i] = (book)itr2.next();
			temp2[i].display();
			i++;
		}
		i=0;
		while(itr3.hasNext()) {
			temp3[i] = (book)itr3.next();
			temp3[i].display();
			i++;
		}
			
	}

}
class book{
	String name,author;
	int price;
	String type;
	Scanner input = new Scanner(System.in);
	public void getInput() {
		name = input.next();
		author = input.next();
		price = input.nextInt();
		type = input.next();
	}
	public void display() {
		System.out.println(name + " " + author + " " + price + " " + type);
	}
	public void sort(book b[]) {
		for(int i=0;i<b.length-1;i++) {
			for(int j=0;j<b.length-i-1;j++) {
				if(b[j].name.compareTo((b[j+1]).name)>0){
					book temp = b[j];
					b[j] = b[j+1];
					b[j+1] = temp;
				}
			}
		}
	}
}