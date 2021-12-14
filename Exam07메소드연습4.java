
public class Exam07메소드연습4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 50;
		int num2 = 15;
		String op = "*";
		
		System.out.println(cat(num1, num2, op));
	}
	public static  int cat(int num1, int num2, String op) {
		int result = 0;
		if(op == "-" ) {
			result = num1 - num2;
			return  result;
		}
		else if ( op =="*") {
			result = num1 * num2;
			return  result;
		}
		else if (op == "+") {
			result = num1 + num2;
			return  result;
		}
		else if ( op == "/") {
			result = num1 / num2;
			return  result;
		}
		return result;
		
	}
}
