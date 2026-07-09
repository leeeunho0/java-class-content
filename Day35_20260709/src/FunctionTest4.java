import java.util.Scanner;

public class FunctionTest4 {

	static Scanner 키보드 = new Scanner(System.in);
	static int 총금액 = 0;
	
	
	public static void main(String[] args) {


		System.out.println("Welcome to Harry Cafe");
		System.out.println("1. Americano 3900원");
		System.out.println("2. Cafe mocha 4500원");
		System.out.println("3. Cafe Latte 5000원");
		System.out.println("4. Green Tea Latte 5500원");
		System.out.print("번호 입력: ");
		int 음료 = 키보드.nextInt();
		
		if (음료 == 1) {
			총금액 += 3900;
		} else if (음료 == 2) {
			총금액 += 4500;
		} else if (음료 == 3) {
			총금액 += 5000;
		} else if (음료 == 4) {
			총금액 += 5500;
		}
		
		System.out.println("사이즈 선택");
		System.out.println("1. grande 1000원");
		System.out.println("2. regular 500원");
		System.out.println("3. short 0원");
		System.out.print("번호 입력: ");
		int 사이즈 = 키보드.nextInt();

		if (사이즈 == 1) {
			총금액 += 1000;
		} else if (사이즈 == 2) {
			총금액 += 500;
		} else if (사이즈 == 3) {
			총금액 += 0;
		}
		System.out.println("최종 결제 금액: " + 총금액 + "원");
		
	}

}
