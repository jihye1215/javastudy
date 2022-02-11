package exception;

public class ExceptionTest {

	public static void main(String[] args) {
		int a = 10;
		int b = 10 - a;
		
		System.out.println("some code1...");
		
		try {
			System.out.println("some code2...");
			int result = (1 + 2 + 3)/b;
			System.out.println("some code3...");
		} catch(ArithmeticException e) {
			/* 예외처리 */
			
			// 1. 사과
			System.out.println("죄송합니다");
			// 2. 로깅
			System.out.println("error : " + e);
			// 3. 정상종료
			return;
		} finally { 
			/* 자원 정리 
			 * 정상적으로 실행이 되거나, 에러가 나거나 finally 자원정리는 실행된다.(마지막에 무조건 실행)
			 */
			System.out.println("자원정리");
		}
	}

}
