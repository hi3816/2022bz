package bookArrayListEx;

import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		ArrayList<Book> bookArrayList = new ArrayList<Book>();
		bookArrayList.add(new Book("å1","����1"));
		bookArrayList.add(new Book("å2","����2"));
		bookArrayList.add(new Book("å3","����3"));
		bookArrayList.add(new Book("å4","����4"));
		
		for(int i = 0; i <4; i ++) {
		Book book = bookArrayList.get(i);
		book.showInfo();
		
		// bookArrayList.get(i).showInfo(); //�ᱹ�� ���� ���٤�
		
		}
		
		

	}

}
