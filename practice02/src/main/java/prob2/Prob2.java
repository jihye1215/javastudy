
package prob2;

import java.util.Scanner;

public class Prob2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int intArray[] = new int[5];
		double sum = 0;
		
		for(int i = 0; i < 5; i++) {
			intArray[i] = in.nextInt();
		}
		for(int i = 0; i < 5; i++) {
			sum += intArray[i];
		}
		System.out.println("평균은 " + sum/5  + " 입니다.");
		
	}
}
