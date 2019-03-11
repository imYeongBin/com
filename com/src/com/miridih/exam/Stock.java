/*package com.miridih.exam;


import java.io.InputStream;
import java.io.PrintStream;


public class Stock implements Solver{
	  
	public static void main(String[] args) {
		new Stock().solve(System.in, System.out);		
	}
	
	
	 * 문제 풀이 메인 메소드   
	 * @param in 테스트 케이스 입력을 받이들이는 InputStream
	 * @param out 결과값을 출력할 PrintStream 
	 
		
	public void solve(InputStream in, PrintStream out) {
		//예시
		int testCase = 3;
		int []days = {3,3,4};
		int [][]prices= {{5,3,2} , {1,2,100} , {1,3,1,2} };
		
		//전체 구매금액 (구매주식1 * 당일 주가)
		int tot = 0;		
		// 내부 반복  :  days 만큼 prices[][here]
		// 외부 반복  :  testCase 만큼 prices[here][]
		int idx_a=0;
		for(idx_a=0;idx_a<prices[0].length;idx_a++) {
			//오늘 예측가 > 내일 예측가  (주가 하락)
			if(prices[0][idx_a] > prices[0][idx_a+1]) {
				tot +=prices[0][idx_a];
				System.out.println("전체금액"+tot);
			}	
		}
		
		
		
	}

}
*/