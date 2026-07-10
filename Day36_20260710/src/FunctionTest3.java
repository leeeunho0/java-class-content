
public class FunctionTest3 {
	
	public static void 알람시계(int 시간) {
		System.out.println("띠리리리");
		System.out.println("현재 "+시간+" 입니다. 일어나세요");
	}

	public static void 자동문() {
		System.out.println("문이 열린다.");
		System.out.println("잠시 기다린다.");
		System.out.println("문이 닫힌다.");
	}
	
	public static void 코인노래방(String 돈) {
		System.out.println("노래 번호를 누른다");
		System.out.println("반주가 나오면 기다린다");
		System.out.println("신나게 노래를 한다");
		System.out.println("점수 확인후 나간다");
	}
	
	public static void 메뉴출력() {
		System.out.println("===== 영화예매 =====");
		System.out.println("1.예매");
		System.out.println("2.조회");
		System.out.println("3.종료");
	}
	
	public static void 회원가입() {
		System.out.println("회원가입 성공!");
		System.out.println("로그인 해주세요!");
	}
	
/*	// 화면에 출력!
	public static void 배터리충전알림(int 배터리잔량) {
		if(배터리잔량 > 15) {
			System.out.println("충전하세요!");
		}
	}
	
	// return이 없으면 
	// => 폭죽 - 폭죽을 터트리면 하늘에 번쩍 예쁘게 보인다.(콘솔 화면출력)
*/	//		 - 나한테 남는건 아무것도 없다! (값을 되돌려주지 않으므로 사라짐!)
	
	public static void main(String[] args) {
		// 네가ㅣ 만든 함수가 끝난 다음에 다른 코드한테 이 값이 필요한가?
		
		// 알람 시계
		// 실행되고 나서 그걸로 끝!
		// 나중에 그 결과를 어디 저장해서 다시 쓸 일이 없다

		// 함수!
		// 여러 실행 문장을 하나로 묶어서 이름을 붙인것!
		// 자주 사용하는 코드를 하나로 묶어 놓은 것!
		// 나 대신 여러 줄의 코드를 실행해주는 것!

		// 매개변수 = 재료
		// 지역변수 = 주방의 소모품(휴지 등)

/*		함수를 만들 때 딱 3가지!
	★★★	1. 이 함수를 실행한 다음 그 결과를 변수에 담아야하나? ★★★
			다음에 코드가 쓸거야?
				yes -> return 필요
				no -> return 필요 X
		
		2. no 면 그 결과로 판단(if문)해야되나?
		3. 결과를 미리 알려주는 타입만 결정!
*/
	}

}
