package Handson;
import java.util.regex.*;
public class Pangram {

	public static void main(String[] args) {
		String str="abcdefghijklmnopqrstUvwxyz12345";
		str=str.toLowerCase();
		boolean pan=true;

		for(char ch='a';ch<='z';ch++) {
			if(!str.contains(String.valueOf(ch))) {
				pan=false;
				break;
			}
			else
				pan =true;
		}
		if(pan) System.out.println("Pangram");
		else System.out.println("no");
	}

}
