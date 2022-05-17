package exex;

public class main {

	public static void main(String[] args) {
		Book[] library = new Book[5];
		/*
		library[0] = new Book("책이름1","작가이름1");
		library[1] = new Book("책이름2","작가이름2");
		library[2] = new Book("책이름3","작가이름3");
		library[3] = new Book("책이름4","작가이름4");
		library[4] = new Book("책이름5","작가이름5");
		
		for (int i = 0 ;i < library.length;i++) {
			System.out.println("------------------------");
			System.out.println(library[i].getBookName());
			System.out.println(library[i].getAuthor());
			System.out.println("------------------------");
			
		}
		*/
		/*
		int[] array1 = {10,20,30,40,50};
		int[] array2 = {1,2,3,4,5};
		
		System.arraycopy(array1,0,array2,0,4);
		for (int i = 0;i<array1.length;i++) {
			System.out.println(array2[i]);
		}
		*/
		
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("책이름1","책저자1");
		bookArray1[1] = new Book("책이름2","책저자2");
		bookArray1[2] = new Book("책이름3","책저자3");
		
		System.arraycopy(bookArray1,0,bookArray2,0,3);
		
		for(int i = 0;i<bookArray1.length;i++) {
			System.out.println(bookArray2[i].getAuthor());
			System.out.println(bookArray2[i].getBookName());
		}
	}

}
