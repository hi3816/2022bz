package bookArrayListEx;

import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		ArrayList<Book> bookArrayList = new ArrayList<Book>();
		bookArrayList.add(new Book("책1","저자1"));
		bookArrayList.add(new Book("책2","저자2"));
		bookArrayList.add(new Book("책3","저자3"));
		bookArrayList.add(new Book("책4","저자4"));
		
		for(int i = 0; i <4; i ++) {
		Book book = bookArrayList.get(i);
		book.showInfo();
		
		// bookArrayList.get(i).showInfo(); //결국엔 위랑 같다ㄴ
		
		}
		
		

	}

}
