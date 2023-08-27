package madhan;

import java.util.Scanner;

public class upperandlower {
	public static void main(String []args) {
		Scanner sc=new Scanner (System.in);
		String i=sc.nextLine();
		System.out.println(i.toLowerCase());
		System.out.println(i.toUpperCase());
		System.out.println(i+" lal");
		System.out.println(i.trim());
		System.out.println(i.startsWith("m"));
		System.out.println(i.endsWith("lal"));
				}

}
