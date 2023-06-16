package day0616;

import java.util.Calendar;

public class MyAge_12 {

	public static void main(String[] args) {
		// 매개변수 args에서 실행시 이름과 태어난 연도를 보낸후 출력하세요(name,myBirth)
		// 이름: 김석진
		// 태어난 연도: 1998년도
		// 나이: 26세
		
		//현재년도는 Calendar Import하여 구할수 있다

		
		//1.import
		Calendar cal=Calendar.getInstance();
		
		//2.변수
		String name = args[0];
		int myBirth = Integer.parseInt(args[1]);
		int curYear = cal.get(cal.YEAR);
		int age = curYear-myBirth+1;
		
		System.out.println("이름: " + name );
		System.out.println("태어난 연도: "+ myBirth+"년도");
		System.out.println("나이: "+((cal.get(cal.YEAR))-myBirth+1)+"세");
		System.out.println(age);
	}

}
