package Leetcode;
import java.util.*;
public class ProductofArrays {

	public static void main(String[] args) {
		int arr[] = {4,5,6,1};
		int b[]=new int[arr.length];
		int mul=1;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(i!=j) {
					mul=mul*arr[j];
				}
			}
			b[i]=mul;
			mul=1;
			
		}
		System.out.println(Arrays.toString(b));
	}

}
