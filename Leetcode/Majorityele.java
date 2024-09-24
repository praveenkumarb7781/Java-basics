package Leetcode;
import java.util.*;
public class Majorityele {

	public static void main(String[] args) {
		int arr[]= {};
		majorityele(arr);
	}

	 static void majorityele(int[] arr) {
		 HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		 for(int i=0;i<arr.length;i++) {
			 if(hm.containsKey(arr[i])) {
				 hm.put(arr[i],hm.get(arr[i])+1);
			 }
			 else {
				 hm.put(arr[i], 1);
			 }
		 }
		 List<Integer> lst= new ArrayList<Integer>();
		 for(int k: hm.keySet()){
			 
	            if(hm.get(k)>arr.length/3){
	                lst.add(k);
	            }
	        }
		 System.out.println(lst);
	}

}
