package kms;

import java.util.Scanner;

public class bank {
	public static void main(String[] args) {
		int[] unit = { 50000, 10000, 1000, 500, 100, 50, 10, 1 };

		Scanner in = new Scanner(System.in);
		System.out.print("금액 입력 : ");
		int money = in.nextInt();
		for (int i = 0; i < unit.length; i++) {
			int count = money / unit[i];
			money %= unit[i];
			System.out.println(unit[i] + "원 짜리 : " + count + "개 ");
		}
	}
}