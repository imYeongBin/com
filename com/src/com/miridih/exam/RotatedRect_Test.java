package com.miridih.exam;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class RotatedRect_Test implements Solver {

	public static void main(String[] args) {
		new RotatedRect_Test().solve(System.in, System.out);
	}

	public void solve(InputStream in, PrintStream out) {

		String BF = "WebContent\\sourceFiles\\";
		String fileName = "test_rotate";

		byte[] b = new byte[4096];
		InputStreamReader reader = null;
		StringBuffer buf = new StringBuffer();
		in = null;

		try {
			in = new FileInputStream(BF + fileName);
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
		int array_number = 3;	//대표 케이스로 첫번째 예시를 설정
		//for (array_number = 2; array_number < arr.length; array_number += 2) {//전체 케이스를 위한 for문

			String values_str = arr[array_number];
			String[] value_str = values_str.split(" ");

			int size_array = value_str.length;
			int[] values_int = new int[value_str.length];

			values_int = change(value_str);
			
			
			int x1=0;
			x1 = values_int[0];
			int y1=0;
			y1 = values_int[1];
			int w =0;
			w = values_int[2];
			int h =0;
			h = values_int[3];
			int angle=0;
			angle = values_int[4];
			
			double new_x=0;
			double new_y=0;
			//////////////////////////////////////////////////////////////////////////////
			// x좌표:    x1-0.5w+0.5sqt(  pow(w,2)+pow(h,2)  )*cos( a+arctan( (w/2)/(h/2) ) )
			// y좌표:		y1-0.5h+0.5sqt(  pow(w,2)+pow(h,2)  )*sin( a+arctan( (w/2)/(h/2) ) )
		
			//////////////////////////////////////////////////////////////////////////////
			
			for(int a=0 ; a<values_int.length ; a++) {
				System.out.println("values_int["+a+"] : "+values_int[a]);
				
			}
			new_x = x1-0.5*w+0.5*Math.sqrt( Math.pow(w, 2)+Math.pow(h, 2) )*Math.cos(Math.toRadians(angle)+Math.atan2(h/2, w/2));
			new_y = y1-0.5*h+0.5*Math.sqrt( Math.pow(w, 2)+Math.pow(h, 2) )*Math.sin(Math.toRadians(angle)+Math.atan2(h/2, w/2));
			System.out.println(new_x);
			System.out.println(new_y);
		//} // 최외각 for문 닫는 괄호
		
		
		
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

}