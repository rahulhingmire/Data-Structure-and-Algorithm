package mathAlgo;

import java.util.Scanner;

public class Gcd {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n = sc.nextInt();
		System.out.println("Enter the Number : ");
		int m = sc.nextInt();
		System.out.println(gcd(n,m));
		sc.close();	
	}

	  static int gcd(int n, int m) {
		if(m==0)
			return n;
		return gcd(m,n%m);
	}

}
