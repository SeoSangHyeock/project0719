package d0719;

import java.util.Scanner;

public class test09 {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		
		System.out.print("학점을 입력하세요 ==> ");
		String grade=s1.next();//학점 입력
		
		switch(grade) {
		case "A":
		case "B":
			System.out.println("참 잘하셨습니다.");
			break;
		case "C":
		case "D":
			System.out.println("좀 더 노력하세요.");
			break;
		default:
			System.out.println("잘못된 학점입니다.");
		}//결과 출력
	}

}
