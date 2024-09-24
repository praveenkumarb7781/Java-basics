package Leetcode;
import java.util.*;
public class plusone {

	public static void main(String[] args) {
		int arr[] = {1,2,3};
		plusone(arr);

	}

	 static void plusone(int[] arr) {
		 int sum=0;
		 for(int i=0;i<arr.length;i++) {
			 if(i>0) {
				 sum=sum*10+arr[i];
			 }
			 else
				 sum=arr[i];
			 }
			sum=sum+1;
			
			int i=0;
			ArrayList<Integer> al=new ArrayList<Integer>();
			while(sum>0) {
				al.add(sum/10);
				sum=sum%10;
				i++;
			}
			System.out.println(al);
	 }

}
