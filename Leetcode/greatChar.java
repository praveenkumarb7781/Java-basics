package Leetcode;

public class greatChar {

	public static void main(String[] args) {
		char[] ch= {'a','c','b','d','z'};
		char target='d';
		char largest=findLargest(ch,target);
		if(largest!='\0') System.out.println(largest);
		else if(largest==target) System.out.println("No");
		else System.out.println("No");
	}

	private static char findLargest(char[] ch, char target) {
		char cha='\0';
		for( int i=0;i<ch.length;i++) {
			if(ch[i]>target)
				cha=ch[i];
			
		}
		return cha;
	}

}
