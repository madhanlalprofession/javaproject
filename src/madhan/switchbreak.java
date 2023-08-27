package madhan;


public class switchbreak {

	public static void main(String[] args) {
		
		char a = 'a';
		
		switch(a) {
		
		case 'a':
		case'e':
		case'i':
		case'o':
		case'u':
			System.out.println(a+" is vowel");
			
			
		break;
		default:
			System.out.println(a+" not a vowel");
		}	

	}}