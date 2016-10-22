package hw;

import java.util.Scanner;

public class hw01_1050210XX {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		int n=sca.nextInt();
		int arr[]=new int[1000];
		arr[1]=1;
		arr[2]=1;
		for(int i=3;i<=n;i++)
		{
			arr[i]=arr[i-1]+arr[i-2];
		}
	    for(int i=1;i<=n;i++)
	    {
	    	System.out.print(arr[i]+" ");
	    }
	}

}
