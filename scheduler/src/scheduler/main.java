package scheduler;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//scanner�� ���Ͽ� char ���ڿ��� �Է¹޵��� �Ѵ�.
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
			System.out.println("���������ʴ� ����Դϴ�.");
			isSupport = false;
		}
		if(isSupport == true) {
			scheduler.getNextCall();
			scheduler.sendCallToAgent();
			
		}
		
		
		
	}

}
