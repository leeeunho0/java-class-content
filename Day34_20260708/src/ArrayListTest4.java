import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest4 {

	public static void main(String[] args) {
		
		/** 
		실습 2 (중급): 할 일 목록(TODO) 관리 프로그램
		상황 설명
		할 일을 추가하고, 완료한 일은 삭제할 수 있는 프로그램을 만듭니다.
		====== TODO 관리 ======
		1. 할 일 추가
		2. 할 일 목록 보기
		3. 할 일 삭제
		4. 종료

		1번: 사용자가 직접 문자열을 입력(nextLine())해서 할 일 목록(ArrayList)에 추가
		2번: 전체 목록 출력 (목록이 비어있으면 "할 일이 없습니다" 출력)
		3번: 삭제할 할 일의 이름을 입력받아서 목록에 있으면 삭제, 없으면 "해당 할 일이 없습니다" 출력
		4번: 종료

		💡 힌트
		기능사용할 문법직접 문자열 입력받기키보드.next() (공백 없는 한 단어)목록이 비어있는지 확인
		.isEmpty() 또는 .size() == 0이름으로 있는지 확인 후 삭제
		.contains(값) 으로 먼저 확인 → .remove(값)메뉴가 4개if ~ else if ~ else if ~ else if
		
		 
		 */
		
		Scanner 키보드 = new Scanner(System.in);
		ArrayList<String> 할일목록 = new ArrayList<>();
		
		while (true) {
			System.out.println("====== TODO 관리 ======");
			System.out.println("1. 할 일 추가");
			System.out.println("2. 할 일 목록 보기");
			System.out.println("3. 할 일 삭제");
			System.out.println("4. 종료");

			System.out.print("번호 입력 : ");
			int 메뉴선택 = 키보드.nextInt();
			키보드.nextLine();
		
			if (메뉴선택 == 1) {
				System.out.print("할 일 입력 : ");
				String 할일 = 키보드.nextLine();
				
				if (!할일.isEmpty()) {
                    할일목록.add(할일);
                    System.out.println(할일 + "추가되었습니다.");
                }
			}else if(메뉴선택 == 2) {
				System.out.println(할일목록);
				
			}else if(메뉴선택 == 3) {
				System.out.print("삭제할 일 입력 : ");
				String 할일삭제 = 키보드.nextLine();
				
				할일목록.remove(할일삭제);
				System.out.println(할일목록);
				
			}else if(메뉴선택 == 4) {
				System.out.println("감사합니다!");
				break;
			}
			
			
			
			
		}

		
		
		
	}

}
