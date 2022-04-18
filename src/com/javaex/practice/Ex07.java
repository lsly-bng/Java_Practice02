package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.print("첫번째 숫자: ");
		int no1 = sc.nextInt();
		
		System.out.print("두번째 숫자: ");
		int no2 = sc.nextInt();
		
		//몫
		if(no1>no2) {
			System.out.println("몫: "+(no1/no2));
		}
		else {
			System.out.println("몫: "+(no2/no1));
		}
		//나머지
		if(no1>no2) {
			System.out.println("나머지: "+(no1%no2));
		}
		else {
			System.out.println("나머지: "+(no2%no1));
		}
		
		sc.close();
	}

}
