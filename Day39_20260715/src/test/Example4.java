// 실습2
// 온라인 서점 콘텐츠 관리 ★★★
package test;

import java.util.ArrayList;

// 부모 클래스
class 도서{
	protected String 제목;
	protected int 가격;
	
	// 생성자로 초기화
	public 도서(String 제목, int 가격) {
		this.제목 = 제목;
		this.가격 = 가격;
	}
	void 재생하기() {
		System.out.println("콘텐츠를 엽니다");
	}
}
// 자식 클래스
class 전자책 extends 도서{
	
	public 전자책(String 제목, int 가격) {
		super(제목, 가격);
}
	void 재생하기() {
		System.out.println(제목 + "전자책 뷰어를 엽니다");
	}
}

//자식 클래스
class 오디오북 extends 도서{
	
	public 오디오북(String 제목, int 가격) {
		super(제목, 가격);
}
	void 재생하기() {
		System.out.println(제목 + "오디오 재생을 시작합니다");
	}
}

//자식 클래스
class 종이책 extends 도서{
	
	public 종이책(String 제목, int 가격) {
		super(제목, 가격);
}
	void 재생하기() {
		System.out.println(제목 + "배송 준비를 시작합니다");
	}
}




public class Example4 {

	public static void main(String[] args) {

		ArrayList<도서> 장바구니 = new ArrayList<>();
		
		장바구니.add(new 전자책("자바의 정석", 15000));
		장바구니.add(new 오디오북("자바의 정석", 12000));
		장바구니.add(new 종이책("자바의 정석", 25000));
		
		int 총합계 = 0;
		for(도서 항목 : 장바구니) {
			항목.재생하기();
			총합계 +=항목.가격;
		}

		System.out.println("총 결제금액: "+총합계+" 원");
	}

}
