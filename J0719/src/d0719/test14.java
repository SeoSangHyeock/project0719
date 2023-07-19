package d0719;

import java.util.Scanner;

public class test14 {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		
		int bal=10000;//초기 카드 잔액설정
		
		for(int i=0;i<10;i++) {
			System.out.println("교통카드 잔액 : "+bal);
			//잔액 출력
			if(bal<1300) {
				System.out.print("잔액이 부족해 교통카드를 사용할 수 없습니다.");
				break;
			}//잔액부족 설정
			i=1;
			System.out.print("사용할 금액을 입력하세요. :");
			int fee=s1.nextInt();//사용할 금액 입력
			bal -= fee;//잔액=잔액-요금
		}

	}

}
