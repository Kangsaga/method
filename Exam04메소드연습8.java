import java.util.Scanner;

public class Exam04메소드연습8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 2개의 정수 입력받기
		Scanner sc = new Scanner(System.in);

		System.out.print("첫번째 정수 입력 >>");
		int num1 = sc.nextInt();

		System.out.print("두번째 정수 입력 >>");
		int num2 = sc.nextInt();

		System.out.println("결과 확인 : " + getAbsoluteValue(num1, num2));

	}

	public static int getAbsoluteValue(int x1, int x2) {
		return Math.abs(x1 - x2);
	}
}
