import java.util.Scanner;

public class Exam03�޼ҵ忬��7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 2���� ������ �Է¹ޱ�
		Scanner sc = new Scanner(System.in);

		System.out.print("ù��° ���� �Է� >>");
		int num1 = sc.nextInt();

		System.out.print("�ι�° ���� �Է� >>");
		int num2 = sc.nextInt();

		System.out.println("10�� ����� �� : " + close10(num1, num2));

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
//		// 1. 10���� ���� ���̳��� ���� ����� ����
//		int a = 10 - x1;
//		int b = 10 - x2;
//		
//		a = a > 0 ? a : (a * -1);
//		b = b > 0 ? b : (b * -1);
		
		// Math class�� �ִ� abs() ���� �Լ� ����ϱ�
		int a = Math.abs(10 - x1);
		int b = Math.abs(10 - x2);
		
		
		
		
		
		// 2. 10���� ���� �� ����� �� ã��
		if (a > b) {
			return x2;
		}else if (b > a) {
			return x1;
		}else {
			return 0;
		}
	}

}
