package Handson;
import java.util.*;
public class CurrencyCalendar {

	public static void main(String[] args) {
		int n =5;
		int j=5;
		int arr[] = {1,2,3,2,1};
		int arr2[] = new int[n];
		for(int i=0;i<n;i++) {
			arr2[j-1]=arr[i];
			j--;
		}
		int c = 0;
		for(int k=0;k<n;k++) {
			if(arr[k]==arr2[k]) {
				c++;
			}
		}
		System.out.println(1%2);
		System.out.println(Arrays.toString(arr2));
	}

}
