package hw;

import java.util.Scanner;

public class hw04_1050210XX {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int kind,n;
	while ((kind = scan.nextInt()) != 4) {
       n = scan.nextInt();
		if (kind == 1) {
			printInfo1(n);
		} else if (kind == 2) {
			printInfo2(n);
		} else if (kind == 3) {
			if (n % 2 == 0) {
				System.out.println("n必須為奇數，請重新輸入");
				continue;
			}
			printInfo3(n);
		}
	}
}

public static void printInfo1(int n) {
	for (int i = n / 2; i >= 0; i--) {
		for (int j = 0; j <= i; j++) {
			System.out.print("@");
		}
		System.out.println();
	}
	for (int i = 1; i <= n / 2; i++) {
		for (int j = 0; j <= i; j++) {
			System.out.print("@");
		}
		System.out.println();
	}
}

public static void printInfo2(int n) {
	for (int i = 0; i <= n / 2; i++) {
		for (int j = 0; j <= i; j++) {
			System.out.print("%");
		}
		System.out.println();
	}
	for (int i = n / 2; i >= 1; i--) {
		for (int j = 0; j < i; j++) {
			System.out.print("%");
		}
		System.out.println();
	}
}

public static void printInfo3(int n) {
	for (int i = 0; i <= n / 2; i++) {
		for (int j = n / 2; j > i; j--) {
			System.out.print(" ");
		}
		for (int j = 0; j <= i * 2; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	for (int i = (n / 2) - 1; i >= 0; i--) {
		for (int j = 0; j < (n / 2) - i; j++) {
			System.out.print(" ");
		}
		for (int j = 0; j <= i * 2; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
	}


