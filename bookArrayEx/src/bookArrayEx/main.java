package bookArrayEx;

public class main {

	public static void main(String[] args) {
		//Book[] bookArr= new Book[5];
		Book[] bookArr1= new Book[3];
		Book[] bookArr2= new Book[3];
		
		/*
		bookArr[0] = new Book("해리포터","롤링");
		bookArr[1] = new Book("해리포터2","롤링");
		bookArr[2] = new Book("해리포터3","롤링");
		bookArr[3] = new Book("해리포터4","롤링");
		bookArr[4] = new Book("해리포터5","롤링");
		
		for (int i = 0;i<bookArr.length;i++) {
			System.out.println("책 이름은 : "+bookArr[i].getBookName());
			System.out.println("책 저자 : "+bookArr[i].getAuthor());
		}
		*/
		bookArr1[0] = new Book("책1","저자1");
		bookArr1[1] = new Book("책2","저자2");
		bookArr1[2] = new Book("책3","저자3");
		
		System.arraycopy(bookArr1,0,bookArr2,0,bookArr1.length);
		for (int i = 0 ;i < bookArr2.length; i ++) {
			System.out.println("---------------------------------------");
			System.out.println(bookArr2[i].getBookName());
			System.out.println(bookArr2[i].getAuthor());
			System.out.println("---------------------------------------");
			System.out.println(bookArr1[i].getBookName());
			System.out.println(bookArr1[i].getAuthor());
			System.out.println("---------------------------------------");
		}
		
		bookArr1[0].setBookName("책4");
		bookArr1[0].setAuthor("저자4");
		
		for(int i = 0 ; i < bookArr1.length; i ++) {
			System.out.println(bookArr1[i].getBookName());
			System.out.println(bookArr1[i].getAuthor());
		}
	}

}
