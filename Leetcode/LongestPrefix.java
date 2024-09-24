package Leetcode;

public class LongestPrefix {

	public static void main(String[] args) {
		
		String[] s ={"app","apple","application"};
		
		String str=longestCommonPrefix(s);
		System.out.println(str);
	}
	 static String longestCommonPrefix(String[] s) {
		int n=s.length;
		String result = s[0];
		for(int i=1;i<n;i++) {
			while(s[i].indexOf(result) != 0) {
				result = result.substring(0, result.length()-1);
				
				if(result.isEmpty())
					return null;
			}
		}
		return result;
	}

	 

}
