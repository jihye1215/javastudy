package prob5;

public class Prob5 {

	public static void main(String[] args) {
		
		for(int i = 1; i < 10; i++) {
			if(i == 3 || i== 6 || i == 9) {
				System.out.println(i + " 짝");
			}
		}
		
		for(int i = 10; i < 100; i++) {
			String numstring = Integer.toString(i);
			String num1 = numstring.substring(1);
			String num2 = numstring.substring(0,1);
			if(num1.equals("3") || num1.equals("6") || num1.equals("9")) {
				System.out.print(i + " 짝");
				if(num2.equals("3") || num2.equals("6") || num2.equals("9")) {
					System.out.print("짝");
				}
				System.out.println();
			} 
		}
		
	}
}
