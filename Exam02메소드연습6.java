import java.util.Scanner;

public class Exam02메소드연습6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// 1. 2개의 양수를 입력 받는다
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 입력 >>");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 정수 입력 >>");
		int num2 = sc.nextInt();
		
		System.out.println("큰수 확인 : " + largeNumbers(num1, num2));
		
	}
	// largeNumber 메소드 생성
	public static int largeNumbers(int x1, int x2) {
//		if (x1 > x2) {
//			return x1;
//		}else if (x2 > x1) {
//			return x2;
//		}else {
//			return 0;
//		}
		// 삼항 연산자를 통한 알고리즘 만들기
		return x1 == x2 ? 0 : (x1> x2 ? x1 : x2);
	}
}
