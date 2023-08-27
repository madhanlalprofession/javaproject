package madhan;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		if(i%1 ==0 && i%i==0) {
			System.out.println("the given number is prime");}
			else if(i/1!=0 &&i/i !=0  ) {
				System.out.println("the given number is not prime");
		}

	}

}
