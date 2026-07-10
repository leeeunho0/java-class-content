
public class FunctionTest {

	// 함수를 만들면 실행 안된다.
	public static void a() {
		int num2 = 100;
		System.out.println(num2);
	}

	// 내가 만든 함수는 바로 실행하지 않는다. 
	public static void b() {
		String name2 = "eryna";
		System.out.println(name2);
	}
	
	public static void c(int num) {
		System.out.println(num);
	}
	
	public static void main(String[] args) {
		// num 변수는 메인에서만 사용할 수 있다!
		int num = 10;
		c(num);
		System.out.println(num);
		
		// 메인에서 내가 만든 a()함수를 부른다(호출)
		// 함수를 실행!
		a();
		b();
		
		// b함수를 실행하고 나서 에리나를 메인에서 출력? 사용 못한다.
		
		// - 지역변수 : 중관호가 시작되면 변수들이 생성되었다가 중괄호가 끝나면(닫히면) 변수들이 삭제된다.
		// - 지역(함수)에서만 사용할 수 있는 변수!
		
		// 변수
		// - 값을 저장하는 공간
		// 프로그램을 실행할 때마다 안에 있는 변수들을 계속 생성해서 메모리에 가지고 있는다.
		// - 어느순간 메모리가 꽉 찬다.
		
		
		// 생존시간
		// 변수를 만들면 메모리에서 살아있는 시간
		
		// 그 기준이 바로 중괄호!
		String name = "이서희";

	}

}
