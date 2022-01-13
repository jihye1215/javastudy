package prob5;

import java.util.Random;
import java.util.Scanner;

public class Prob5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );

		while( true ) {

			// 정답 램덤하게 만들기
			Random random = new Random();
			int correctNumber = random.nextInt( 100 ) + 1;
			System.out.println(correctNumber);
			System.out.print("수를 결정하였습니다. 맞추어 보세요");
			boolean result = true;
			
			while(result) {
				System.out.print(">>");
				int num = scanner.nextInt();
				if(correctNumber > num) {
					System.out.println("더 높게");
				} else if(correctNumber < num) {
					System.out.println("더 낮게");
				} else if(correctNumber == num) {
					System.out.println("맞았습니다.");
					result = false;
					break;
				}
			}
			
			//새 게임 여부 확인하기
			System.out.print( "다시 하겠습니까(y/n)>>" );
			String answer = scanner.next();
			if( "y".equals( answer ) == false ) {
				break;
			}
		}
		
		scanner.close();
	}

}