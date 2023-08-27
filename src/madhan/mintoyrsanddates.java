package madhan;

import java.util.Scanner;

public class mintoyrsanddates {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	double minutes=sc.nextDouble();
	double minute=(60*24*365);
	long years=(long)(minutes/minute);
	long days=(long)(minutes/60*24);
	System.out.println("no of years:"+years+" no of days:"+days%365);
	

}}
