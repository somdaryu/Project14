package main.quiz;

import java.util.Scanner;

public class Quiz5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		
		try {
			int num = scanner.nextInt(); // nextInt 정수값을 입력받는데, 다른 타입의 값이들어와서 에러남
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
