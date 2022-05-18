package bookArrayEx2;

public class main {

	public static void main(String[] args) {
		Book[] library1 = new Book[5];
		
		library1[0] = new Book("1저자1","1책1");
		library1[1] = new Book("1저자2","1책2");
		library1[2] = new Book("1저자3","1책3");
		library1[3] = new Book("1저자4","1책4");
		library1[4] = new Book("1저자5","1책5");


		
		Book[] library2 = new Book[5];
		
		System.arraycopy(library1,0,library2,0,library1.length);
		
		for(int i =0;i<library1.length;i++) {
			library2[i].showInfo();
		}
		
		
		Book[] library3 = new Book[5];
		for (int i =0 ; i < library1.length;i++) {
			library3[i] = new Book("3저자1","3책1");
		}
		System.out.println(library1[0].hashCode());
		System.out.println(library2[0].hashCode());
//		library3[1] = new Book("3저자2","3책2");
//		library3[2] = new Book("3저자3","3책3");
//		library3[3] = new Book("3저자4","3책4");
//		library3[4] = new Book("3저자5","3책5");
		
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
