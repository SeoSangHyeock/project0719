package d0719;

import java.util.Scanner;

public class test04 {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		
		System.out.print("첫번째 수를 입력하세요 : ");
		int num1=s1.nextInt();
		System.out.print("두번째 수를 입력하세요 : ");
		int num2=s1.nextInt();// 정수 입력

		int Sum1=num1+num2;
		System.out.printf("%d + %d = %d",num1,num2,Sum1);
		int Sum2=num1-num2;
		System.out.printf("\n%d - %d = %d",num1,num2,Sum2);
		int Sum3=num1*num2;
		System.out.printf("\n%d * %d = %d",num1,num2,Sum3);
		int Sum4=num1/num2;
		System.out.printf("\n%d / %d = %d",num1,num2,Sum4);
		int Sum5=num1%num2;
		System.out.printf("\n%d %% %d = %d",num1,num2,Sum5);
		// 사칙연산 출력
	}

}
