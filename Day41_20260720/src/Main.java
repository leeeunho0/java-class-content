
public class Main {

	public static void main(String[] args) {
		
		new LoginTest();
//		new EventTest2();
//		new MenuTest2();
//		new MenuTest();
//		new ImageTest();
//		new EventTest();
//		new InputTest();
		// GuiTest 실행!
//		new GuiTest();
		
		// 프로그램을 배포하는 과정에서 시작점(main함수)
		// 여러개면 빌드(배포할때) 에러가 발생된다.
		// 시작점은 무조건 하나만 있어야된다.
		
		// package com.yonsai.project;
		// - 자바파일들을 다른 폴더로 이동이 가능하다.
		
		// package가 없고 기본 경로일 경우에는 자바 파일들이 다른 폴더로 이동이 불가능하다!
		
		// main 클래스
		// - 지시만 내린다. 프로그램 진입점(entry point)
		
		// service 클래스
		// - 실제 일을 함
		// - 규칙을 검사하고 계산하고 처리한다.
		
		// domain 클래스
		// - 값들만 저장하는 클래스!
		
		// 클래스를 나눠서 처리하는 이유?
		// - main 안에 수백줄이 넘어가면 코드가 뒤죽박죽됨!
		// - 버그 하나를 고치려해도 어디가 어디인지 찾기 힘듬.
		
		// 테스트를 해야되는데 한 파일에 모아두면, 테스트할 때 
		

	}

}
