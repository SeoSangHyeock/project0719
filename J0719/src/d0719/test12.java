package d0719;

import java.util.Scanner;

public class test12 {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		
		System.out.print("시험 점수를 입력하세요: ");
		int score1=s1.nextInt();
		System.out.print("면접 점수를 입력하세요: ");
		int score2=s1.nextInt();
		// 점수 입력
		
		if (score1>=80 && score2>=60) {
			System.out.print("합격을 축하합니다");
		}else {
			System.out.print("아쉽지만 불합격입니다");
		}
		//결과 출력
	}

}
