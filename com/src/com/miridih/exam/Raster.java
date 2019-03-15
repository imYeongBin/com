package com.miridih.exam;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;


import java.io.InputStream;
import java.io.PrintStream;

public class Raster implements Solver {
	
	public static void main(String[] args) {
		new Raster().solve(System.in, System.out);	
	}
	
/*	
	 * 문제 풀이 메인 메소드   
	 * @param in 테스트 케이스 입력을 받이들이는 InputStream
	 * @param out 결과값을 출력할 PrintStream 
*/
	 		
	public void solve(InputStream in, PrintStream out) {

		//String BF = "E:\\Work\\miri-exam\\sample\\";
		//String fileName = "래스터그래픽-input00.txt";

		String BF = "WebContent\\sourceFiles\\";
		String fileName = "래스터그래픽-input00.txt";
		
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
		String[] arr = str.split("\n");//20 16\n9 6 5\n16 14 8 14
		System.out.println("arr의 length : "+arr.length);
		try {
			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		String answer="";
		int w=0;
		int h=0;
		int x_circle=0;
		int y_circle=0;
		int r=0;
		int x1=0;
		int y1=0;
		int x3=0;
		int y3 =0;
		
		
		
		int array_number = 0;	//대표 케이스로 첫번째 예시를 설정
		for (array_number = 0; array_number < arr.length; array_number++) {//전체 케이스를 위한 for문

			String values_str = arr[array_number];		//arr[0] = "20 16"
			String[] value_str = values_str.split(" "); //value_str[0]=20    value_str[1]=16
			if(array_number==0) {
				w = Integer.parseInt(value_str[0]);
				h = Integer.parseInt(value_str[1]);
			}
			if(array_number==1) {
				x_circle = Integer.parseInt(value_str[0]);
				y_circle = Integer.parseInt(value_str[1]);
				r = Integer.parseInt(value_str[2]);
			}
			if(array_number==2) {				
				x1 = Integer.parseInt(value_str[0]);
				y1 = Integer.parseInt(value_str[1]);
				x3 = Integer.parseInt(value_str[2]);
				y3 = Integer.parseInt(value_str[3]);
			}
			answer +="\r\n";

		} // 최외각 for문 닫는 괄호
			//////////////////////////////////////////////////////////////////////////////
			// algorithm
			// w, h, x_circle, y_circle, r, x1, y1, x3, y3
			//////////////////////////////////////////////////////////////////////////////

/*		
 		System.out.println("w : "+w);
		System.out.println("h : "+h);
		System.out.println("x_circle : "+x_circle);
		System.out.println("y_circle : "+y_circle);
		System.out.println("r : "+r);
		System.out.println("x1 : "+x1);
		System.out.println("y1 : "+y1);
		System.out.println("x3 : "+x3);
		System.out.println("y3 : "+y3);
		*/
//////////////////////////////////////////////////////////////////////////////
// algorithm
// w, h, x_circle, y_circle, r, x1, y1, x3, y3
//
//
//
//
//
//////////////////////////////////////////////////////////////////////////////
		
		
		
		
		
		

		OutputStream os = null;
		try {
			os = new FileOutputStream("E:\\Work\\miri-exam\\sample\\래스터그래픽output00.txt");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		byte[] out_byte = answer.getBytes();
		try {
			os.write(out_byte);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
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

