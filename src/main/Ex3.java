package main;

public class Ex3 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		try {
			arr[5] = 5; //index 범위를 벗어남
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e); //예외가 발생하면 처리할 코드 작성
		}
		
		//에러가 나도 마지막 문장이 실행됨
		System.out.println("프로그램이 정상적으로 종료되었습니다.");
	}

}
