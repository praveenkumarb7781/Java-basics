package Leetcode;
import java.util.*;
public class UnionIntersection {

	public static void main(String[] args) {
		int []arr1= {1, 2, 3, 4, 5};
		int []arr2= {3, 4, 5, 6, 7};
		
		ArrayList<Integer> Intesection = interSection(arr1,arr2);
		System.out.println("Intersection of two arrays are: "+Intesection);
		System.out.print("Union of two arrays are: ["); uniOn(arr1,arr2);
		System.out.print("]");
	}


	private static void uniOn(int[] arr1, int[] arr2) {
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int i=0,j=0;

		while(i<arr1.length&&j<arr2.length) {
			//if arr[i<j] print and increment i
			if(arr1[i]<arr2[j]) {
				System.out.print(arr1[i++]+" ");
			}
			//if arr[j<i] print and increment j
			else if(arr1[i]>arr2[j]) {
				System.out.print(arr2[j++]+" ");
				
			}
			//if both are equal just print anyone
			else {
				System.out.print(arr1[i++]+" ");
				j++;
			}
		}
		// print  any extra elements in arr1
		while(i<arr1.length) {
			System.out.print(arr1[i++]+" ");
		}
		//print  any extra elements in arr2
		while(j<arr2.length) {
			System.out.print(arr2[j++]+" ");
		}
	}


	private static ArrayList<Integer> interSection(int[] arr1, int[] arr2) {
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int i=0,j=0;
		ArrayList<Integer> inter = new ArrayList<Integer>();
		while(i<arr1.length&&j<arr2.length) {
			if(arr1[i]==arr2[j]) {
				inter.add(arr1[i]);
				i++;j++;
			}
			else if(arr1[i]<arr2[j]) {
				i++;
			}
			else j++;
		}
		return inter;
	}

}
