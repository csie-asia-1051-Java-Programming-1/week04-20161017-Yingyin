package hw;

import java.util.Scanner;

public class hw02_1050210XX {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		int n=sca.nextInt();
		int m=sca.nextInt();
		System.out.println(C(n,m));
	}
	private static char[] C(int n, int m) {
		int temp=m-n;
		int sumN=1,sumM=1;
		for(int i=n+1;i<m;i++)
		{
			sumN*=i;
		}
		for(int i=2;i<temp;i++)
		{
			sumM*=i;
		}
		return null;
	}

}
