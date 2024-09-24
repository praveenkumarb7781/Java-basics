package Handson;
import java.util.*;
public class Arraymanipu {
	Scanner sc = new Scanner(System.in);
	public String getPriceDetails() {
		try {
			System.out.println("Enter arr size:");
		int arrsiz=sc.nextInt();
		System.out.println("Enter arr elements:");
		int arr[] = new int[arrsiz];
		for(int i=0;i<arrsiz;i++) {
			arr[i] =sc.nextInt();
		}
		System.out.println("Enter the index");
		int ind=sc.nextInt();
		return("the element at index " +ind+" is :"+arr[ind]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			return "Array index is out of range";
		}
		catch(Exception e) {
			return "Input was not in correct format";
		}
	}
	public static void main(String[] args) {
		
		Arraymanipu am = new Arraymanipu();
	   System.out.println(am.getPriceDetails()); 
	}

}
