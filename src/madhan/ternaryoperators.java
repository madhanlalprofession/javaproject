package madhan;

import java.util.Scanner;

public class ternaryoperators {

	public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 System.out.print("enter a character: ");
 char character=sc.next().charAt(0);
  String s=character=='m' ? "lal":"duraisingam";
  System.out.print(s);
  System.out.println();
 System.out.print("enter a interger" );
 int input=sc.nextInt();
 String n=input>=18 && input<=108 ?"eligible" :"not eligible";
 System.out.println(n);
	}

}

