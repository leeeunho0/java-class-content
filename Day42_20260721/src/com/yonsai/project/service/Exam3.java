package com.yonsai.project.service;

import java.util.HashMap;

class Dog {
    String dogId;
    String name;
    String breed;
    boolean isAdopted;  // 입양 여부
}

public class Exam3 {
	public void 문제3() {
		

//	1. HashMap<String, Dog> 타입의 강아지들이라는 Map을 만드세요.
		HashMap<String, Dog> 강아지들 = new HashMap<>();
//	2. 강아지 3마리를 생성해서 각각 dogId, name, breed, isAdopted(처음엔 전부 false)
//	값을 대입하고 Map에 추가하세요.
		
		Dog 강아지1 = new Dog();
		강아지1.dogId = "d001";
		강아지1.name = "초코";
		강아지1.breed = "말티즈";
		강아지1.isAdopted = false;
				
		강아지들.put("d001",강아지1);
		
		Dog 강아지2 = new Dog();
		강아지2.dogId = "d002";
		강아지2.name = "몽이";
		강아지2.breed = "푸들";
		강아지2.isAdopted = false;
				
		강아지들.put("d002",강아지2);
		
		Dog 강아지3 = new Dog();
		강아지3.dogId = "d003";
		강아지3.name = "보리";
		강아지3.breed = "진돗개";
		강아지3.isAdopted = false;
				
		강아지들.put("d003",강아지3);
		
//	3. 특정 dogId가 Map에 존재하는지 containsKey()로 먼저 확인하세요.
        boolean 입양여부 = 강아지들.containsKey("d002");

//	4. 존재하면 그 강아지의 isAdopted를 true로 변경하고 "입양 완료되었습니다" 
//	출력, 존재하지 않으면 "해당 강아지를 찾을 수 없습니다" 출력하세요.
        if (입양여부) {
// 존재할 경우 객체를 추출하여 isAdopted를 true로 변경
            Dog 입양강아지 = 강아지들.get("d002");
            입양강아지.isAdopted = true;
            System.out.println("입양 완료되었습니다");
        } else {
// 존재하지 않을 경우
            System.out.println("해당 강아지를 찾을 수 없습니다");
        }
        
	
	
	
	}
}
