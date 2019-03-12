package com.miridih.exam;

import java.util.Scanner;

public class prob2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		[A1][A2]....[An]으로 이루어진 배열이 있다. 이 배열에서 다음의 조건을 만족하는 요소 Ai가 있는지 검사하는 프로그램을 작성하시오
			1. Ai의 왼쪽에 있는 요소들의 합과 오른쪽에 있는 요소들의 합이 동일하다. 
			2. 왼쪽이나 오른쪽에 요소가 없다면 (A1이거나 An이라면) 합은 0으로 간주한다.
			즉 [A1] + [A2].... [Ai-1] = [Ai+1] + [Ai+2] + [An]
			
			▼입력 
			첫 번째 줄에 테스트 케이스의 수를 입력한다. 
			각 테스트 케이스에서 첫번째 줄은 배열의 크기 N을 그 다음 줄은 스페이스로 구분한 배열의 요소들을 입력받는다.
			
			▼출력 
			각각의 테스트 케이스에 대해서 Ai가 존재하면 YES를 그렇지 않으면 No를 출력한다.
		*/
		Scanner in = new Scanner(System.in);
		int N, k;
		
		while(true) {
			System.out.println("테스트할 케이스의 수를 입력하세요");
			N = in.nextInt();
			if(N<1) {
				System.out.println("1보다 작은 수는 입력하실 수 없습니다.");
			}else {
				break;
			}
		}
		//입력할 정수 배열을 만든다.
		int array[] = new int[N];
		System.out.println("정수를 "+N+"개 입력해주세요");
		for(int a=0;a<N;a++){
			array[a]=in.nextInt();
		};
		
		
		
		
		if(chk(array)) {
			System.out.println("찾음");
		}else {
			System.out.println("못찾음");
		}
		
		in.close();

		
	}
	
	
	private static boolean chk(int array[]) {
		
		int sum=0, leftsum, rightsum;
		int size = array.length;
		//i일 때 좌,우 합 구하기
		for(int i = 0; i<array.length;i++) {
			leftsum=0;
			rightsum=0;
			
			if(i==0) {
				leftsum=0;
			}else {
				//왼쪽 합 구하기
				for(int j=0; j<i;j++) {
					leftsum += array[j];	
				}
				
			}
			
			if(i==size-1) {
				rightsum=0;
			}else {
				//오른쪽 합 구하기
				for(int j=i+1; j<size;j++) {
					rightsum += array[j];	
				}
			}

			if(leftsum==rightsum) {
				System.out.println("좌우의 합이 같을 때는 i는 "+i);
				return true;
				
			}
			
		}
		
		
		return false;
	}
	

}
