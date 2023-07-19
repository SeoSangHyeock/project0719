package j0719;

import java.util.Scanner;

public class exam08 {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num=s1.nextInt();
		
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}

	}

}
