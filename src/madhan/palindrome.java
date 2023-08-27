package madhan;

import java.util.Scanner;

public class palindrome {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number : ");
	int number=sc.nextInt();
	sc.close();
	int original=number;
	int temp=0;
	int check=0;
	while(number>0) {
		temp=number%10;
		check=(check*10)+temp;
		number=number/10;
	}
	if(original==check) {
		System.out.println("the given number is palindrome");}
		else {System.out.println("the given number is not palindrome");
		}
		}
	
	
	
		
	
	
		
	

	}

