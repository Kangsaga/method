import java.util.Scanner;

public class Exam06�޼ҵ忬��10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� >>");
		int num1 = sc.nextInt();
		
		int result =  getSumOfDivisors(num1);
		
		System.out.println( num1 + "�� ����� �� : " + result);
		
		getDivisor(num1);
		
	}
	public static int getSumOfDivisors(int x) {
		int result = 0;
		for (int i = 1 ; i <= x ; i++) {
			if(x % i == 0) {
				result = result + i;
			}
		}
		return result;
	}
	public static void getDivisor(int a) {
		System.out.print(a + "�� ����� : ");
		for (int i = 1; i <= a ; i++) {
			if (a % i == 0) {
				System.out.print(i + " ");
			}
		}
	}
}
