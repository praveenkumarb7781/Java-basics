package Leetcode;
import java.util.*;
public class AddTwoList {

	public static void main(String[] args) {
		List<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		List<Integer> b = new ArrayList<Integer>();
		b.add(2);
		b.add(5);
		b.add(4);
		
		
		System.out.println(addtwoList(a,b));
	}

	 static List<Integer> addtwoList(List<Integer> a, List<Integer> b) {
		 int pos=0;
		 List<Integer> c= new ArrayList<Integer>();
		 for(int i:a) {
			 c.add(i);
			 pos=pos+1;
		 }
		 for(int j:b) {
			 c.add(j);
			 pos++;
		 }
		 Collections.sort(c);
		return c;
	}
}
