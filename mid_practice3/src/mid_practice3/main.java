package mid_practice3;

import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		System.out.println("ArrayList���� ���� ���α׷� ����");
		ArrayList<People> people = new ArrayList<People>();
		people.add(new People("�̼���", 4.5));
		people.add(new People("������", 4.5));
		people.add(new People("ȫ�籤", 4.5));
		people.add(new People("�ŵ���", 4.5));
		people.add(new People("��μ�", 4.5));
		people.add(new People("���̸�", 4.2));
		people.add(new People("���̸�", 3.9));
		people.add(new People("ȫ�̸�", 2.4));
		people.add(new People("���̸�", 1.7));
		people.add(new People("���̸�", 2.8));
		
		double total = 0;
		
		System.out.println("--������ 4.0 �̻��� �ο� ���--");
		for (int i = 0; i <people.size();i++) {
			People peopleC = people.get(i);
			if (peopleC.getScore() >= 4.0) {
				System.out.println("�̸� : " + peopleC.getName() + "���� : "+ peopleC.getScore());
			
			}
			total += peopleC.getScore();
			
			
			
			
		}
		System.out.println("--------------------------");
		System.out.println("--��ü �ο��� ���� ���--");
		System.out.println("��ü������� : " + total/people.size());
		System.out.println("--------------------------");
			
		

	}

}
