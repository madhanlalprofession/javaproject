package madhan;

import java.util.Scanner;

public class weeekendsandweekdays {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the salary: ");
		double salary=sc.nextDouble();
		double weekend=salary/4;
		double weekendshour=weekend/80;
		double weekdayshour=weekendshour+10;
		System.out.println("the total hour in weekend is: "+weekendshour);
		System.out.println("the total hour in weekday is: "+weekdayshour);
	}}


		
