package com.miridih.exam;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class TestStock2 {

	public static void main(String[] args) throws IOException {
		String filePath = "WebContent/sourceFiles/";
		String fileName = "주식투자-input02.txt";
		//String fileName = "test_stock.txt";
		byte[] b = new byte[4096];
		InputStreamReader reader = null;
		StringBuffer buf = new StringBuffer();
		FileInputStream fis = null;

		try {
			fis = new FileInputStream(filePath + fileName);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {
			reader = new InputStreamReader(fis, "utf-8");
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		int i;
		while ((i = fis.read(b)) != -1) {
			buf.append(new String(b, 0, i));
		}
		String str = buf.toString();
		String[]arr = str.split("\n");
		
		//System.out.println("arr length  : "+arr.length);
		reader.close();
/*		for(int e=0; e<arr.length;e++) {
			System.out.println("arr["+e+"] : "+arr[e]);
		}*/
		int array_number=2;
		for(array_number=2;array_number<arr.length;array_number+=2) {
			//prices들 배열 = arr[6]   1 3 1 2\n   
			
			String prices = arr[array_number];
			String[] price = prices.split(" ");	//price[0]=1    price[1]=3    price[2]= 1     price[3]=2
			//System.out.println("price.length"+price.length);
			int size_array = price.length;
			int[] values= new int[price.length];
	
			values = change(price);
			//System.out.println("max : "+chk_max(values));
			//System.out.println("max일 때 인덱스 : "+chk_idx(values));
			int tot=0;
			int bb=0;
			//max값인 전날까지 주식을 전부 산다.
			//max값에 주식을 전부 판다.
			//남은 일 중 max값인 전날까지 주식을 전부 산다.
			//max값에 주식을 전부 판다.
			//max값인 날이 바로 다음날이면(idx=idx+1)이면 그날은 아무것도 하지 않는다. 
			//그 다음날부터 다시 max를 찾는다. 배열 내 마지막값이 max값으로 될 때 까지 반복
			
			//구매금액
			int pur=0;
			
			int end_idx = size_array;		
			int start_idx = 0;
			int max=0;
			int max_idx=0;
	
				//구간 시작값이 배열의 마지막값이 되면 종료되는 루프
			while(check_last(start_idx,values)) {

				//System.out.println("start_idx : "+start_idx);
				
				max = chk_max(values,start_idx,end_idx);//			
				//System.out.println("max : "+max);
				
				max_idx = chk_idx(values,start_idx,end_idx);			
				//System.out.println("max_idx : "+max_idx);
				if(start_idx==max_idx) {
					//System.out.println("ddd");
				}

					for(int d = start_idx ;d<max_idx;d++) {
	
						pur += values[d];
						bb++;
						
					}
					//System.out.println("첫번째 누적 pur"+pur+", bb : "+bb);
					//구간합 = 구간내 구매한 주식 수 * 구간내 최고가
					tot += bb*max;	
					//System.out.println("tot : "+tot);

					bb = 0;				
					start_idx = max_idx+1;
						
			//while 문 종료 	
			}
			//max 전날까지 구매
			//System.out.println("순이익 : "+(tot-pur));
			System.out.println((tot-pur));
		}//최외각 for문 닫는 괄호

		
	}
	
	private static boolean check_last(int index, int[] arr) {
		if(index == arr.length) {
			return false;
		}
		return true;
	}
	
	
	//문자열인 배열 -> 정수형 배열로 캐스팅하는 함수//
	private static int[] change(String[] str) {
		int sizeofString = str.length;
		int[] arr = new int[sizeofString];
		for(int a = 0; a<sizeofString;a++) {
			if(a==sizeofString) {//주가의 마지막값이 \n을 포함해서 NumberFormatException이 발생
				arr[a] = Integer.parseInt(str[a].substring(0,str[a].length()-1));
			}else {
				arr[a] = Integer.parseInt(str[a]);	
			}
				
		}		
		return arr;
	}
	
	//지정 index까지 중에서 배열 내 최고값 구하는 함수 
	private static int chk_max(int[] arr,int start_idx, int end_idx) {
		// TODO Auto-generated method stub
		
		if(start_idx<0 || end_idx>arr.length) {
			System.out.println("범위가 틀립니다. 정확한 값을 입력해주세요");
			return -1;
		}else {		
			int max=0;
			for(int a=start_idx;a<end_idx;a++) {
				if(arr[a]>max) {
					max=arr[a];
				}
			}
			return max;
		}		
	}
	//배열 내 최고값의 인덱스 구하는 함수 
	private static int chk_idx(int[] arr,int start_idx, int end_idx) {
		// TODO Auto-generated method stub
		int idx=0;
		if(start_idx<0 || end_idx>arr.length) {
			System.out.println("범위가 틀립니다. 정확한 값을 입력해주세요");
			return -1;
		}else {		
			int max=0;
			for(int a=start_idx;a<end_idx;a++) {
				if(arr[a]>max) {
					max=arr[a];
					idx = a; 
				}
			}
			return idx;
		}
	}
}

