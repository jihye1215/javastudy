package sort.example.chapter01;

class Hello2 {
	public static void main(String[] args) {
		
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println("현재 t1 채널은 " + t1.channel + " 입니다.");
		System.out.println("현재 t2 채널은 " + t2.channel + " 입니다.");
		t1.channel = 7;
		t1.channelDown();
		t2 = t1;   // 참조변수 t1의 값을 t2에 저장
		System.out.println("현재 채널은 " + t1.channel + " 입니다.");
		System.out.println("현재 채널은 " + t2.channel + " 입니다.");
	}
}
	
class Tv {
	String color;
	boolean power;
	int channel;
	
	void power() { power = !power; }
	void channelUp() { ++channel; }
	void channelDown() { --channel; }
}
