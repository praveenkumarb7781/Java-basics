package Handson;
import java.util.*;
public class Lcm {
	public  int getLcm(int num1,int num2) {
		int gcd=0;
		for(int i=1;i<=num1&&i<=num2;i++) {
			if(num1%i==0&&num2%i==0) {
				gcd=i;
			}
		}
		int lcm=num1*num2/gcd;
		return lcm;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		Lcm lc=new Lcm();
		int da=lc.getLcm(a,b);
		System.out.println(da);

	}

}
