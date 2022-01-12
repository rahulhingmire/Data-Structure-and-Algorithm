package mathAlgo;

import java.util.Scanner;

public class pallindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int res = 0;
	    System.out.println("Enter the Number : ");
	    int n = sc.nextInt();
	    int a = n;
	    while(n>0) {
	    	
	    	int temp = n % 10;
	    	res = res * 10 + temp;
	    	n = n/10;	
	    }
	    System.out.println(res);
	    if(a==res) {
	    	System.out.println("pallindrome");
	    }
	    else {
	    	System.out.println("not pallindrome");
	    	
	    }

	}

}
