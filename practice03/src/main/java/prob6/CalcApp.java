package prob6;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		String[] arrString = input.split(" ");
		int num1 = Integer.parseInt(arrString[0]);
		int num2 = Integer.parseInt(arrString[2]);
		int result = 0;
		boolean check = true;
		while(check) {
			switch(arrString[1]) {
				case "+" :
					Add add = new Add();
					add.setValue(num1, num2);
					result = add.calculate();
					System.out.println(result);
					break;
				case "-" :
					Sub sub = new Sub();
					sub.setValue(num1, num2);
					result = sub.calculate();
					System.out.println(result);
					break;
				case "*" :
					Mul mul = new Mul();
					mul.setValue(num1, num2);
					result = mul.calculate();
					System.out.println(result);
					break;
				case "/" :
					Div div = new Div();
					div.setValue(num1, num2);
					result = div.calculate();
					System.out.println(result);
					break;
			}
			String string = scanner.next();
			if(string.equals("quit")) {
				check = false;
			}
		}
			
	
	}

}
