
public class Exam08메소드연습5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add(3, 5);
		sub(3, 5);
		mul(3, 5);
		div(3, 5);
	}

	public static int add(int x1, int x2) {
		System.out.println(x1 + x2);
		return  x1 + x2;
	}

	public static int sub(int x1, int x2) {
		System.out.println(x1 - x2);
		return x1 - x2;
	}

	public static int mul(int x1, int x2) {
		System.out.println(x1 * x2);
		return x1 * x2;
	}

	public static int div(int x1, int x2) {
		System.out.println(x1 / x2);
		return x1 / x2;

	}

}
