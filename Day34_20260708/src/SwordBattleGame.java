import java.util.ArrayList;
import java.util.Scanner;

public class SwordBattleGame {

	public static void main(String[] args) {
		//
		
		Scanner 키보드 = new Scanner(System.in);

		// 구매한 아이템들을 담는 가방
		ArrayList<String> 가방 = new ArrayList<>();
		ArrayList<String> 물리친몬스터목록 = new ArrayList<>();
		int 소지금 = 400;
		
		while(true) {
	    System.out.println("====== 용사의 모험 ======");
        System.out.println("내 가방: " + 가방);
        System.out.println("1. 몬스터와 싸우기");
        System.out.println("2. 가방 보기");
        System.out.println("3. 상점 가기");
        System.out.println("4. 처치한 몬스터");
        System.out.println("5. 종료");
        System.out.print("번호 입력 : ");
        		
        int 메뉴선택 = 키보드.nextInt();
		키보드.nextLine();
		
		if(메뉴선택 == 3) {
			System.out.println("====== 용사의 상점 ======");
			System.out.println("소지금: " + 소지금 + "원");
			System.out.println("1. 아이템 구매하기");
			System.out.println("2. 내 가방 보기");
			System.out.println("3. 이전으로");
			System.out.print("번호 입력:");
			int 상점메뉴 = 키보드.nextInt();
			키보드.nextLine();
			
			if(상점메뉴 == 1) {
				System.out.println("--- 아이템 상점 ---");
				System.out.println(" 1. 검 (50원) ");
				System.out.println(" 2. 창 (100원) ");
				System.out.println(" 3. 낫 (500원) ");
				System.out.print("구매할 아이템 번호를 선택: ");

				// 1. 구매할 아이템 번호를 입력받는다.
				int 구매아이템 = 키보드.nextInt();
				// 2. 소지금에서 검을 살수있는지 비교를한다.
				String 아이템이름 = "";
				int 가격 = 0;
				int 무기공격력 = 0;

				if (구매아이템 == 1) {
					아이템이름 = "검";
					무기공격력 = 50;
					가격 = 50;
				} else if (구매아이템 == 2) {
					아이템이름 = "창";
					무기공격력 = 100;
					가격 = 100;
				} else if (구매아이템 == 3) {
					아이템이름 = "낫";
					무기공격력 = 500;
					가격 = 500;
				}
								
				if (소지금 >= 가격) {
					소지금 = 소지금 - 가격; // 잔액
					가방.add(아이템이름);
					System.out.println(아이템이름 + "구매완료!");
				} else {
					System.out.println("돈이 부족합니다! 현재 소지금: " + 소지금 + "원");
				}
			}else if(상점메뉴 == 2) {
				System.out.println(가방);
			}else if(상점메뉴 == 3) {
				System.out.println();
			}
		}else if(메뉴선택 == 1) {
	        System.out.println(" 1. 슬라임 ");
	        System.out.println(" 2. 고블린 ");
	        System.out.println(" 3. 드래곤 ");
	        System.out.print("물리칠 몬스터 번호를 선택: ");
	        int 처치할몬스터 = 키보드.nextInt();

	        String 몬스터이름 = "";
	        int 슬라임체력 = 100, 고블린체력 = 200, 드래곤체력 = 500;
	        int 몬스터체력 = 0;    
	        if(처치할몬스터 == 1) {
	        	몬스터이름 = "슬라임";
	        	몬스터체력 = 0;
	        	  
	        	if(!가방.isEmpty()) {
	        		System.out.println("검으로 슬라임을(를) 물리쳤습니다!");
	        		물리친몬스터목록.add(몬스터이름);
	        	}else {
	        		System.out.println("무기가 없어서 싸울 수 없습니다!");
	        	}
	        }else if(처치할몬스터 == 2){
	        	몬스터이름 = "고블린";
	        	몬스터체력 = 200;
	        	if(!가방.isEmpty()) {
	        		System.out.println("검으로 고블린을(를) 물리쳤습니다!");
	        		물리친몬스터목록.add(몬스터이름);
	        	}else {
	        		System.out.println("무기가 없어서 싸울 수 없습니다!");
	        	}
	        }else if(처치할몬스터 == 3){
	        	몬스터이름 = "드래곤";
	        	몬스터체력 = 500;
	        	if(!가방.isEmpty()) {
	        		System.out.println("검으로 드래곤을(를) 물리쳤습니다!");
	        		물리친몬스터목록.add(몬스터이름);
	        	}else {
	        		System.out.println("무기가 없어서 싸울 수 없습니다!");
	        	}
	        	
	        }
	        
	        
	        
	        
	        
	        
	        
		else if(메뉴선택 == 2) {
			System.out.println("--- 내 가방 ---");
			System.out.println(가방);
		}
			
			
			
			
			
			
			
		}else if(메뉴선택 == 4) {
			System.out.println("---물리친 몬스터---");
			System.out.println(물리친몬스터목록);
		}else if(메뉴선택 == 5) {
			System.out.println("모험을 종료합니다.");
			break;
		}
        
        
        
		}
		
		
		
		
		
	}

}


/*

🗡️ 실습 문제: 용사의 몬스터 사냥 게임
📖 상황 설명
당신은 간단한 RPG 게임을 만들고 있습니다. 주인공은 게임을 시작할 때부터 이미 가방에 "검"을 가지고 있는 상태입니다.
주인공은 메인 메뉴에서 몬스터를 선택해서 물리칠 수 있고, 검을 가지고 있는 한 항상 승리합니다. 물리친 몬스터는 별도의 목록에 기록되어야 합니다.
프로그램은 사용자가 "종료"를 선택하기 전까지 계속 메인 메뉴로 돌아와서 반복되어야 합니다. (뒤로가기 기능은 없이, 몬스터 하나 물리치면 자동으로 메인 메뉴로 돌아오는 단순한 구조입니다.)

✅ 요청사항
메인 메뉴는 아래와 같이 출력되어야 합니다.
====== 용사의 모험 ======
내 가방: [검]
1. 몬스터와 싸우기
2. 가방 보기
3. 종료

가방(ArrayList) 생성 시 "검"을 미리 넣어둔다
1번 선택 → 몬스터 목록(슬라임, 고블린, 드래곤)을 보여주고 번호를 입력받는다

가방에 "검"이 있으면 → "검으로 OOO을(를) 물리쳤습니다!" 출력 후, 물리친 몬스터 목록에 추가
가방에 "검"이 없으면 → "무기가 없어서 싸울 수 없습니다!" 출력


2번 선택 → 가방 내용물 + 지금까지 물리친 몬스터 목록을 각각 출력
3번 선택 → 종료 메시지 출력 후 프로그램 종료


💡 힌트
해야 할 일사용할 문법참고가방 만들고 검을 미리 넣기
ArrayList<String> 가방 = new ArrayList<>(); 
만든 직후 가방.add("검");
게임 시작하자마자 한 번만 실행됨프로그램이 
계속 반복되게while(true)안쪽 반복문은 
필요 없음(뒤로가기 없음)
메뉴 번호 분기if ~ else if ~ else if
메뉴선택 1,2,3 각각 처리몬스터 번호 
분기if ~ else if ~ else if몬스터 이름을
문자열 변수에 먼저 저장해두기검이 있는지 가방에 검이있는지? 
true/false로 알려주는 메서드, 
if문 조건으로 사용물리친 몬스터 기록별도의
ArrayList<String> 하나 더 만들어서 
.add()가방과는 다른 목록!
리스트 전체 출력
System.out.println(리스트변수)[검], [슬라임, 고블린] 형태로 자동 출력됨

1. Scanner 생성
   가방(ArrayList) 생성 → "검" 미리 add
   물리친몬스터목록(ArrayList) 생성
        ↓
2. while(true) 시작 → 메인 메뉴 출력
   (가방 내용 표시 + 1.전투 2.가방보기 3.종료)
        ↓
3. 메뉴선택 번호 입력받기 (nextInt)
        ↓
4. 메뉴선택 값에 따라 분기 (if ~ else if ~ else if)
        ↓
   ┌─────────────────┬─────────────────┬─────────────┐
   │  메뉴선택==1      │  메뉴선택==2     │ 메뉴선택==3  │
   ↓                 ↓                 ↓
5-A. 몬스터목록 출력   5-B. 가방 출력    5-C. 종료 메시지
        ↓                + 물리친목록      출력 + break
6-A. 몬스터선택번호       출력
   입력받기                              ↓
        ↓                          while(true) 탈출
7-A. 몬스터선택번호에                 → 프로그램 완전 종료
   따라 분기
   (1~3: 몬스터이름 변수에 저장)
        ↓
8-A. 가방.equals("검") 확인
        ↓
   ┌──────────────┬──────────────────┐
   │  검이 있음     │  검이 없음         │
   ↓              ↓
9-A. "물리쳤습니다"   9-B. "무기가 없어서
   출력                  싸울 수 없습니다"
   물리친몬스터목록      출력
   .add(몬스터이름)
        ↓
10. while 맨 위(2번)로 돌아가서 다시 메인 메뉴부터 반복
    (메뉴선택==3이 나올 때까지 무한 반복)

*/