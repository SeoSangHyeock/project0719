package d0719;

import java.util.Scanner;

public class test02 {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);

		System.out.print("주행거리를 입력하세요:");
		Double distance=s1.nextDouble(); //주행거리 입력
		System.out.print("사용한 휘발유 양을 입력하세요:");
		Double oil=s1.nextDouble(); //사용한 휘발유 양 입력
		
		Double eff=distance/oil; //연비계산
		
		System.out.println("연비: "+eff);
		
	}

}
