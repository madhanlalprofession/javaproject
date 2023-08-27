package madhan;

public class stringbuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer str=new StringBuffer("madhan");
		System.out.println(str);
		StringBuffer s1=str.append("lal");
		System.out.println(s1);
		StringBuffer s2=str.insert(2, "t");
		System.out.println(s2);
		StringBuffer s3=str.replace(2, 4, "dh");
		System.out.println(s3);
		StringBuffer s4=str.reverse();
		System.out.println(s4);
		StringBuffer s5=str.delete(2,5);
		System.out.println(s5);
		
	
		
		

	}

}
