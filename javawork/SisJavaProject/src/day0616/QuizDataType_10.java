package day0616;

public class QuizDataType_10 {

	public static void main(String[] args) {
		/* 매개변수(args)를 이용하여 출력해보세요  
		 * 
		 * 
		 * [시험결과]
		 * Java=88,Jsp=77,Spring=99
		 * 총점: 264		 
		 * 평균 : 88.00 점
		 *  */
		int java = Integer.parseInt(args[0]);
		int jsp = Integer.parseInt(args[1]);
		int spring = Integer.parseInt(args[2]);
		int count=3;
		int total = java+jsp+spring;
		double avg = (double)total/count;
		
		//출력
		
		System.out.println("[시험결과]");
		System.out.println("Java="+java+" ,Jsp="+jsp+" ,Spring="+spring);
		System.out.println("총점 : "+total);
		System.out.printf("평균 %.2f 점",avg);
/*		printf문으로만 출력
 * 		System.out.printf("\njava=%d,jsp=%d,spring=%d \n총점: %d\n평균 : %.2f 점",java,jsp,spring,total,avg);
	*/	
	}

}
