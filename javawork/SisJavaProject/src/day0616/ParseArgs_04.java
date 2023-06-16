package day0616;

public class ParseArgs_04 {

	public static void main(String[] args) {
		/* main에서 실행할때 args로 변수 넘기는 문제
		 * 변수명: sangName,su,dan,total
		 * 
		 * 1.변수선언
		 * 2.계산
		 * 3.출력
		 * 
		 * [상품정보]
		 * 상품명: 갤럭시 폴드
		 * 수량: 5개
		 * 단가: 800000원
		 * 총금액: 4000000원
		 */
		
		
		/*String sangName = "갤럭시폴드";
		int su = 5;
		long dan = 800000;
		long total = dan*su;
		
		
		System.out.println("[상품정보]");
		System.out.println("상품명: "+ sangName);
		System.out.println("수량: "+ su+"개");
		System.out.println("단가: "+ dan+"원");
		System.out.println("총금액: "+ total+ "원");
		*/
		
		
		//1.변수선언
		String sangName = args[0];
		int su = Integer.parseInt(args[1]);
		long dan = Long.parseLong(args[2]);
		long total;
		
		//2.계산
		total = su*dan;
		
		
		
		System.out.println("[상품정보]");
		System.out.println("상품명: "+ sangName);
		System.out.println("수량: "+ su+"개");
		System.out.println("단가: "+ dan+"원");
		System.out.println("총금액: "+ total+ "원");
		
	}

}
