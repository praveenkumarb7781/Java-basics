package Leetcode;
import java.util.*;
public class WavesortList {

	public static void main(String[] args) {
		List<Integer> list= new LinkedList<Integer>();
		Scanner sc= new Scanner(System.in);
		for(int i=1;i<5;i++) {
			int ele= sc.nextInt();
			list.add(ele);
		}
		sc.close();
		list=waveSort(list);
		System.out.println(list);
	}

	private static List<Integer> waveSort(List<Integer> list) {
		int n=list.size();
		for(int i=1;i<list.size();i++) {
			if(i>0&&list.get(i-1)>list.get(i)) 
				swap(list,i,i-1);
			
			if(i<n-1&&list.get(i+1)>list.get(i)) 
				swap(list,i,i+1);
			
		}
	
		return list;
	}

	private static void swap(List<Integer> list, int i, int j) {
		int temp=list.get(i);
		list.add(list.get(i), list.get(j));
		list.add(list.get(j), temp);
		
		
	}

}
