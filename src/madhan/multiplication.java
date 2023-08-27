package madhan;

import java.util.Scanner;

public class multiplication {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		int n=sc.nextInt();
		for(i=1;i<n;i++) {
			System.out.print("1*n "+i*n);
			System.out.print("2*n "+i*n);
		}
	}

}
