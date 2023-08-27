package madhan;

import java.util.Scanner;

public class booleanexpression {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int income=sc.nextInt();
		boolean hasHighIncome=income>100_000;
		System.out.println(hasHighIncome);
		
	String className = income > 100_000 ? "first" :"economy";
	System.out.println(className);
		}
			
	}


