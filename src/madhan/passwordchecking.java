package madhan;

import java.util.Scanner;

public class passwordchecking {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String i=sc.nextLine();
		if(i==i.toLowerCase()&&i==i.toUpperCase()) {
			System.out.println("the password is valid");
		}
		else {System.out.println("the entered password is not valid");
		}
		
		
	}}

