package madhan;

import java.util.Scanner;

public class oddnumbers {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	if(n > 0){
		for(int i=1;i<=n;i++) {
		if(i%2 !=0) {
			
			System.out.println("the odd numbers are "+i);
		}	
		}
		
	}
	else {
		System.out.println("Invalid number");
	}
		
	
}}