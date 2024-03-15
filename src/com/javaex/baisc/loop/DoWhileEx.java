package com.javaex.baisc.loop;

public class DoWhileEx {
	//  정해지지 않은 수의 정수를 입력, 확산
	// 0이 입력되면 종료
	public static void main(String[] args) {
		// 합산 변수
		int total = 0, num;
		// 스캐너 열기
		Scanner scanner = new Scanner(System.in);
		
		// 스캐너로부터 점수 입력
		do {
			System.out.println("점수를 입력하세요. 0이면 종료:");
			num = scanner.nextInt();
			total += num;
		// 0이면 합산 종료
		// 0이 아니면 입력 계속 받기
		} while (num != 0);
		// 스캐너 종료
	
		Scanner.close();

	}

}
