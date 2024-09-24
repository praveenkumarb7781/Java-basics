package Handson;
import java.util.regex.*;
import java.util.*;
public class PasswordValid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String p = sc.nextLine();
	
		Pattern uppercase = Pattern.compile("[A-Z]");
		Pattern lowercase = Pattern.compile("[a-z]");
		Pattern digit = Pattern.compile("[0-9]");
		Pattern special = Pattern.compile("[!@#$%^&*()-+]");

		if(uppercase.matcher(p).find()==true&&lowercase.matcher(p).find()==true&&digit.matcher(p).find()==true&&special.matcher(p).find()==true&&p.length()>=8&&p.length()<=10)
		{
			System.out.println("Valid");
		}
		else {
			System.out.println("Invalid");
		}
	}

}
