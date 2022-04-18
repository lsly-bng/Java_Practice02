package com.javaex.practice;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("나이를 입력해주세요.");
		System.out.print("나이:");
		age = sc.nextInt();
		
		if(age>20) {
			System.out.print("\"1번그룹\"");
		}
		else {
			System.out.print("\'2번그룹\'");
		}
		System.out.println("입니다.");
		
		/*
		 * 입력값이 20보다 크면 "1번그룹" 으로 표기되고, 
		 * 입력값이 20보다 작으면 '2번그룹'으로 표기된다.
		 * "" 혹은 '' 을 출력하려면 기호 앞에 \(backslash)를 붙여야 한다.
		 * <입니다.> 부분은 현재 다음 줄로 출력되니 <"1번그룹">과 <'2번그룹'> 부분에 println 에서 ln을 제외하면 그룹명 옆으로 출력된다.
		 * 더 보기 좋게 만들기 위해 수정한다. 
		 */ 
		   
		/*예: 나이를 입력해주세요.
		   	  나이: 18 
		   	  '2번그룸'입니다.
		   	  
		 *예: 나이를 입력해주세요.
		     나이: 21
		     "1번그룹"입니다.
		*/   	  
		
		sc.close();
	}

}
