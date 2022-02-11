package exception;

import java.io.IOException;

public class MyClassTest {

	public static void main(String[] args) {
		try {
			MyClass mc = new MyClass();
			try {
				mc.danger();
			} catch (MyException e) {
				e.printStackTrace();
			}
		} catch(IOException e) {
			e.printStackTrace();
		}

	}
}
