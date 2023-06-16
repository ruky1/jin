package day0616;

public class OperTest_07 {

	public static void main(String[] args) {
		// 기본자료형_8개
		//1.논리형_true,false
		boolean b=false;
		
		//2.문자형
		//반드시 하나의 문자 16비트 유니코드값 표현
		//자바에서 char 문자하나 2byte 약65000개의 문자를 표현 가능
		//기본적으로는 정수형, 아스키코드
		char ch='A';
		
		//3.정수형
		byte a=-128;//1byte -128~127까지 가능
		short s=32000;//2byte(16비트)
		int c=6700000;//4byte(32비트)
		long num=100L;//8byte(64비트), 뒤에 L,l을 붙혀야 long				
		//실수형
		double d=42356.14526;//8byte(64비트),소수점
		float f=3.12345678f;//4byte(32비트),소수점
		
		//int,float는 똑같이 32bit사용하지만 기본적으로 실수형이 정수형보다 큰타입으로 처리된다.
		
		//출력
		System.out.println("bool="+b);
		System.out.println("not bool="+!b);//대문자 A는 아스키코드 정수:65
		System.out.println("ch="+ch);//66
		System.out.println("ch="+(char)(ch+1));//B
		System.out.println("d="+d);//정밀도 15자리
		System.out.println("f="+f);//정밀도 8자리
		//printf %f:실수
		//전체자리수 10자리 소수점2자리
		System.out.printf("d=%10.2f\n",d);
		//소수점1자리
		System.out.printf("d=%.1f",d);
	}

}
