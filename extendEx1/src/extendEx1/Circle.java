package extendEx1;

public class Circle extends Point{
	public void showInfo () {
		System.out.println("�������");
		System.out.println("x��ǥ�� : " + this.getX());
		System.out.println("y��ǥ�� : " + this.getY());
	}
	public Circle () {
		super(3,5);
		System.out.println("Circle(�ڽ�)������ ȣ��");
	}
}
