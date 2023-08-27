package madhan;

import java.util.Random;
import java.util.Scanner;

public class randomnumber {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int min=sc.nextInt();
	int max=sc.nextInt();
	Random random=new Random();
	int number=random.nextInt(max-min+1)+min;
	System.out.println("the random number is "+number);
	int average=max-min/2;
	System.out.println(average);
		

	}

	
}
