package Handson;
import java.util.*;
public class VowelCaps {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s= sc.nextLine().toLowerCase();
		for(int i=0;i<s.length();i++) {
			
		if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
		char ch = (char)(s.charAt(i)-32);
		System.out.print(ch);
		}
		else 
		    {
			System.out.print(s.charAt(i));
			}
		}
	}
}