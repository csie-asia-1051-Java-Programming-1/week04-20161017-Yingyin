package ex;

import java.util.Scanner;

/*
 * Topic: 寫一個程式讓使多個正整數(包含0)直到使用者輸入-1 時停止，同時要顯示這些數字 總合 及 平均。
 * Date: 2016/10/17
 * Author:105791120 yangyuying
 */

public class ex01_1050210XX {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		int arr[]=new int[1000];
		int n=0,sum=0;
		int temp=0;
		while(temp!=-1)
		{
			arr[n]=temp;
			sum+=temp;
			n++;
			temp=scn.nextInt();
		}
		for(int i=0;i<=n;i++)
		{
			System.out.print(arr[i]+" ");
			
		}
		System.out.print("zonghe:"+sum+"pingjun:" + sum/(n-1f));
		}
		

}
