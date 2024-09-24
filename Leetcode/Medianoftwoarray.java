package Leetcode;
import java.util.*;

public class Medianoftwoarray {

	public static void main(String[] args) {
		int arr1[] = {1,2,3};
		int arr2[] = {4,5,6};
		
		int median = findMedian(arr1,arr2);
		System.out.println("The Median is:\t"+median);
	}

	public static int findMedian(int[] arr1, int[] arr2) {
		int index=arr1.length+arr2.length;
		
		int arr3[] =new int[index];
		int pos=0;
		for(int i:arr1) {
			arr3[pos]=i;
			pos++;
		}
		for(int j:arr2) {
			arr3[pos]=j;
			pos++;
		}
		Arrays.sort(arr3);
		
		int sum=0;
		for(int i=0;i<arr3.length;i++) {
			sum+=arr3[i];
		}
		//System.out.println(sum+" "+arr3.length);
		int m =sum/arr3.length;
		if(m>0)
		return m;
		else 
			return 0;
	}
}
