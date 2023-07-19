package d0719;

import java.util.Scanner;

public class test15 {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		
		System.out.print("출력할 단을 입력하세요 : ");
		int num1=s1.nextInt();//몇 단으로 할건지 입력
		
		for(int i=1;i<10;i++) {
			
			int result=num1*i;//구구단 계산식
			System.out.printf("\n%d X %d = %d",num1,i,result);
		}

	}

}
