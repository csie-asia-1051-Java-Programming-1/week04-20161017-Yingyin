package ex;

import java.util.Scanner;

/*
 * Topic: 讓使用者輸入 一個正整數 n 然後顯示出下列圖形 (例 n = 4)
	* 
	** 
	***
	****
 * Date: 2016/10/17
 * Author: 105791120 yangyuying
 */

public class ex03_1050210XX {

	public static void main(String[] args) {
		Scanner sca= new Scanner(System.in);
		int n;
		n=sca.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
