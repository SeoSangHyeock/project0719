package d0719;

import java.util.Scanner;

public class test07 {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		
		System.out.print("첫 번째 수를 입력 하세요(실수) : ");
		double num1=s1.nextDouble();
		System.out.print("두 번째 수를 입력 하세요(실수) : ");
		double num2=s1.nextDouble();//실수 입력
		
		double Sum1=num1+num2;
		System.out.printf("%.2f + %.2f = %.2f",num1,num2,Sum1);
		double Sum2=num1-num2;
		System.out.printf("\n%.2f - %.2f = %.2f",num1,num2,Sum2);
		double Sum3=num1*num2;
		System.out.printf("\n%.2f * %.2f = %.2f",num1,num2,Sum3);
		double Sum4=num1/num2;
		System.out.printf("\n%.2f / %.2f = %.2f",num1,num2,Sum4);
		double Sum5=num1%num2;
		System.out.printf("\n%.2f %% %.2f = %.2f",num1,num2,Sum5);
		// 사칙연산 출력

	}

}
