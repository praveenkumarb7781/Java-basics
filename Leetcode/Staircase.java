package Leetcode;
import java.util.*;
public class Staircase {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int s=sc.nextInt();
		if(s<=2) {
			System.out.println("2");
		}
		int a=1,b=2;
		for(int i=3;i<=s;i++) {
			int sum=a+b;
			a=b;
			b=sum;
		}
		System.out.println(b);
	}

}
