import java.util.Scanner;

public class Exam04�޼ҵ� {
	// main �޼ҵ�
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Ŭ������ ���� ��ġ�� �޼ҵ带 ������ ��� 
		//��! static Ű���� �ٿ��ֱ�!!
		
		// 1. �޼ҵ��� ����
		// - ���� ������ : public
		// - ���� Ÿ�� : �޼ҵ� ���� ���� ��������� ���ƿ��� �����Ϳ����� Ÿ��
		// - �޼ҵ� �̸�
		// - �޼ҵ尡 ����� X�� -> �޼ҵ� �Ű�����, �Ұ�ȣ �ȿ� �� ����
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° ���� : ");
		int num1 = sc.nextInt();
		
		System.out.print("�ι�° ���� : ");
		int num2 = sc.nextInt();
		
		int result = addNumber(num1, num2);
		System.out.println(result);
		
		//�޼ҵ�� ũ�� �޼ҵ� ȣ��� �޼ҵ� ���Ƿ� �۾��� ����ȴ�
		//�޼ҵ� ���ǰ� ���� ������ �ǰ� ������ �޼ҵ� ȣ���� �����ϴ�
	}//main �޼ҵ尡 ������ �κ�
	
	//���Ӱ� �޼ҵ带 ����� �ִ� ����!!!!!
	//�޼ҵ�ȿ� �޼ҵ带 ���� �˰����̲��ϼ� �ձ� ������ ���� �ʴ´�
	
	//���� ������ public -> ����/�ܺ� ��𼭵� ������ ������ ������!!
	//static �����س��� ����ϴ� 
	public static int addNumber(int x1, int x2) {
		
		int result = x1 + x2;
		
		return result; 
	}

}//class�� ������ �κ�
