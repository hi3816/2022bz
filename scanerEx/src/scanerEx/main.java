package scanerEx;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		System.out.println("ArrayList���� ���� ���α׷� ����");
		ArrayList<People> people = new ArrayList<People>();
//		people.add(new People("�̼���", 4.5));
//		people.add(new People("������", 4.5));
//		people.add(new People("ȫ�籤", 4.5));
//		people.add(new People("�ŵ���", 4.5));
//		people.add(new People("��μ�", 4.5));
//		people.add(new People("���̸�", 4.2));
//		people.add(new People("���̸�", 3.9));
//		people.add(new People("ȫ�̸�", 2.4));
//		people.add(new People("���̸�", 1.7));
//		people.add(new People("���̸�", 2.8));
		
		Scanner scan = new Scanner(System.in); //��ĳ�ʸ� ����ϰڴ�.
		
		//�ʱ�ȭ ������ ����
		String name;
		double score;
		double total = 0.0;
		
		for(int i =0 ; i <3; i++) {
			System.out.println("�̸��� ������ �Է��ϼ���");
			name = scan.next();
			score = scan.nextDouble();
			people.add(new People(name,score));
			scan.nextLine();
			total += people.get(i).getScore();//�ν��Ͻ� �����ϰ� ������ ���Ѵ�
		}
		scan.close();
		
		
		
		System.out.println("--������ 4.0 �̻��� �ο� ���--");
		for (int i = 0; i <people.size();i++) {
			if (people.get(i).getScore() >= 4.0) {
				System.out.println("�̸� : " + people.get(i).getName() + "���� : "+ people.get(i).getScore());
			
			}
			
			
			
			
		}
		System.out.println("--------------------------");
		System.out.println("--��ü �ο��� ���� ���--");
		System.out.println("��ü������� : " + total/people.size());
		System.out.println("--------------------------");

	}

}
