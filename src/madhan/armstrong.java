package madhan;

import java.util.Scanner;

public class armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a number");
		int number=sc.nextInt();
		sc.close();
		int n=number;
		int i=0;
		while(number>0) {
			int digit=number%10;
			i +=Math.pow(digit,3);
					number /=10;
		}

	
	if(i==n) {
		System.out.println("the given number is armstrong");
	}
	else {
		System.out.println("the given number is not armstrong");
	}

	}}