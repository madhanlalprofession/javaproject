package madhan;

import java.util.Scanner;

public class foreach {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String in=sc.nextLine();
        int[]rank= {1,2,3};
        for(int mark:rank)
        	System.out.print(mark);
        System.out.println();
        String input[]= {"madhan","lal"};
        for(String output:input)
        	System.out.print(output);
        System.out.println();
        String ou=in;
        //for(String io:ou)
        	System.out.println(in);
        
		
	}

}
