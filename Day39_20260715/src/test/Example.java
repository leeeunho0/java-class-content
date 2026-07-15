package test;
class 결제{
	protected int 잔액;
	
	void 잔액지정(int 입력금액) {
        this.잔액 = 입력금액;
    }
	
	int 결제하기(int 금액){
		잔액 -= 금액;
		System.out.println("결제 완료: "+금액+" 원");
		System.out.println("잔액: "+잔액+" 원");
		return 잔액;
	}
}

class 카드결제 extends 결제{
	@Override
	int 결제하기(int 금액){
		double 수수료 = 금액*0.02;
		잔액 -= (금액+수수료);
		System.out.println("카드 결제 완료: "+(금액+수수료)+" 원(수수료 포함)");
		System.out.println("잔액: "+잔액+" 원");
		return 잔액;
	}
}

class 카카오결제 extends 결제{
	@Override
	int 결제하기(int 금액){
		잔액 -= 금액;
		System.out.println("카카오페이 결제 완료: "+금액+" 원");
		System.out.println("잔액: "+잔액+" 원");
		return 잔액;
	}
}

public class Example {

	public static void main(String[] args) {
		
		
		카드결제 내카드 = new 카드결제();
		내카드.잔액지정(100000);
		내카드.결제하기(10000);
		
		카카오결제 내페이 = new 카카오결제();
		내페이.잔액지정(100000);
		내페이.결제하기(10000);
		
			
	}

}

/*
class 로그인{
	
	protected String 아이디;
	
	void 로그인처리(){
		System.out.println("로그인을 처리합니다.");
	}
	
class 이메일로그인 extends 로그인{
	
	
	void 로그인처리(String 아이디){
		System.out.println(아이디+"님, 이메일과 비밀번호를 확인합니다.");
	}
}

class 카카오로그인 extends 로그인{
	
	void 로그인처리(String 아이디){
		System.out.println(아이디+"님, 카카오톡 인증을 요청합니다.");
	}
}

class 지문로그인 extends 로그인{
	
	void 로그인처리(String 아이디){
		System.out.println(아이디+"님, 지문 인식을 시작합니다.");
	}
}


}

 */