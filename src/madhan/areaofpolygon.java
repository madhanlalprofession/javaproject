package madhan;

import java.util.Scanner;

public class areaofpolygon {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	double s=sc.nextDouble();
	double area=(n*Math.pow(s, 2))/(4*Math.tan(Math.PI/n));
	System.out.println(area);
	}
}
