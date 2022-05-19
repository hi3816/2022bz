package extendEx2;

public class Developer extends People {
	private int lang = 1;
	public Developer(String name, int age, String address, int height, int weight) {
		super(name, age, address, height, weight);
	}
	public void showLang() {
		System.out.println(this.getName()+"이 가능한 언어는" + this.lang);
	}
}
