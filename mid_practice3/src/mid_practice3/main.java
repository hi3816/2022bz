package mid_practice3;

import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		System.out.println("ArrayList학점 관리 프로그램 시작");
		ArrayList<People> people = new ArrayList<People>();
		people.add(new People("이선민", 4.5));
		people.add(new People("박재현", 4.5));
		people.add(new People("홍재광", 4.5));
		people.add(new People("신도현", 4.5));
		people.add(new People("김민수", 4.5));
		people.add(new People("이이름", 4.2));
		people.add(new People("박이름", 3.9));
		people.add(new People("홍이름", 2.4));
		people.add(new People("신이름", 1.7));
		people.add(new People("김이름", 2.8));
		
		double total = 0;
		
		System.out.println("--학점이 4.0 이상인 인원 목록--");
		for (int i = 0; i <people.size();i++) {
			People peopleC = people.get(i);
			if (peopleC.getScore() >= 4.0) {
				System.out.println("이름 : " + peopleC.getName() + "성적 : "+ peopleC.getScore());
			
			}
			total += peopleC.getScore();
			
			
			
			
		}
		System.out.println("--------------------------");
		System.out.println("--전체 인원의 학점 평균--");
		System.out.println("전체성적평균 : " + total/people.size());
		System.out.println("--------------------------");
			
		

	}

}
