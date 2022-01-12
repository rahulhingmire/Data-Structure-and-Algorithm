package mathAlgo;

import java.util.Arrays;
import java.util.Scanner;

public class SieveOfEratosthenes {
	//this algorithm is used for get the prime numbers in range of(2,n)
	//most efficient way to find prime numbers
	//this algo is also called as Sieve Of Eratosthenes

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n = sc.nextInt();
		sc.close();
		boolean isprime[] = new boolean[n+1];
		Arrays.fill(isprime, true);
		isprime[0] = false;
		isprime[1] = false;
		for(int i = 2;i<=n;i++) {
			for(int j = 2*i;j<=n;j=j+i) {
				isprime[j] = false;
			}
		}
		for(int i = 2;i<=n;i++) {
			if(isprime[i]==true) {
				System.out.println(i);
			}
		}

	}

}
