package madhan;

import java.util.Scanner;

public class expenditure {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double brand=sc.nextDouble();
		double travel=sc.nextDouble();
		double food=sc.nextDouble();
		double logic=sc.nextDouble();
		
	
	double total;
	total=brand+travel+food+logic;
	System.out.println("the total budget of the expenses: "+total);
	System.out.printf("the percentage of brand: "+"2.f%n",brand/total*100+"%");
	System.out.printf("the percentage of travel: "+"2.f%n",travel/total*100+"%");
	System.out.printf("the percentage of food: "+"2.f%n",food/total*100+"%");
	System.out.printf("the percentage of logic: "+"2.f%n",food/total*100+"%");
	

}
	}
