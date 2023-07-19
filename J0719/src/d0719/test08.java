package d0719;

import java.util.Scanner;

public class test08 {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		
		System.out.print("정수를 입력 하세요 : ");
		int num1=s1.nextInt();//정수입력
		
		if(num1>100) {
			System.out.print("100보다 크군요..");
		}else if(num1<100) {
			System.out.print("100보다 작군요..");
		}else
			System.out.print("100과 같군요..");
		//결과 출력

	}

}
