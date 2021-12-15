import java.util.Scanner;

public class Exam03메소드연습7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 2개의 정수를 입력받기
		Scanner sc = new Scanner(System.in);

		System.out.print("첫번째 정수 입력 >>");
		int num1 = sc.nextInt();

		System.out.print("두번째 정수 입력 >>");
		int num2 = sc.nextInt();

		System.out.println("10에 가까운 수 : " + close10(num1, num2));

	}

	public static int close10(int x1, int x2) {
//		int result1 = 0;
//		int result2 = 0;
//
//		if (10 - x1 > 0) {
//			result1 = 10 - x1;
//		} else if (10 - x1 < 0) {
//			result1 = x1 - 10;
//		}
//		if (10 - x2 > 0) {
//			result2 = 10 - x2;
//		} else if (10 - x2 < 0) {
//			result2 = x2 - 10;
//		}
//		return result1 == result2 ? 0 : (result1 > result2 ? x2 : x1);
		
//		
//		// 1. 10으로 부터 차이나는 값을 양수로 수정
//		int a = 10 - x1;
//		int b = 10 - x2;
//		
//		a = a > 0 ? a : (a * -1);
//		b = b > 0 ? b : (b * -1);
		
		// Math class에 있는 abs() 절댓값 함수 사용하기
		int a = Math.abs(10 - x1);
		int b = Math.abs(10 - x2);
		
		
		
		
		
		// 2. 10으로 부터 더 가까운 수 찾기
		if (a > b) {
			return x2;
		}else if (b > a) {
			return x1;
		}else {
			return 0;
		}
	}

}
