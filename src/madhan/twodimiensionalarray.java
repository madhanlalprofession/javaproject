package madhan;
import java.util.*;

public class twodimiensionalarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int twoD[][]= new int[4][5];
		int i, j;
		Scanner in = new Scanner(System.in);
		System.out.println("ENTER THE ELEMENTS OF ARRAY:");
		for(i=0; i<4; i++){
		for(j=0; j<5; j++) {
		twoD[i][j]= in.nextInt();
		}}
		System.out.println("CONTENTS OF 2D ARRAY:");
		for(i=0; i<4; i++) //i<twoD.length;
		{
		for(j=0; j<5; j++)//i<twoD[i].length;
		{
		System.out.print(twoD[i][j] + " ");
		System.out.println();
		}}
					}
			
		
			
	

}
