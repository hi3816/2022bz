package bookArrayEx2;

public class main {

	public static void main(String[] args) {
		Book[] library1 = new Book[5];
		
		library1[0] = new Book("1����1","1å1");
		library1[1] = new Book("1����2","1å2");
		library1[2] = new Book("1����3","1å3");
		library1[3] = new Book("1����4","1å4");
		library1[4] = new Book("1����5","1å5");


		
		Book[] library2 = new Book[5];
		
		System.arraycopy(library1,0,library2,0,library1.length);
		
		for(int i =0;i<library1.length;i++) {
			library2[i].showInfo();
		}
		
		
		Book[] library3 = new Book[5];
		for (int i =0 ; i < library1.length;i++) {
			library3[i] = new Book("3����1","3å1");
		}
		System.out.println(library1[0].hashCode());
		System.out.println(library2[0].hashCode());
//		library3[1] = new Book("3����2","3å2");
//		library3[2] = new Book("3����3","3å3");
//		library3[3] = new Book("3����4","3å4");
//		library3[4] = new Book("3����5","3å5");
		
		System.out.println("--------------------------");
		for (int i =0 ; i < library1.length;i++) {
			library3[i].showInfo();
			System.out.println(library3[i].hashCode());
			System.out.println(library1[i].hashCode());
		}
		System.out.println("--------------------------");
		System.out.println("--------------------------");
		for(int i = 0;i<library1.length;i++) {
			library3[i].setAuthor(library1[i].getAuthor());
			library3[i].setBookName(library1[i].getBookName());
			library3[i].showInfo();
			System.out.println(library3[i].hashCode());
			System.out.println(library1[i].hashCode());
		}
		
		System.out.println("--------------------------");
		
//		library3[0].setAuthor(library1[0].getAuthor());
//		library3[0].setBookName(library1[0].getBookName());
//		library3[0].showInfo();
		
		
	}

}
