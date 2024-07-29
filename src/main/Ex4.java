package main;

public class Ex4 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		try {
			arr[5] = 5; //ArrayIndexOutOfBoundsException 에러 발생
		} catch (ClassCastException e) { //일치하는 catch문이 없어서 예외처리 안됨
			System.out.println(e); 
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		
		//에러가 나도 마지막 문장이 실행됨
		System.out.println("프로그램이 정상적으로 종료되었습니다.");

	}

}
