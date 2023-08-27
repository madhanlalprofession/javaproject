package madhan;

import java.util.Scanner;

public class arithmeticexpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		int a1=sc.nextInt();
		int b1=sc.nextInt();
		int a2=2;
		int a3=a2++;
		
		double c=a/b;
		int d=a1/b1;
		int e=a1+b1;
		int f=a1-b1;
		int g=a1%b1;
		int h=a1*b1;
		int i=a1*b1/a2-a3+g;//because this operator is by BODMAS
		//B-bracket,O-order means power,D-division,M-multiplication,A-addition,S-subraction
		
		System.out.println(c+" "+d+" "+e+" "+f+" "+g+" "+h+" "+i);
		
		
		
	}

}
