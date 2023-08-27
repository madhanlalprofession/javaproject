package madhan;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int in=sc.nextInt();
		int factorial=1;
		for (int i=1;i<=in;i++)
			factorial *=i;
		System.out.println(factorial);
				
			}

		

	

}
