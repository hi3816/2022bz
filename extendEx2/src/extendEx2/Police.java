package extendEx2;

public class Police extends People{
	private int exper = 2;
	public Police (String name, int age, String address, int height, int weight) {
		super(name,age,address,height,weight);
	}
	
	public void showExper() {
		System.out.println(this.getName() + "의 경력은 " + this.exper + "년 입니다.");
	}
}
