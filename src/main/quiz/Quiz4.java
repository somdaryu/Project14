package main.quiz;

public class Quiz4 {

	public static void main(String[] args) {
		String str = "1.23";
		try {
			//.parseInt() 문자열 -> 숫자 변환
			int num = Integer.parseInt(str); //실수를 정수로 변환하려고 해서 에러남
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
