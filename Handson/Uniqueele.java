package Handson;
import java.util.*;
public class Uniqueele {

	public static void main(String[] args) {
		int c=0;
		String s="damlall";
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]&&ch[i]!='1') {
					ch[i]='1';
				}
			}
		}
		for(int i=0;i<ch.length;i++) {
			if(ch[i]!='1') {
				c++;
			}
		}
System.out.println(c);
	}

}
