package extendEx2;

public class People {
	private String name;
	private int age;
	private String address;
	private int height;
	private int weight;

	public People(String name, int age, String address, int height, int weight) {
		this.name =name;
		this.age = age;
		this.address = address;
		this.height = height;
		this.weight = weight;
	}
	//get//
	public String getName() {return this.name;}
	public int getAge() {return this.age;}
	public String getAddress() {return this.address;}
	public int getHeight() {return this.height;}
	public int getWeight() {return this.weight;}
	//get//
	
	public void showInfo() {
		System.out.println(getName());
		System.out.println(getAge());
		System.out.println(getAddress());
		System.out.println(getHeight());
		System.out.println(getWeight());
	}
	
	

	
	
}
		
