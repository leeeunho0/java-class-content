package com.yonsai.project.service;

import java.util.HashMap;

class Book {
    String isbn;
    String title;
    String author;
    int stock;
}

public class Exam2 {

	public void 문제2() {
		
//		1.HashMap<String, Book> 타입의 도서목록이라는 Map을 만드세요. 
		HashMap<String, Book> 도서목록 = new HashMap<>();
		
		
//		2.책 2권을 각각 new Book()으로 생성하고, 
//		isbn, title, author, stock 필드에 값을 대입하세요. 
//		(예: "b001", "자바의 정석", "남궁성", 10)
		Book 책1 = new Book();
		책1.isbn = "b001";
		책1.title = "자바의 정석";
		책1.author = "남궁성";
		책1.stock = 10;
		
		도서목록.put(책1.isbn, 책1);
		
		Book 책2 = new Book();
		책2.isbn = "b002";
		책2.title = "수학의 정석";
		책2.author = "홍길동";
		책2.stock = 14;
		
		도서목록.put(책2.isbn, 책2);
		
//		3.도서목록.put(isbn, 책객체) 형태로 Map에 추가하세요. 
		
		
//		4.특정 isbn으로 책을 조회해서, 제목과 재고 수량을 출력하세요. 
		boolean 책제목찾기 = 도서목록.containsKey("b001");
		
		if (책제목찾기) {
			System.out.println("제목: "+도서목록.get("b001").title);
			System.out.println("재고: "+도서목록.get("b001").stock);
			도서목록.get("b001").stock -=1;
			System.out.println("판매 처리 후 재고: "+도서목록.get("b001").stock);
		}
		
//		System.out.println("책 제목: ",책1.isbn.title);
		
		
//		5.그 책의 재고(stock)를 1 감소시킨 후 다시 출력하세요. (판매 1건 처리 흉내) 
		
		
		
		
		
		
	}
	
}
