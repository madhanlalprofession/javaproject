package madhan;

import java.util.Scanner;

public class checkingprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a number to check : ");
		int p=sc.nextInt();
		if(isprime(p)) {
			System.out.println("the given number "+p+" is prime");
		}
		else {
			System.out.println("the given number "+" is not prime");
		}
	}

	private static boolean isprime(int p) {
		if(p<=0) {
		return false;
		}
		for(int i=2;i<=Math.sqrt(p);i++) {
			if(p%i==0)
				return false;
		}return true;
	}
}


