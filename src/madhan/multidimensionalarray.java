package madhan;

import java.util.Arrays;

public class multidimensionalarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]=new int[3][3];//two dimensional array
		a[0][0]=1;
		a[0][1]=2;
		a[0][2]=3;
		a[1][1]=5;
		a[1][0]=4;
		a[1][2]=6;
		a[2][0]=7;
		a[2][1]=8;
		a[2][2]=9;
		System.out.println(Arrays.deepToString(a));
	    int a2[][]= {{1,2},{3,4}};
		System.out.println(Arrays.deepToString(a));
		
		
	}
	}
