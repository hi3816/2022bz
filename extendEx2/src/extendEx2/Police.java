package extendEx2;

public class Police extends People{
	private int exper = 2;
	public Police (String name, int age, String address, int height, int weight) {
		super(name,age,address,height,weight);
	}
	
	public void showExper() {
		System.out.println(this.getName() + "�� ����� " + this.exper + "�� �Դϴ�.");
	}
}
