package d0719;

import java.util.Scanner;

public class test03 {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		
		System.out.print("원기둥 밑면의 반지름은? ");
		float rad=s1.nextFloat();//밑면의 반지름 입력
		
		System.out.print("원기둥의 높이는? ");
		float height=s1.nextFloat();//밑면의 높이 입력
		
		final float pi=3.14f;//파이 상수고정
		
		float V=rad*rad*height*pi;//원기둥의 부피 계산
		
		System.out.print("원기둥의 부피는 "+V);

	}

}
