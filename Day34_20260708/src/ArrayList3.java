import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList3 {

	public static void main(String[] args) {
		// 
		
		/**
		 실습 1 (기초): 편의점 장바구니 프로그램 상황 설명 편의점 키오스크 프로그램을 만듭니다. 손님이 종료를 누르기 전까지 계속 메뉴가
		 반복해서 나와야 합니다.
		  ====== 우리동네 편의점 ====== 
		  1. 상품 담기 
		  2. 장바구니 보기 
		  3. 종료
		 
		 1번 선택 시: 
		 상품 목록(1.삼각김밥 2.컵라면 3.초코우유 4.과자)을 
		 보여주고 번호 선택 → 장바구니(ArrayList)에 추가 2번
		 
		 선택 시: 
		 현재 장바구니 전전체 출력 3번 선택 시: 
		 "이용해주셔서 감사합니다" 출력 후 프로그램 종료
		 
		 💡 힌트 기능사용할 문법무한 반복while(true)키보드 입력
		 받기Scanner, .nextInt()
		 메뉴 분기if ~ else if상품
		 담기장바구니.add("상품명")
		 프로그램 종료break;
		 */
		Scanner 키보드 = new Scanner(System.in);
		ArrayList<String> 장바구니목록 = new ArrayList<>();

		while (true) {
			System.out.println("====== 우리동네 편의점 ======");
			System.out.println("1. 상품 담기");
			System.out.println("2. 장바구니 보기");
			System.out.println("3. 종료");

			System.out.print("번호 입력 : ");
			int 메뉴선택 = 키보드.nextInt();

			if (메뉴선택 == 1) {
				System.out.println("1. 삼각김밥");
				System.out.println("2. 컵라면");
				System.out.println("3. 초코우유");
				System.out.println("4. 과자");
				System.out.print("추가할 상품 선택 : ");
				int 상품선택 = 키보드.nextInt();

				if (상품선택 == 1) {
					장바구니목록.add("삼각김밥");
				} else if (상품선택 == 2) {
					장바구니목록.add("컵라면");
				} else if (상품선택 == 3) {
					장바구니목록.add("초코우유");
				} else if (상품선택 == 4) {
					장바구니목록.add("과자");
				}
				System.out.println(장바구니목록);

			} else if (메뉴선택 == 3) {
				System.out.println("이용해주셔서 감사합니다!");
				break;
			}

		}

	}

}
