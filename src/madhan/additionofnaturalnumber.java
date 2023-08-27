package madhan;
import java.util.Scanner;

public class additionofnaturalnumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value: ");
		int n=sc.nextInt();
		int count=0;
		if(n>0) {
			for(int i=1;i<=n;i++) {
				count+= i;
				
		
			}
			System.out.println(count);
			
		}else {System.out.println("not valid");
	}

}
}
