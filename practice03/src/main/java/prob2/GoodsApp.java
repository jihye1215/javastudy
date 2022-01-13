package prob2;

import java.util.Scanner;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Goods[] goods = new Goods[COUNT_GOODS];

		for(int i = 0; i < COUNT_GOODS; i++) {
			String goodsName = scanner.next();
			int price = scanner.nextInt();
			int number = scanner.nextInt();
			
			goods[i] = new Goods(goodsName, price, number);
			
		}
		
		for(Goods good : goods) {
			System.out.println(good.toString());
		}
		
		// 자원정리
		scanner.close();
	}
}
