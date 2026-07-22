package com.yonsai.interfacetest.service;

public class ExceptionTest {

/*
	public void if문과try차이2() {
		// try~catch "대비"
		// 회원가입 버튼 눌렀을때 저장하기 전에 
		// 서버가 에러에 의해서 꺼질 수도 있고
		// 네트워크가 끊길 수도 있고
		// 내용을 저장해야되는데 인터넷 연결이 안된다.
		// 
		try {
			// 회원가입저장();
		}catch(){
			System.out.println("실행해 보기전엔 모른다");
		}
		
		// 데이터를 가져올때 API호출
		// 공공데이터를 제공하는 서버쪽에서 나한테 얘기없이
		// 그냥 파일을 삭제하는경우, 리뉴얼 파일 접근을 못하게 잠시 닫아놓은 경우
		try {
			// 공공데이터가져와();
		}catch(){
			System.out.println("인터넷연결을 확인하세요");
		}
		
		// 이미지업로드
		// 서버쪽에서 용량이 없는거는 내가 확인을 못함
		// 서버에서 바이러스 걸림 업로드 X
		try {
			// 이미지업로드();
		}catch(){
			System.out.println("용량부족");
		}
		// 미리 확인 가능 - if-else문
		// 실행하기 전에는 모르는 문제 - try-catch문
		
		
	}
*/	
	
	
	
	
	
	public void if문과try차이() {
	
	// if~ else "예측"
	// - 미리 알고 있는 상황 처리!
	//   날씨가 비가 온다 예측
	// - 이미 확인할 수 있는 조건들!
		
		boolean 로그인성공 = true;
		if(로그인성공) {
			System.out.println("메인페이지로 이동");
		}else {
			System.out.println("로그인 실패");
		}
		
		// 아이디중복확인 미리 확인할 수 있다.
		boolean 아이디중복 = true;
		if(아이디중복) {
			System.out.println("이미 사용중인 아이디입니다.");
		}else {
			System.out.println("회원가입 완료!");
		}
		
		// 장바구니 재고 확인
		int 재고 = 0;
		if(재고 > 0) {
			System.out.println("구매가능");
		}else {
			System.out.println("품절");
		}
		
		
	}
	public void 예외처리3() {
		System.out.println();
		System.out.println("프로그램 실행한다!");
		
		try {
			int[] nums = {10,20,30};
			System.out.println(nums[4]);
		}catch(IndexOutOfBoundsException e) {
			System.out.println("데이터가 없습니다.");
		}
		System.out.println("정상실행!");
	}
	
	public void 예외처리2() {
		System.out.println("프로그램 실행한다!");
		try {
			// 예외(에러)가 발생할 수 있는 문장들
			// try 안에서 예외가 발생할 수 있는 코드들
			int result = 10 / 0;
			System.out.println(result);
			
		}catch(ArithmeticException e) {
			// 수학적 계산이 예외(에러)가 발생했을 때 처리하는 문장이다!
			// catch(어떤 예외 종류인지)
			// try에서 에러가 발생하면 처리하는 문장들
			System.out.println("0으로 나눌수 없음. 다시 입력하시오!");
		}
		System.out.println("정상실행!");
	}

	public void 예외처리() {
		System.out.println("예외처리란?");
		
		// 예외처리(Exception)
		// - 프로그램을 실행하다가 예상하지 못한 문제를 해결하는것!
		// - 비정상적인 종료를 막기위해서!
		// - 문제가 생겼을 때 프로그램이 죽지 않게 하는 기술
		
		// 정상실행이라는거는 코드가 4줄이면 4줄이 모두 실행되야 한다.
		// 이게 정상실행!
		System.out.println("프로그램 실행한다!");
		
		// 프로그램이 그냥 죽어버린것! 그래서 아래 실행이 안된다.
		int result = 10 / 2;
		System.out.println(result);
		System.out.println("정상실행!");
		
		int[] arr = {1, 2, 3};
		// 틀린 문장 없고 배열명도 맞고 공간의 번호도 숫자 맞음?
		// 그럼 틀린거 없으니 실행 가능!
		// 컴파일(내가 작성한 코드를 컴퓨터 이해하는 0,1로 바꾸는 작업 문법적)
		System.out.println(arr[0]);
		
		// 프로그램이 실행(런타임)하고 나서 arr[5] 접근해서 데이터 가지고 올래? 하는 순간
		// 배열의 5번방은 존재하지 않습니다.
		// 문법은 맞지만 실행중에 터지는 문제들!
		
	}
}

/*
어떨 때 예외처리를 해야되나? 기준!
1.복구 가능한 문제인지? 프로그램 설계 오류인지?
 A설정파일을 읽어야되는데 A설정파일이 삭제된거다!
 대안 B설정파일을 읽어와라!

 프로그램 설계 오류
  - 출금을 5만원 눌렀는데 50만원이 나왔다.
  -     10만원        50만원이 나왔다
 프로그램 코드 자체를 다시 수정한다.

 회원가입 복구가능한 문제
  - 아이디를 비워두고 가입 버튼 클릭 알림(아이디를 입력하세요)
 
 회원가입 프로그램 설계 오류
  - 아이디중복검사 안만들었다.
  kim 가입 -> kim 가입 -> kim가입
  개발자가 코드를 수정해야한다.

 쇼핑몰 복구 가능한 문제
  - 재고가 없습니다.
  -> 다른 상품을 추천하면 된다.
 쇼핑몰 프로그램 설계 오류
  - 재고가 0인데 결제가 된다.
  -> 개발자가 수정해야 된다.

 예외처리 -> 사용자가 다시 시도하거나 상황이 바뀌면 해결될 수 있는 문제.
 프로그램 설계 오류 -> 사용자가 아무리 다시 해도 해결 안되고 개발자 코드를 수정해야 해결되는 문제
 

*/
