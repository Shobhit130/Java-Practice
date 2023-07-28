package generics;
import java.util.*;
public class first {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		display("Shobhit","20BDS0162");
		display(1,"SJT");
		display(155.14,"Cm");
	}
	public static <T,U> void display(T element,U element1) {
		System.out.println(element + " " + element1);
	}

}
