package com.yonsai.project.service;

import java.util.HashMap;

class Student {
    String studentId;
    String name;
    int score;
}

public class Exam1 {

	public void 문제1() {
	// 1.HashMap<String, Student> 타입의 학생들이라는 Map을 만드세요.
	HashMap<String, Student> 학생들 = new HashMap<>();
	
	// 2.학생 2명을 각각 new Student()로 생성하고,
	//	 studentId, name, score 필드에 직접 값을 대입하세요. 
	//	 (예: "s001", "김민지", 95 / "s002", "이도현", 88) 
	// 3.각 학생을 학생들.put(studentId, 학생객체) 형태로 Map에 추가하세요. 
	Student 학생1 = new Student();
	학생1.studentId = "s001";
	학생1.name = "김민지";
	학생1.score = 95;
	
	학생들.put(학생1.studentId,학생1);
	
	Student 학생2 = new Student();
	학생2.studentId = "s002";
	학생2.name = "이도현";
	학생2.score = 88;
	
	학생들.put(학생2.studentId,학생2);
		
	// 4.학생들.get("s001")로 첫 번째 학생을 조회해서 이름과 점수를 출력하세요. 
//	System.out.println(학생들.get("s001"));
	System.out.println("이름: " + 학생들.get("s001").name);
	System.out.println("점수: " + 학생들.get("s001").score);
     
	
	}
}
