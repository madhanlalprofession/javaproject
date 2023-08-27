package madhan;

import java.util.Scanner;

public class Stringppalindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int l=s.length();
		String reverse="";
		for(int i=l-1;i>=0;i--) {
			 reverse=reverse+s.charAt(i);
		}
		
	if(s.equalsIgnoreCase(reverse)) {
		System.out.println("the given string "+s+" is a palindrome");
	}else {
		System.out.println("the given string "+s+" is not a palindrome");
	}
	
	
	}
	}

