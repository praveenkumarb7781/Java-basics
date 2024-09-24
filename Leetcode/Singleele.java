package Leetcode;
import java.util.*;
public class Singleele {

	public static void main(String[] args) {
		int[] arr= {1,5,5,7,8,7,8};
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++) {
			if(hm.containsKey(arr[i])) {
				int count=hm.get(arr[i])+1;
				hm.put(arr[i], count);
			}
			else {
				hm.put(arr[i], 1);
			}
		}
		for(Map.Entry<Integer, Integer> dam:hm.entrySet()) {
			int c=dam.getValue();
			if(c==1) {
				System.out.println(dam.getKey());
				
			}
		}
	}
}