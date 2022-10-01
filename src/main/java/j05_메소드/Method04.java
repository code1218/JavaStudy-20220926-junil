package j05_메소드;

import java.util.Scanner;

/**
 * 
 * @author ITPS
 *
 *	문제:
 *		국어(kor), 영어(eng), 수학(math) 성적을 입력받는다.
 *		3명
 *
 *		double kor1
 *		double kor2
 *		double kor3
 *
 *		double eng1
 *		double eng2
 *		double eng3
 *
 *		double math1
 *		double math2
 *		double math3
 *
 *>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
 *
 *		double total1
 *		double total2
 *		double total3
 *
 *		double avg1
 *		double avg2
 *		double avg3
 *
 *		getTotal(kor, eng, math)
 *
 *		getAvg(total)
 *
 *		printInfo(1, kor, eng, math, total, avg)		
 *
 *			1번 학생 점수
 *			국어: 10.00
 *			영어: 20.00
 *			수학: 30.00
 *
 *			총점: 60.00
 *			평균: 20.00
 *
 */
public class Method04 {
	
	public static double getTotal(double kor, double eng, double math) {
		return kor + eng + math;	//코드설명: 국어 영어 수학 더해서 반환
	}
	
	public static double getAvg(double total) {
		return total / 3;
	}
	
	public static void printInfo(	int num, 
									double kor, 
									double eng, 
									double math) {
		
		double totalScore = getTotal(kor, eng, math);
		
		System.out.println(num + "번 학생 성적");
		System.out.println("국어: " + kor);
		System.out.println("영어: " + eng);
		System.out.println("수학: " + math);
		System.out.println("총점: " + totalScore);
		System.out.println("평균: " + getAvg(totalScore));
		System.out.println();
	}
	
	public static void inputScore() {
		Scanner scanner = new Scanner(System.in);
		
		int num = 0;
		double kor = 0;
		double eng = 0;
		double math = 0;
		
		System.out.print("학생 번호: ");
		num = scanner.nextInt();
		
		System.out.print("국어: ");
		kor = scanner.nextDouble();
		
		System.out.print("영어: ");
		eng = scanner.nextDouble();
		
		System.out.print("수학: ");
		math = scanner.nextDouble();
		
		System.out.println();
		
		printInfo(num, kor, eng, math);	
		
	}
	

	public static void main(String[] args) {
		for(int i = 0; i < 3; i++) {
			inputScore();			
		}
	}

}
















