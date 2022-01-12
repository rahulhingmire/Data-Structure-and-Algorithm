package mathAlgo;

import java.util.Scanner;

public class trailZero {
	//Basically this program is measure trailling zeros in factorial of number n
	//as 5! = 120
	//number of trailing zero is 1

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the Number : ");
	    int n = sc.nextInt();
	    sc.close();
	    System.out.println("Trailing zero's are "+trail(n));

	}
	
	
	 static int trail(int a) {
		
		int res = 0;
		for (int i = 5;i <= a;i = i*5) {
			res = res +  a/i;
		}
		return res;	
	}

}
