import java.util.Scanner;

public class LoopArrayEx {
	
	public static void main(String[] args) {
		
		// 배열과 반복문 합치면 난이도 업!
		// 1. 커피주문
		String[] cust = {
				"얼음공주", "집에가고싶다","1234", "까칠한민수!","눈뜨니회사네", "여왕님"
		};
		
		System.out.println(cust[0]+"메뉴 나왔습니다");
		
		// while 을 이용해서 현재 주문이 들어온 고객들의
		// 닉네임을 가지고 와서 메뉴 나왔습니다. 출력!
		int 공간번호 = 0;
		
		while (공간번호 <= 5) {		// cust.length
			System.out.println(cust[공간번호++]);
//			공간번호+=1;
		}
		
		// 쇼핑몰에서 현재 멤버들한테 15% 할인쿠폰이 도착했습니다.
		// 출력
		String[] members = {
				"김철수",
				"이영희",
			    "박민수",
			    "최지은",
			    "홍길동"
		};
		
		int 공간번호2 = 0;
		
		while(공간번호2 < members.length) {
			System.out.println(members[공간번호2++] + "님, 15% 할인쿠폰이 도착했습니다.");
//			공간번호2 += 1;
		}
		
		// 배열 = 여러개의 데이터를 저장한다
		// 반복문 = 같은 일을 여러번 시킨다
		// 배열 + 반복문 = 여러개의 데이터를 하나씩 꺼내면서
		//              같은 작업을 수행한다.
		// 목록! 보여주는 프로그램에서는 많이 사용한다.
		
		
		// 회원가입할 대 아이디 중복검사하는 로직!
		// 사용자가 입력한 아이디가 이미 다른 사람이 사용중인지 확인하는 기능!
		Scanner 키보드 = new Scanner(System.in);

		String[] 기존아이디 = {"apple", "banana", "cherry"};

		// 2. 사용자로 부터 키보드로 입력 받기
		System.out.print("새로 가입할 아이디를 입력하세요: ");
		String 새로가입하는아이디 = 키보드.nextLine();

		
		// 3. 혹시 새로가입하는아이디값이 기존아이디 배열에 있다면
		//		아이디 중복입니다.
		// 		없으면 사용가능한 아이디입니다.
        String 입력아이디 = 키보드.next();

        boolean 중복여부 = false;
        int i = 0;

        while (i < 기존아이디.length) {
            if (기존아이디[i].equals(입력아이디)) {
                중복여부 = true;
            }
            i += 1;
        }

        if (중복여부) {
            System.out.println("이미 등록된 이름입니다.");
        } else {
            System.out.println("등록되지 않은 이름입니다.");
        }
		
		
		/*
		
		int num = 0;
		while(num < 기존아이디.length) {
			if(기존아이디[num].equals(새로가입하는아이디)) {
				System.out.println("아이디 중복입니다.");
				return;
			} num += 1;
		}
				System.out.println("사용가능한 아이디입니다.");
		*/
		
	}
}
