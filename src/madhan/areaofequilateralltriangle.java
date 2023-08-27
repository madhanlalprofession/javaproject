package madhan;

import java.util.Scanner;

public class areaofequilateralltriangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		double a=Math.sqrt(3)/4*(Math.pow(s,2));
		System.out.println(String.format("%.2f",a));

	}

}
