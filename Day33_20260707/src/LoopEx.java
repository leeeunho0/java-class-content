
public class LoopEx {

	public static void main(String[] args) {
		// 모든 언어에서 공통적으로 사용하는 반복문
		// 반복문 그럼 왜 쓰죠?
		// - 

		// 만약 카페 커피 주문 5개
		// println() 자바는 화면이 없다(프론트화면 X)
		System.out.println("1번고객님 커피 나왔습니다.");
		System.out.println("1번고객님 커피 나왔습니다.");
		System.out.println("1번고객님 커피 나왔습니다.");
		System.out.println("1번고객님 커피 나왔습니다.");
		System.out.println("1번고객님 커피 나왔습니다.");
		
		// 게임 몬스터 생성
		System.out.println("몬스터 출현!");
		System.out.println("몬스터 출현!");
		System.out.println("몬스터 출현!");
		System.out.println("몬스터 출현!");
		System.out.println("몬스터 출현!");
		
		// 커피를 주문하거나 회원에게 문자를 보내야된다.
		// 쇼핑몰에서 10%쿠폰이 생겼다 지금 얼른 구매문자!
		System.out.println("10%할인쿠폰 나갑니다! 얼른 구매하세요");
		System.out.println("10%할인쿠폰 나갑니다! 얼른 구매하세요");
		System.out.println("10%할인쿠폰 나갑니다! 얼른 구매하세요");
		System.out.println("10%할인쿠폰 나갑니다! 얼른 구매하세요");
		System.out.println("10%할인쿠폰 나갑니다! 얼른 구매하세요");
		
		// 회원 10000명? 내손가락 부서짐
		// 컴퓨터야! 10000번 반복해줄래? => 반복문 (스케쥴러, 알림)
		// 배열
		// String[] 카페주문 = {"1 아메리카노", "2 아메리카노", "3 카페모카"};
		

		// 시작값
		// 얼마동안 반복할꺼냐
		// 다음으로 이동할때 몇씩 이동
		
		
		// 반복문은 어떤 언어에서든 무조건 while로!
		// while문은 true동안은 반복하고, false가 나올때까지 반복이 멈춤!
		// while(참인동안 반복해라) { 
		// 어떤 내용을 실행할지 문장들;
		// }
		
//		10부터 20까지 출력하는 반목문을 만드시오.
		// 1. 시작값을 정한다 10
		int start = 10;
		int end = 20;
		
		// 2. 반복 실행
		while(start <= end) {
			System.out.println(start);
		// 3. 다음으로 이동한다.
			start = start +1;
		}
		System.out.println("반복끝ㅋ");
		
		/* 속담
		10번찍어 안 넘어가는 나무 없다!
		1번 찍었다
		2번 찍었다
		3번 찍었다
		..
		10번 찍었다
		나무가 넘어갔다
		*/
		int start2 = 1;
		while(start2 <= 10) {
			System.out.println((start2++)+"번 찍었다!");
		// start2 = start2 +1;
		}
		System.out.println("나무가 넘어갔다.");
		
		
		
		// 증가하거나 감소하는 ++
		// ++num 먼저 1을 증가하고 계산, 출력
		// num++ 먼저 출력, 계산을 진행하고 증가
		int num = 10;
		
		System.out.println("초기값: "+ num);
		System.out.println("변경 num++ "+ num++);
		System.out.println("변경된 후 값 : "+ num);
		
		
		
		
	}

}
