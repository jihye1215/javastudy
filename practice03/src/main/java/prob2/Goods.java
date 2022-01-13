package prob2;

public class Goods {
	
	private String goodsName;
	private int price;
	private int number;

	public Goods(String goodsName, int price, int number) {
		this.goodsName=goodsName;
		this.price=price;
		this.number=number;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return goodsName + "(가격 : " + price + "원)이 " + number + "개 입고 되었습니다.";
	}
	
}
