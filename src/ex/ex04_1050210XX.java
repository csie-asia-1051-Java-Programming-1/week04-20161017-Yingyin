package ex;

import java.util.Scanner;

/*
 * Topic: 讓使用者輸入 一個正整數 n 及一個字元符號，然後顯示出下列圖形 (例 n = 4,字元符號= @)
    @@@@
    @@@  
    @@  
    @
 * Date: 2016/10/17
 * Author: 105791120 yangyuying
 */

public class ex04_1050210XX {

	public static void main(String[] args) {
	Scanner sca = new Scanner(System.in);
	int n=sca.nextInt();
	String ch=sca.next();
	for(int i=n;i>=1;i--)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(ch);
		}
		System.out.println();
	}
	}

}
