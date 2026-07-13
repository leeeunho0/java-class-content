import java.util.ArrayList;
import java.util.Scanner;

class 카페고객{

	String 이름;
	String 전화번호;
	int 포인트;
	
	
	public 카페고객(String 이름, String 전화번호) {
		
		this.이름 = 이름;
		this.전화번호 = 전화번호;
		this.포인트 = 0;
	}
	
	
	
}

public class CafeManager {

	public static void main(String[] args) {

		Scanner 키보드 = new Scanner(System.in);
		
		ArrayList<카페고객> 고객목록 = new ArrayList<>();

		while(true) {
		
		System.out.println("\n===== 메뉴 =====");
		System.out.println("1. 고객 등록");
		System.out.println("2. 포인트 적립");
		System.out.println("3. 포인트 조회");
		System.out.println("0. 종료");
		System.out.print("선택: ");
		int 선택 = 키보드.nextInt();
		
		키보드.nextLine();
				
		// 메뉴선택
		if (선택 ==1 ) {
			System.out.print("이름: ");
			String 이름 = 키보드.nextLine();
			System.out.print("전화번호: ");
			String 전화번호 = 키보드.nextLine();
			
			카페고객 새로운고객 = new 카페고객(이름, 전화번호);
			고객목록.add(새로운고객);
			
			System.out.println(이름 + "님 가입을 축하합니다!");
			System.out.println("남은 포인트 : "+새로운고객.포인트+'p');
		}else if(선택 ==2) {
			System.out.print("적립할 고객 전화번호: ");
            String 조회할전화번호 = 키보드.nextLine();
			
			int 번호 = 0;
//			while(번호 < 고객목록.size()) {
//				고객 하나의대상 = 고객목록.get(번호);
//			}
			while (번호 < 고객목록.size() && 
					!고객목록.get(번호).전화번호.equals(조회할전화번호)) {
				번호 += 1;
			}
				/*
				if(하나의대상.이름.equals(이름)) {
					System.out.println(하나의대상.이름 + "님, 남은포인트는 "+ 하나의대상.포인트+"입니다.");
				}else {
					System.out.println("이름을 확인해주세요!");
				}
				번호+=1;
				*/
			// while 문을 끝까지 돌지 않고 중간에 찾았다면 (인덱스가 리스트 크기보다 작다면)
				if (번호 < 고객목록.size()) {
					카페고객 대상고객 = 고객목록.get(번호);
					System.out.print("적립할 포인트: ");
					int 적립포인트 = 키보드.nextInt();
					키보드.nextLine(); // nextInt() 이후 개행 문자 제거

					// 해당 고객의 포인트를 누적해서 더해줍니다.
					대상고객.포인트 += 적립포인트;
					System.out.println("\n" + 대상고객.이름 + "님께 " + 적립포인트 + "p가 적립되었습니다.");
					System.out.println("현재 남은 포인트: " + 대상고객.포인트 + "p");
				} else {
					// 리스트를 전부 돌았는데도 찾지 못한 경우
					System.out.println("\n등록되지 않은 고객의 전화번호입니다. 번호를 확인해주세요.");
				}
			
			
		}else if(선택 == 3) {
			System.out.print("조회할 고객의 전화번호: ");
			String 조회할전화번호 = 키보드.nextLine();

			int 번호 = 0;
			// 입력한 전화번호와 일치하는 고객을 찾을 때까지 인덱스를 1씩 늘리며 리스트를 탐색
			while (번호 < 고객목록.size() && !고객목록.get(번호).전화번호.equals(조회할전화번호)) {
				번호 += 1;
			}

			// 조회 성공 시
			if (번호 < 고객목록.size()) {
				카페고객 대상고객 = 고객목록.get(번호);
				System.out.println("\n" + 대상고객.이름 + "님의 남은 포인트는 " + 대상고객.포인트 + "p입니다.");
			} else {
				// 조회 실패 시
				System.out.println("\n등록되지 않은 고객의 전화번호입니다. 번호를 확인해주세요.");
			}
			
		} else if (선택 == 0) {
			System.out.println("\n프로그램을 종료합니다. 이용해 주셔서 감사합니다.");
			break; // while 문을 탈출하여 프로그램 종료
		}
	}
}
}

/*

카페 포인트 적립 — 상황
고객 정보
이름,전화번호,포인트 


전화번호 하나로 여러 정보를 관리하는 상황 
(등록 → 적립 → 조회) 등록 시점엔 이름,
전화번호만 알고, 포인트는 아직 없음 (이제 막 가입했으니까)

기본값 필드기본값왜 이 값인지이름(직접 입력)등록 
시점에 이미 앎전화번호(직접 입력)등록 시점에 이미 앎
포인트 0  방금 가입했으니 적립된 게 없음


System.out.println("\n===== 메뉴 =====");
System.out.println("1. 고객 등록");
System.out.println("2. 포인트 적립");
System.out.println("3. 포인트 조회");
System.out.println("0. 종료");
System.out.print("선택: ");



1) 프로그램 시작 → ArrayList<고객> 고객목록 준비
   ↓
2) while(true)로 메뉴 반복 출력
   ↓
3) 사용자가 번호 입력 (nextInt) → 개행 제거 (nextLine)
   ↓
4) 선택값에 따라 분기
   ├─ 1: 고객등록 → 이름/전화번호 입력 → new 고객(이름, 전화번호) 생성
   │              (포인트는 매개변수로 안 받고 생성자 안에서 0으로 자동 설정)
   │              → 고객목록.add()
   │
   ├─ 2: 포인트적립 → 전화번호/적립포인트 입력
   │              → 고객목록 반복 순회 (while + get(번호))
   │              → 전화번호 일치하는 고객 찾기
   │              → 찾으면 대상.포인트 += 적립포인트 → break
   │              → 못 찾으면 "등록된 고객이 아닙니다"
   │
   ├─ 3: 포인트조회 → 전화번호 입력
   │              → 고객목록 반복 순회
   │              → 전화번호 일치하는 고객의 이름+포인트 출력
   │
   └─ 0: 종료 → break → 프로그램 종료
   ↓
5) 종료 아니면 2번으로 돌아가서 메뉴 다시 출력 (반복)



 */