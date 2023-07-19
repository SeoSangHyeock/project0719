package j0719;

import java.util.Scanner;

public class exam02 {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.print("출력할 단 입력 : ");
		int dan=s1.nextInt();
		int i=1;
		while(i<10) {
			
			System.out.printf("%d*%d=%d\n",dan,i,dan*i);
			i++;
		}
		
		for(int j=1;j<10;j++) {
			System.out.printf("%d*%d=%d\n");
		}

	}

}
