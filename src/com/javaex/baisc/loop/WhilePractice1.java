package com.javaex.baisc.loop;

public class WhilePractice1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("단을 입력하세요:");
		int num = 1, dan;
		
		dan = scanner.nextInt();
			
		while(num <= 9) {
			System.out.println(dan + "*" + num + "=" + (dan * num) );
			num += 1;
		}
		scanner.close();
	
	}
	
}
