package hw;

import java.util.Scanner;

public class hw03_1050210XX {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		int num;
		int negative=0,positive=0,zero=0;
		while((num=sca.nextInt())!=999)
		{
			if(num>0)
			positive++;
			else if(num<0)
				negative++;
			else
				zero++;
		}
		System.out.println("正數個數"+positive);
		System.out.println("零的個數"+zero);
		System.out.println("負數個數"+negative);
	}

}
