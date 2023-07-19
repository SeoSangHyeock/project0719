package d0719;

import java.util.Scanner;

public class test06 {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int num1=s1.nextInt();//정수 입력
		
		if(num1%7==0) {
			System.out.printf("%d은 7의 배수입니다.",num1);
		}else {
			System.out.printf("%d은 7의 배수가 아닙니다.",num1);
		}// 결과출력

	}

}
