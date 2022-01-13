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
		char[] cstring = new char[c.length];
		for(int i = 0; i < 17; i++) {
			if(c[i] != ' ')
				cstring[i] = c[i];
			else
				cstring[i] =',';
		}
		for(int i=0; i< c.length; i++) {
			c[i] = cstring[i];
		}
		//String cstring2 = cstring.replaceAll(" ", ",");
		//c = cstring.toCharArray();
	}
	
	public static void printCharArray(char c[]) {
		for(int i = 0; i <17; i++) {
			System.out.print(c[i]);
		}
		System.out.println();
	}

}
