package prob3;

public class Prob3 {

	public static void main(String[] args) {
		
		char c[] = { 'T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ', 'p', 'e', 'n', 'c', 'i', 'l', '.' };
		// 원래 배열 원소 출력
		printCharArray(c);

		// 공백 문자 바꾸기
		replaceSpace(c);
		
		// 수정된 배열 원소 출력
		printCharArray(c);
	}
	
	public static void replaceSpace(char c[]) {
		String cstring = null;
		for(int i = 0; i < 17; i++) {
			cstring += c[i];
		}
		String cstring2 = cstring.replaceAll(" ", ",");
		c = cstring2.toCharArray();
	}
	
	public static void printCharArray(char c[]) {
		for(int i = 0; i <17; i++) {
			System.out.print(c[i]);
		}
		System.out.println();
	}

}
