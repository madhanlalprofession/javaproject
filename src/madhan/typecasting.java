package madhan;
import java. util.*;

public class typecasting {

	public static void main(String[] args) {
		byte b=1;
		short s=2;
		int i=b+s;//implicit casting that is automatic casting
		System.out.println(i);//the byte and short automatially converted into int because the value of byte and short is lesser than int
		double d=1.11;//explicit casting because we need to cast manually
		int d1=(int)d+1; //because integer does not store value after decimal
		System.out.println(d1);
		
		String s1="3";
		String t="2.2f";
		int y=Integer.parseInt(s1)+2;//this is used to convert string into integer
		double c=Double.parseDouble(s1)-1;
		float f=Float.parseFloat(t)+2;//this is used to convert string into float
		System.out.println(f);
		

	}

}
