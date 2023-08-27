package madhan;

import java.util.Scanner;

public class quadraticexpression {

	public static void main(String[] args) {
		int i;
		int u;
		Scanner sc=new Scanner(System.in);
		i=sc.nextInt();
		u=sc.nextInt();
		for(int s=1;s<=u;s++) {
			System.out.println(s+"*"+i+"="+i*s);
		}
	}

}
