package com.yonsai.project;

import com.yonsai.project.service.Exam2;
import com.yonsai.project.service.Exam3;
import com.yonsai.project.service.MapTest;
import com.yonsai.project.service.MapTest2;
import com.yonsai.project.service.DogService;
import com.yonsai.project.service.Exam1;

// java 패키지명 관례는 회사/조직의 도메인 주소를 거꾸로 뒤집어서 짓는다.
// - 이름 충돌 방지
// - 소유권/출처 구분 (어느 조직이 만든 코드인지 명확)
// - 도메인 : 사람이 외우기 쉽게 만든 인터넷 주소!
// - 자바에서 기본 폴더 (default package) 경로 설정을 못잡는다.
//   다른 폴더에서 파일을 가져가서 객체 생성이 불가능하다!
//   다른 import 안된다!
//   프로젝트가 커지면 클래스가 수백개인데 전부 폴더 구분없이
//   한곳에 몰리면 관리 불가!(협업불가)
public class Main {

	public static void main(String[] args) {
		// 지시만!
//		MapTest2 test2 = new MapTest2();
		
		// 실행 순서
		// 1.자바 실행 후 main을 찾는다.(실행한다.)
		// 2.new MapTest2() 파일을 메모리 확보해라!
		//	 test2에 저장해라!
		// 3.test2안에 있는 테스트 함수를 실행해라!
//		test2.테스트2();
		
		DogService 강아지 = new DogService();
		강아지.강아지입양테스트();
		System.out.println("=========");
		Exam1 기초1 = new Exam1(); 
		기초1.문제1();
		System.out.println("=========");
		Exam2 기초2 = new Exam2();
		기초2.문제2();
		System.out.println("=========");
		Exam3 기초3 = new Exam3();
		기초3.문제3();
		
		/*
		// 메모리 공간을 확보한다. 무슨 타입으로 MapTest 보고 공간을 확보하고 끝난다.
		MapTest map = new MapTest();
		// MapTest안에 있는 함수들을 실행할 수있다!
		// MapTest안에 mapEx()함수 실행해!
		System.out.println("====== 1. MapEx 실행 ======");
		map.MapEx();
		
		System.out.println("\n====== 2. 아이디중복확인 실행 ======");
		map.아이디중복확인();
		
		System.out.println("\n====== 3. 상품할인률확인 실행 ======");
		map.상품할인률확인();
		
		System.out.println("\n====== 4. 회원정보조회 실행 ======");
		map.회원정보조회();
		
		*/
	}
}
