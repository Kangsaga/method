import java.util.Scanner;

public class Exam02�޼ҵ忬��6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// 1. 2���� ����� �Է� �޴´�
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° ���� �Է� >>");
		int num1 = sc.nextInt();
		
		System.out.print("�ι�° ���� �Է� >>");
		int num2 = sc.nextInt();
		
		System.out.println("ū�� Ȯ�� : " + largeNumbers(num1, num2));
		
	}
	// largeNumber �޼ҵ� ����
	public static int largeNumbers(int x1, int x2) {
//		if (x1 > x2) {
//			return x1;
//		}else if (x2 > x1) {
//			return x2;
//		}else {
//			return 0;
//		}
		// ���� �����ڸ� ���� �˰��� �����
		return x1 == x2 ? 0 : (x1> x2 ? x1 : x2);
	}
}
