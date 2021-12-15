import java.util.Arrays;

public class Exam05메소드연습9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {1,2,3,4,8,7,9,10};
		arrayToString(array);
		
	}
	public static void arrayToString(int[] x) {
//		
//		for (int i = 0; i < 7; i++) {
//			 System.out.printf("%d ",x[i]);
//		}
		
		// Arrays 클래스의 toString() 함수 사용하기
		
		System.out.println(Arrays.toString(x));
		
	}
}
