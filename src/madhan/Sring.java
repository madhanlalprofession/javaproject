package madhan;

import java.util.Scanner;

public class Sring {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s=sc.nextLine();
		String l="there is a fool";
		String m=s.concat(" madhan");
		System.out.println(m);
		System.out.println(l.contains("fo"));
		System.out.println(l.equals(s));
		System.out.println(l.equalsIgnoreCase(s));

	}

}
