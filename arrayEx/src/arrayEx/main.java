package arrayEx;

public class main {

	public static void main(String[] args) {
		System.out.println("arrayEx ���α׷� ����!");
		/*
		//�ʱ�ȭ �Ҷ� ���� ����
		char[] arr = new char[] {'a','b','c','d','e','f','g','h','i','j'};
		
		//�ݺ����� ���Ͽ� ����
		char[] arr2 = new char[10];
		for(int i = 0 ; i <arr.length ; i++) {
			int j = i + 65;
			System.out.println((char)j);
			arr2[i] = (char)j;
		}
		

		System.out.println(arr);
		System.out.println(arr2);
		*/
		
		double[] data = new double[5];
		
		data[0] = 10.0;
		data[1] = 20.0;	
		data[2] = 30.0;	
		
		for (int i = 0 ; i < data.length; i++) {
			System.out.println(data[i]);
		}
		
		

	}

}
