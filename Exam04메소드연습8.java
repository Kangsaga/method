import java.util.Scanner;

public class Exam04�޼ҵ忬��8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 2���� ���� �Է¹ޱ�
		Scanner sc = new Scanner(System.in);

		System.out.print("ù��° ���� �Է� >>");
		int num1 = sc.nextInt();

		System.out.print("�ι�° ���� �Է� >>");
		int num2 = sc.nextInt();

		System.out.println("��� Ȯ�� : " + getAbsoluteValue(num1, num2));

	}

	public static int getAbsoluteValue(int x1, int x2) {
		return Math.abs(x1 - x2);
	}
}
