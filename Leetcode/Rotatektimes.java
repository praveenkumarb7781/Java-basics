package Leetcode;
import java.util.*;
public class Rotatektimes
{
public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9};
		int len = arr.length;
		rotatearr(arr,len);
		
}

static void rotatearr(int[] arr, int len)
{
		 System.out.println("Enter k: ");
		 Scanner sc = new Scanner(System.in);
		 int k=sc.nextInt();
		 k=k%len;
		for(int i=0;i<len-1;i++)
		{
			if(i<k) { System.out.print(arr[len-k+i]+" "); }
			else {	System.out.print(arr[i-k]+" "); }
		}
		sc.close();
	}

}
