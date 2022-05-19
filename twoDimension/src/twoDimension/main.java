package twoDimension;

import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.clear();//arrayList값 비워주기
		/*
		System.out.println(arrayList.size());
		
		arrayList.add("1번방");
		System.out.println(arrayList.size());
		System.out.println(arrayList.get(0));
		
		*/
		
		arrayList.add("aaaa");
		arrayList.add("bbbb");
		arrayList.add("cccc");
		//arrayList.add(123);//String으로 선언했으니 String만
		
		for(int i = 0; i < 3 ;i ++) {
			System.out.println(arrayList.get(i));
		}
		
		System.out.println(arrayList.remove(1));


	}

}
