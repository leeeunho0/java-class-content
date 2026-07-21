package com.yonsai.member.service;

import java.util.HashMap;
import java.util.Scanner;

// 한명의 멤버 정보를 한꺼번에 묶어서 저장한다.
class Member {
String id;
String password;
String name;

// 생성자를 이용
public Member(String id, String password, String name) {

this.id = id;
this.password = password;
this.name = name;
}
}

public class MemberService {

// 회원가입하는 함수 만들기
HashMap<String, Member> 회원목록 = new HashMap<>();
Scanner 키보드 = new Scanner(System.in);
public void 회원가입() {

// 1. 아이디랑 비밀번호 이름 3개만 키보드로 입력 받는다.
// 2. Member클래스에 저장하기
// 3. HashMap을 이용해서 저장하기
// key 값은 아이디로 저장!
// 단! 조건 입력한 아이디가 회원목록변수 안에 key가 있다면
// "다시 입력하세요 입력을 다시받아야된다." 다시 중복확인
// 중복이 안되면 "성공적으로 회원가입을 완료했습니다."

String id = "";

while (true) {
System.out.print("아이디 입력:");
id = 키보드.nextLine();

// 입력한 아이디가 이미 회원목록에 있는지 검사
if (회원목록.containsKey(id)) {
System.out.println("중복되는 아이디입니다.");
System.out.println("다시 입력하세요!");
} else {
System.out.println("사용가능한 아이디입니다.");
break;
}
}

System.out.print("비밀번호 입력:");
String password = 키보드.nextLine();

System.out.print("이름 입력:");
String name = 키보드.nextLine();

// 멤버생성
// 키보드로 입력받는 변수랑 클래스변수명 데이터를 전달하는 변수명
// 모두 일치하면 자동적으로 변수명들이 입력된다
// 자동화식으로

Member 새로운멤버 = new Member(id, password, name);

// Member 새로운멤버 = new Member();
//
// // 입력받은 정보를 회원 객체에 저장
// 새로운멤버.id = id;
// 새로운멤버.password = password;
// 새로운멤버.name = name;

// 회원목록에 추가하기
회원목록.put(id, 새로운멤버);

System.out.println("성공적으로 회원가입을 완료했습니다.");
}

public void 로그인() {

while(true) {
	System.out.print("아이디 입력: ");
	String 입력한아이디 = 키보드.nextLine();
	System.out.print("비밀번호 입력: ");
	String 입력한비밀번호 = 키보드.nextLine();
	
	if(회원목록.containsKey(입력한아이디) &&
	   회원목록.containsKey(입력한비밀번호)) {
		Member 회원 = 회원목록.get(입력한아이디);
		System.out.println(회원.name+" 회원님 환영합니다.");
		
		while(true) {
			System.out.println("======회원 메뉴=====");
			System.out.println("1. 비밀번호 바꾸기");
			System.out.println("2. 이름 바꾸기");
			System.out.println("3. 로그아웃");
			System.out.print("메뉴 번호 선택: ");
			int menu = 키보드.nextInt();
			키보드.nextLine();
			
			if(menu==1) {
				System.out.print("변경할 새비밀번호 입력: ");
				회원.password=키보드.nextLine();
				System.out.println("비밀번호 변경 완료!");
			}else if(menu==2) {
				System.out.print("변경할 새이름 입력: ");
				회원.name=키보드.nextLine();
				System.out.println("새이름으로 변경 완료!");
			}else if(menu==3) {
				System.out.println("로그아웃 합니다.");
				return;
			}else {
				System.out.println("잘못입력했습니다.");
			}
		}
		
	}else {
		System.out.println("아이디 또는 비밀번호가 잘못되었습니다.");
	}
	
}
	
// 1. 키보드로 아이디 비밀번호 입력 

// 2. 만약 로그인 성공이면 000님 환영합니다. 
//        로그인이 안되면 "아이디 비밀번호를 다시 입력해주세요"
//        로그인이 성공할 때까지 반복!(아이디 중복)
/*
 ******* 회원 메뉴 *******
         1. 비밀번호 바꾸기         
         2. 이름 바꾸기              
         3. 로그아웃                  
         메뉴 번호 선택 : >> 입력 받음
         // 메뉴 화면 반복 실행 처리
         // 잘 못 입력 하였을 경우 "잘못 입력하였습니다. 다시 입력해주세요" 출력 후 반복
 */
}

}
