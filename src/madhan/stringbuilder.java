package madhan;

public class stringbuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder str=new StringBuilder("madhan");
		System.out.println(str);
		StringBuilder s1=str.append("lal");
		System.out.println(s1);
		StringBuilder s2=str.insert(2, "t");
		System.out.println(s2);
		StringBuilder s3=str.replace(2, 4, "dh");
		System.out.println(s3);
		StringBuilder s4=str.reverse();
		System.out.println(s4);
		StringBuilder s5=str.delete(2,5);
		System.out.println(s5);
		

	}

}
