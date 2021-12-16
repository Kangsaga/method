
public class Exam07메소드오버로딩 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int a = 10;
//		int b = 2;
		
		// 메소드 오버 로딩
		// 두개의 수를 더해줄수있는 add() 만들기
		add(10, 2);
		add(10, 2.4);
		
	}
	public static void add(int a, int b) {
		System.out.println(a+b);
	}
	// 정수형의 add메소드를 중복정의하여 생성된 메소드
	public static void add(int a, double b) {
		System.out.println(a+b);
	}
}
