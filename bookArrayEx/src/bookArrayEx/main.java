package bookArrayEx;

public class main {

	public static void main(String[] args) {
		//Book[] bookArr= new Book[5];
		Book[] bookArr1= new Book[3];
		Book[] bookArr2= new Book[3];
		
		/*
		bookArr[0] = new Book("�ظ�����","�Ѹ�");
		bookArr[1] = new Book("�ظ�����2","�Ѹ�");
		bookArr[2] = new Book("�ظ�����3","�Ѹ�");
		bookArr[3] = new Book("�ظ�����4","�Ѹ�");
		bookArr[4] = new Book("�ظ�����5","�Ѹ�");
		
		for (int i = 0;i<bookArr.length;i++) {
			System.out.println("å �̸��� : "+bookArr[i].getBookName());
			System.out.println("å ���� : "+bookArr[i].getAuthor());
		}
		*/
		bookArr1[0] = new Book("å1","����1");
		bookArr1[1] = new Book("å2","����2");
		bookArr1[2] = new Book("å3","����3");
		
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
		
		bookArr1[0].setBookName("å4");
		bookArr1[0].setAuthor("����4");
		
		for(int i = 0 ; i < bookArr1.length; i ++) {
			System.out.println(bookArr1[i].getBookName());
			System.out.println(bookArr1[i].getAuthor());
		}
	}

}
