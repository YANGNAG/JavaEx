package com.javaex.basic.conditional;

import java.util.Scanner;

public class SwitchPractice1 {
			// 90점 이상 이면 “A등급”
			// 80점 이상~89점 이면 “B등급”
			// 70점 이상~79점 이면 “C등급”
			// 60점 이상~69점 이면 “D등급”
			// 60점 미만이면 “F등급
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("점수를 입력하세요.");
		int num = scanner.nextInt();
		String message;
		
		switch(num / 10) {
		case 9:
			message = "A등급 입니다.";
			break;
		case 8:
			message = "B등급 입니다.";
			break;
		case 7:
			message = "C등급 입니다.";
			break;
		case 6:
			message = "D등급 입니다.";
			break;
		case 5:
			message = "F등급 입니다.";
			break;
		case 4:
			message = "F등급 입니다.";
			break;
		case 3:
			message = "F등급 입니다.";
			break;
		case 2:
			message = "F등급 입니다.";
			break;
		case 1:
			message = "F등급 입니다.";
			break;
		case 0:
			message = "F등급 입니다.";
			break;
		default:
			message = "잘 모르겠습니다.";
			break;
		}
		
		System.out.println(num + "는 " + message);
		scanner.close();

		
	}
	

}
