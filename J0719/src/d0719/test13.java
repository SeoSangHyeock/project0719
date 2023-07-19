package d0719;

import java.util.Scanner;

public class test13 {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		
		int moneysum=0;// 초기 총수입 0원설정
		
		for(int i=0;i<10;i++) {
		System.out.print("요금을 입력하세요: ");
		int money=s1.nextInt();
		i=1;
		moneysum += money;//moneysum =moneysum+money
			if(moneysum>100000) {
				break;
			}
		}//100000초과시 멈춤
		
		System.out.printf("총수입은 %d이다.",moneysum);
		//결과출력
	}
}
