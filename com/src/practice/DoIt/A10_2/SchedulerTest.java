package practice.DoIt.A10_2;

import java.io.IOException;

public class SchedulerTest {
	public static void main(String[] args) throws IOException{
		
		System.out.println("choose method");
		System.out.println("R : 차례대로 ");
		System.out.println("L : 대기가 적은 순으로 ");
		System.out.println("P : 우선순위가 높은 고객 순으로");
		
		int ch = System.in.read();
		
		Scheduler scheduler = null;
		
		if(ch=='R'||ch=='r') {
			scheduler = new RoundRobin();
		}else if(ch=='L'||ch=='l') {
			scheduler = new LeastJob();
		}else if(ch=='P'||ch=='p') {
			scheduler = new PriorityAllocation();
		}else {
			System.out.println("지원하지 않는 기능입니다.");
		}
		
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
	}
}
