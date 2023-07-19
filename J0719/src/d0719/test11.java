package d0719;

import java.util.Scanner;

public class test11 {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		
		System.out.print("학생의 평점을 입력하세요: ");
		float score=s1.nextFloat();// 평점 입력
		
		if(score>=4.3) {
			System.out.println("전액 장학금이다");
		}else if(score>=4.0){
			System.out.println("반액 장학금이다");
		}else if(score>=3.7){
			System.out.println("모범 장학금이다");
		}else {
			System.out.println("장학금을 받을 수 없다");
		}// 결과 출력

	}

}
