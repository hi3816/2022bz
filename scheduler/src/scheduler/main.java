package scheduler;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//scanner를 통하여 char 문자열을 입력받도록 한다.
		char ch = 'R';
		boolean isSupport = true;
		Scheduler scheduler = null;
		
		Scanner scan = new Scanner(System.in);
		ch = scan.next().charAt(0);
		scan.close();
		
		if (ch == 'R' || ch == 'Y') {
			scheduler = new RoundRobin();
		}
		else if( ch =='L' || ch =='l') {
			scheduler = new LeastJob();
		}
		else if( ch =='P' || ch =='p') {
			scheduler = new PriorityAllocation();
		}
		else {
			System.out.println("지원하지않는 기능입니다.");
			isSupport = false;
		}
		if(isSupport == true) {
			scheduler.getNextCall();
			scheduler.sendCallToAgent();
			
		}
		
		
		
	}

}
