package madhan;

import java.util.Scanner;

public class pattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int in=sc.nextInt();
		for(int i=1;i<=in;i++)
		{
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();		
			}
		}	
	}

