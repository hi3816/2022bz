package twoDimension;

import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.clear();//arrayList�� ����ֱ�
		/*
		System.out.println(arrayList.size());
		
		arrayList.add("1����");
		System.out.println(arrayList.size());
		System.out.println(arrayList.get(0));
		
		*/
		
		arrayList.add("aaaa");
		arrayList.add("bbbb");
		arrayList.add("cccc");
		//arrayList.add(123);//String���� ���������� String��
		
		for(int i = 0; i < 3 ;i ++) {
			System.out.println(arrayList.get(i));
		}
		
		System.out.println(arrayList.remove(1));


	}

}
