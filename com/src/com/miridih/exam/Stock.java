package com.miridih.exam;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class Stock implements Solver {

	public static void main(String[] args) {
		new Stock().solve(System.in, System.out);
	}
	/*
	 * 문제 풀이 메인 메소드
	 * 
	 * @param in 테스트 케이스 입력을 받이들이는 InputStream
	 * 
	 * @param out 결과값을 출력할 PrintStream
	 */

	public void solve(InputStream in, PrintStream out) {
		String BF = "D:/Work/miri-exam/sample/";
		String inputfileName = "주식투자-input02.txt";
		String outputfileName = "주식투자-output02.txt";
		byte[] b = new byte[4096];
		InputStreamReader reader = null;
		StringBuffer buf = new StringBuffer();
		in = null;
		try {
			in = new FileInputStream(BF + inputfileName);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			reader = new InputStreamReader(in, "utf-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		int i;
		try {
			while ((i = in.read(b)) != -1) {
				buf.append(new String(b, 0, i));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String str = buf.toString();
		String[] arr = str.split("\r\n");

		try {
			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String output_str = "";
		int array_number = 2;
		for (array_number = 2; array_number < arr.length; array_number += 2) {
			String prices = arr[array_number];
			String[] price = prices.split(" ");

			int size_array = price.length;
			int[] values = new int[price.length];
			values = change(price);

			int tot = 0;// 판매이익
			int bb = 0;

			//////////////////////////////////////////////////////////////////////////////
			// 주식가격이 max값인 전날까지 주식을 전부 산다.
			// max값에 주식을 전부 판다.
			// 남은 일 중 max값인 전날까지 주식을 전부 산다.
			// max값에 주식을 전부 판다.
			// max값인 날이 바로 다음날이면(start_idx=max_idx+1)이면 그날은 아무것도 하지 않는다.
			// 그 다음날부터 다시 max를 찾는다. 배열 내 마지막값이 max값으로 될 때 까지 반복
			//////////////////////////////////////////////////////////////////////////////
			// 초기화부분
			int pur = 0;// 구매비용
			int end_idx = size_array;
			int start_idx = 0;
			int max = 0;

			// 구간 시작값이 배열의 마지막값이 되면 종료되는 루프
			while (check_last(start_idx, values)) {
				tot += purchase(values,start_idx,end_idx,max,pur,bb);//구간배열, 시작, 종료, 총구매비용, 보유주식수
				start_idx = chk_idx(values,start_idx,end_idx)+1;//재귀함수를 이용하여, 구간내 최고값의 index를 다음 구간의 시작값으로 할당.				
			} // while 문 종료
			
			output_str += tot+ "\r\n";
			
		} // 최외각 for문 닫는 괄호
		// 출력 부분
		OutputStream os = null;
		try {
			os = new FileOutputStream(BF + outputfileName);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String output = output_str;
		byte[] out_byte = output.getBytes();
		try {
			os.write(out_byte);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static int purchase(int[] values, int start_idx, int end_idx, int max, int pur, int bb) {
		int tot = 0;
		max = chk_max(values, start_idx, end_idx);
		for (int a = start_idx; a < chk_idx(values, start_idx, end_idx); a++) {
			pur += values[a];
			bb++;
		}
		tot = bb * max - pur;
		bb = 0;
		return tot;
	}

//index가 배열arr의 마지막index인지 확인하는 함수
	private static boolean check_last(int index, int[] arr) {
		if (index == arr.length) {
			return false;
		}
		return true;
	}

	// 문자열인 배열 -> 정수형 배열로 캐스팅하는 함수
	private static int[] change(String[] str) {
		int sizeofString = str.length;
		int[] arr = new int[sizeofString];
		for (int a = 0; a < sizeofString; a++) {
			if (a == sizeofString) {// 주가의 마지막값이 \n을 포함해서 NumberFormatException이 발생
				arr[a] = Integer.parseInt(str[a].substring(0, str[a].length() - 1));
			} else {
				arr[a] = Integer.parseInt(str[a]);
			}

		}
		return arr;
	}

	// 지정 index까지 중에서 배열 내 최고값 구하는 함수
	private static int chk_max(int[] arr, int start_idx, int end_idx) {
		// TODO Auto-generated method stub

		if (start_idx < 0 || end_idx > arr.length) {
			System.out.println("범위가 틀립니다. 정확한 값을 입력해주세요");
			return -1;
		} else {
			int max = 0;
			for (int a = start_idx; a < end_idx; a++) {
				if (arr[a] > max) {
					max = arr[a];
				}
			}
			return max;
		}
	}

	// 구간(start_idx부터 end_idx까지) 내 최고값의 인덱스 구하는 함수
	private static int chk_idx(int[] arr, int start_idx, int end_idx) {
		// TODO Auto-generated method stub
		int idx = 0;
		if (start_idx < 0 || end_idx > arr.length) {
			System.out.println("범위가 틀립니다. 정확한 값을 입력해주세요");
			return -1;
		} else {
			int max = 0;
			for (int a = start_idx; a < end_idx; a++) {
				if (arr[a] > max) {
					max = arr[a];
					idx = a;
				}
			}
			return idx;
		}
	}
}
