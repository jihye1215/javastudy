package sort.example.chapter01;

public class Ex6_3 {

	public static void main(String[] args) {
		System.out.println("Card.width = " + Card.width);   // cv
		System.out.println("Card.height = " + Card.height);   // cv
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 " + "(" + Card.width + ", " + Card.height + ")" + "이다");
		System.out.println("c2은 " + c2.kind + ", " + c2.number + "이며, 크기는 " + "(" + Card.width + ", " + Card.height + ")" + "이다");
		
		Card.width = 50;
		Card.height = 150;
		System.out.printf("width : %d, height : %d", c1.width, c1.height);
		System.out.println();
		System.out.printf("width : %d, height : %d", c2.width, c2.height);
	}

}

class Card {
	String kind;
	int number;
	static int width = 100;
	static int height = 250;
}
