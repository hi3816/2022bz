package extendEx1;

public class Circle extends Point{
	public void showInfo () {
		System.out.println("정보출력");
		System.out.println("x좌표는 : " + this.getX());
		System.out.println("y좌표는 : " + this.getY());
	}
	public Circle () {
		super(3,5);
		System.out.println("Circle(자식)생성자 호출");
	}
}
