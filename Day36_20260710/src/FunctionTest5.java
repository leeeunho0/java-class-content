public class FunctionTest5 {

	// 더하는게 귀찮아서 더하기 대신 해주는 함수
	public static int 더하기(int num1, int num2) {
		return num1 + num2;
	}
	
	// 곱하는게 귀찮아서 곱하기 대신하는 함수
	public static int 곱하기(int num3, int num4) {
		return num3 * num4;
	}
	
	public static int 빼기(int num5, int num6) {
		return num5 - num6;
	}
	
	public static void 홀수짝수(int 숫자) {
		if(숫자 %2 == 0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수!");
		}
	}
	
	public static void main(String[] args) {

		// 1. 정수 두개를 입력해서 더한 값이 홀수인지
		// 짝수인지 구하는 프로그램을 만드시오!
		int 더한결과값 = 더하기(10,20);
	
		홀수짝수(더한결과값);
		
/*		if(더한결과값 %2 == 0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수!");
		}
*/		
		
		// 2. 정수 두개를 입력해서 곱한 결과값이
		// 홀수인지 짝수인지 구하는 프로그램을 만드시오!
		// 내가 계산한 결과값을 가지고 다음 코드가 사용한다
		// 이러면 return을 한다.
		// return을 할때 숫자, 문자 미리 알아야된다.
		// 그래서 타입을 적어준다.
		int 곱한결과값 = 곱하기(11,15);
				
		if(곱한결과값 %2 == 0) {
			System.out.println("짝수!");
		}else {
			System.out.println("홀수!");
		}
		
		// 3. 두 정수를 입력받아서 뺀 다음에 
		// 그 값이 홀수인지 짝수인지 구하는 프로그램을 만드시오!
		int 빼기결과값 = 빼기(10,15);
		
/*		if(빼기결과값 %2 == 0) {
			System.out.println("짝수!");
		}else {
			System.out.println("홀수!");
		}
*/
		홀수짝수(빼기결과값);
		
	}
}