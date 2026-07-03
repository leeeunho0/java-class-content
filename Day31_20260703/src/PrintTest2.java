
public class PrintTest2 {

	public static void main(String[] args) {
		// main에 코드들을 작성한다. 시작지점!

		// 문제 1. 상품 정보 출력
		System.out.println("상품명 : 아메리카노");
		System.out.println(3000+"원");
		
		// 문제 2. 상품 3개 주문
		System.out.println("아메리카노 1잔은"+3000+"원입니다.");
		System.out.println("아메리카노 3잔은"+(3000*3)+"원입니다.");
		
		// 문제 3. 장바구니 총 금액
		System.out.println("장바구니 총 금액:"+ (3000+4000+5500)+"원");
		
		// 문제 4. 수량 증가
		System.out.println("현재수량:"+1);
		System.out.println("변경된 수량:"+ (1+1));
		
		// 자바스크립트랑 자바랑 다른점
		// 자바스크립트는 "", '' 상관없음
		// 자바스크립트에서는 문자를 작성 console.log("")
		//				         console.log('')
		
		// 자바는 특수문자, 한개의 문자를 입력시에는 '', 여러개의 문자를 쓸때는 ""
		// 쌍따옴표는 여러개의 단어를 쓸 때 사용
		// 외따옴표는 한 문자!
		System.out.println("여러개의 문자를 작성");
		System.out.println('r');
		System.out.println('1');
		System.out.println('ㄱ');
		System.out.println('%');
				
		/*
		 * 
		문제 1. 상품 정보 출력
		상품명: 아메리카노
		가격: 3000원

		문제 2. 상품 3개 주문
		아메리카노 1잔은 3000원입니다.
		3잔 주문 금액을 출력하세요.
		아메리카노 3잔 주문
		총 금액: 9000원


		문제 3. 장바구니 총 금액
		3000원, 4000원, 5500원을 더해서 출력하세요.
		장바구니 총 금액: 12500원


		문제 4. 수량 증가
		현재 수량 1개에서 1개 증가한 결과를 출력하세요.
		현재 수량: 1
		변경된 수량: 2

		 */
		
		
	}

}
