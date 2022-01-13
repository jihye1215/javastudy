package prob1;

import java.util.Scanner;

public class Prob1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		final int[] Moneys = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
		int[] count = new int[10];
		System.out.print("금액 : ");
		int money = scanner.nextInt();
		while(money != 0) {
			if(money >= Moneys[0]) {
				count[0]++;
				money -= 50000;
			} else if(money >= Moneys[1]) {
				count[1]++;
				money -= 10000;
			} else if(money >= Moneys[2]) {
				count[2]++;
				money -= 5000;
			} else if(money >= Moneys[3]) {
				count[3]++;
				money -= 1000;
			} else if(money >= Moneys[4]) {
				count[4]++;
				money -= 500;
			} else if(money >= Moneys[5]) {
				count[5]++;
				money -= 100;
			} else if(money >= Moneys[6]) {
				count[6]++;
				money -= 50;
			} else if(money >= Moneys[7]) {
				count[7]++;
				money -= 10;
			} else if(money >= Moneys[8]) {
				count[8]++;
				money -= 5;
			} else if(money >= Moneys[9]) {
				count[9]++;
				money -= 1;
			} 
		}
		System.out.println("50000원 : " + count[0] + "개");
		System.out.println("10000원 : " + count[1] + "개");
		System.out.println("5000원 : " + count[2] + "개");
		System.out.println("1000원 : " + count[3] + "개");
		System.out.println("500원 : " + count[4] + "개");
		System.out.println("100원 : " + count[5] + "개");
		System.out.println("50원 : " + count[6] + "개");
		System.out.println("10원 : " + count[7] + "개");
		System.out.println("5원 : " + count[8] + "개");
		System.out.println("1원 : " + count[9] + "개");
		scanner.close();
	}

}
