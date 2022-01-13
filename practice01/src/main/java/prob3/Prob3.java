package prob3;

import java.util.Scanner;

public class Prob3 {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int sum = 0;
		if(num%2 == 0) {
			for(int i = 1; i<=num; i++) {
				if(i%2 == 0) {
					sum += i;
				}
			}
		} else {
			for(int i = 1; i<=num; i++) {
				if(i%2 == 1) {
					sum += i;
				}
			}
		}
		System.out.println(sum);
		scanner.close();
	}
}
