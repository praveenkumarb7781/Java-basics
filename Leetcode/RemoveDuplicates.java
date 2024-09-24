package Leetcode;
import java.util.*;
public class RemoveDuplicates {

	public static void main(String[] args) {
		Integer[] arr1= {1,2,3,5,5,8,8,9};
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
	List<Integer> arr2 = new ArrayList<Integer>(Arrays.asList(arr1));
	for(int i=0;i<arr2.size();i++) {
		for(int j=i+1;j<arr2.size();j++){
		if(arr2.get(i)==arr2.get(j))
			arr2.remove(j);
	}
	}
	System.out.println(arr2);
	}

}
