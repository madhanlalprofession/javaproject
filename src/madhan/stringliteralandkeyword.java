package madhan;

import java.util.Scanner;

public class stringliteralandkeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value : ");
		String s=sc.nextLine();
		String s1=new String(s);//it is using keyword
		String s2=" madhan ";//it is the literal
		String s3=String.valueOf(s1);
		String s4=s1.replace("ad", "thmadhan");
		String s5=s1.concat("lal");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s.length());//it will return the no of character ofo string
		System.out.println(s. isEmpty());
		System.out.println(s.concat(s2));
		System.out.println(s.substring(0, 3));
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s2.trim());
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		sc.close();
	}



	
	

}
