package Leetcode;
import java.util.*;
public class RemovenodeinList {

	public static void main(String[] args) {
		List<Integer> lst = new LinkedList<Integer>();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the elements: ");
		for(int i=0;i<5;i++) {
			int z=sc.nextInt();
			lst.add(z);
		}
		System.out.println(lst);
		System.out.println("Enter the node to remove: ");
		int  node=sc.nextInt();
		sc.close();
		lst.remove(node);
		System.out.println();
	}

}
