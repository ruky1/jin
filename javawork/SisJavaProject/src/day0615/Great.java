package day0615;

public class Great {

	public static void main(String[] args) {
		int math = 60;
		int english = 80;
		int sum = math + english;
		int average = sum / 2;
		System.out.println("\t================");
		System.out.println("\t\"학과 : "+ "\'" + args[0] +"\'"+"\"");
		System.out.println("\t\""+"학년은 "+"\'"+args[1] + "\'"+"학년입니다."+"\"");
		System.out.println("\t수학점수 : "+"\'"+math+"\'");
		System.out.println("\t영어점수 : "+"\'"+english+"\'");
		System.out.println("\t평균 : " + "\'"+average+"\'");
		System.out.println("\t================");
	}

}
