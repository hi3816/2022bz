package exex;

public class main {

	public static void main(String[] args) {
		Book[] library = new Book[5];
		/*
		library[0] = new Book("å�̸�1","�۰��̸�1");
		library[1] = new Book("å�̸�2","�۰��̸�2");
		library[2] = new Book("å�̸�3","�۰��̸�3");
		library[3] = new Book("å�̸�4","�۰��̸�4");
		library[4] = new Book("å�̸�5","�۰��̸�5");
		
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
		
		bookArray1[0] = new Book("å�̸�1","å����1");
		bookArray1[1] = new Book("å�̸�2","å����2");
		bookArray1[2] = new Book("å�̸�3","å����3");
		
		System.arraycopy(bookArray1,0,bookArray2,0,3);
		
		for(int i = 0;i<bookArray1.length;i++) {
			System.out.println(bookArray2[i].getAuthor());
			System.out.println(bookArray2[i].getBookName());
		}
	}

}
