package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("수익을 입력해 주세요.");
		System.out.print("금액: ");
		double profit = sc.nextDouble();
		double tax;
		
		if(profit>=0&&profit<=1000) {
			tax=profit*0.09;
			System.out.println("소득세는 "+tax+" 입니다.");
		}
		else if (profit>1000&&profit<=4000) {
			tax=(1000*0.09)+0.18*(profit-1000);
			System.out.println("소득세는 "+tax+" 입니다.");
		}
		
		else if (profit>4000&&profit<8000) {
			tax=(1000*0.09)+(3000*0.18)+0.27*(profit-4000);
			System.out.println("소득세는 "+tax+" 입니다.");
		}
		
		else if (profit>=8000) {
			tax=(1000*0.09)+(3000*0.18)+(4000*0.27)+0.36*(profit-8000);
			System.out.println("소득세는 "+tax+" 입니다.");
		}
		
		else {
			System.out.println("잘 못 입력했습니다.");
		}
		
		sc.close();
	}

}
