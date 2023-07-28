package collections;
import java.util.*;
public class array_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//lists - a type of collection
		//duplicate elements are allowed
		//order of insertion should be maintained in the Collection
		//to maintain insertion order, we use indexes (starting from 0)
		
		//list extends collection
		
		//types of lists		//ArrayLists - store all elements on contiguous memory blocks
		//reading will be more faster - read optimized (not write optimized)
		
		//creating ArrayList
		ArrayList<String> s = new ArrayList<>();
		//adding strings
		s.add("shobhit");
		s.add("agrawal");
		s.add("vit");
		//adding at a particular index
		s.add(1,"hi");
		//removing from an index
		s.remove(1);
		//clearing all the elements
//		s.clear();
		//checking if it is empty (returns true or false)
		System.out.println(s.isEmpty());
		//boolean method contains
		System.out.println(s.contains("agrawal"));
		System.out.println(s.size());
		
		//returning the index of the first occurence of the specified element else returns -1
		System.out.println(s.indexOf("agrawal"));
		//returning the index of the last occurence of the specified element
		System.out.println(s.lastIndexOf("vit"));
		
		//replacing the element at index i
		s.set(2, "hello");
		
		//copying the array list
		ArrayList<String> s1 = new ArrayList<>();
		s1 = (ArrayList<String>)s.clone();

		//traversing using for loop
		for(int i=0;i<s.size();i++) {
			String k = (String)s.get(i);
			System.out.println(k);
		}
		
		//traversing using enhanced for loop
		for(String k:s) {
			System.out.println(k);
		}
		
		//traversing using Iterator
		Iterator<String> itr = s.iterator();
		while(itr.hasNext()) {
			String j = (String)itr.next();
			System.out.println(j);
		}
		
		//traversing the list using ListIterator (reverse)
		//can be used only with lists
		ListIterator<String> itr1 = s.listIterator(s.size());
		while(itr1.hasPrevious()) {
			 String j = (String)itr1.previous();
			 System.out.println(j);
		}
		
		//creating an ArrayList using another collection
//		ArrayList<String> s2 = new ArrayList<>(s);
//		s2.add("somit");
//		s2.add("varun");
//		s2.add(2,"sid");
//		ListIterator<String> itr2 = s2.listIterator();
//		System.out.println();
//		while(itr2.hasNext()) {
//			String j = (String)itr2.next();
//			System.out.println(j);
//		}
		
		//adding all elements of one ArrayList to another
		ArrayList<String> s2 = new ArrayList<>();
		s2.add("somit");
		s2.add("varun");
		s2.add("sid");
		//adding all elements of s in s2
		s2.addAll(s);
		//removing all elements of s from s2
//		s2.removeAll(s);
		//retaining only elements of s in s2(removing elements of s2)
		s2.retainAll(s);
		ListIterator<String> itr2 = s2.listIterator();
		System.out.println();
		while(itr2.hasNext()) {
			String j = (String)itr2.next();
			System.out.println(j);
		}
		
		//ArrayList to Array
		String arr[] = new String[s2.size()];
		s2.toArray(arr);
		for(String k:arr) {
			System.out.println(k);
		}
		//array to ArrayList
		ArrayList<String> s3 = new ArrayList<String>(Arrays.asList(arr));
		System.out.println(s3);
	}

}
