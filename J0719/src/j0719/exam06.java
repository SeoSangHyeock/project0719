package j0719;

import java.util.Scanner;

public class exam06 {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		int mon;
		do {
			System.out.print("올바른 월을 입력하세요[1~12]: ");
			mon=s1.nextInt();
		}while(mon<1 || mon>12);
	}

}
