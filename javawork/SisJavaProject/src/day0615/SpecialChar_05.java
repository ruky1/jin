package day0615;

public class SpecialChar_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문자열 내에서 특별한 의미로 해석되는 문자를 이스케이프 시퀀스(Escape Sequence)
		// 이스케이프 시퀀스(Escape Sequence)는 모두 \로 시작함
		/*
		 * \t 다음탭위치로 이동 (탭 한번 한것)
		 * \n 다음줄로 이동
		 * \" 쌍따옴표
		 * \' 홑따옴표
		 * \\ 백슬래시
		 */
		System.out.println("Apple\tMellon");
		System.out.println("Orange\tKiwi\tBanana");
		System.out.println("Apple\\");
		System.out.println("Apple\"");
		System.out.println("Apple\'");
		//"Hello"
		System.out.println("\"Hello\"");
		//c:\
		System.out.println("c:\\");
		
		//Q : "red", "green", "blue"
		System.out.println("\"red\", \"green\", \"blue\"");
	}

}
