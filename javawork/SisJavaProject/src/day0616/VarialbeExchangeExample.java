package day0616;

public class VarialbeExchangeExample {

	public static void main(String[] args) {
		//변수 x와 y 초기화
		int x = 3;
		int y = 5;
		System.out.println("x:" + x +" y:"+y);
		int temp = x;
		x=y;
		y= temp;
		System.out.println("x:" + x +" y:"+y);
		
	}

}
