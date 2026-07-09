package game;

import java.util.Random;
import java.util.Scanner;

public class UpAndDown {

	public static void main(String[] args) {
		/*
		# Up & Down 게임[2단계]
		# 1. 정답을 맞추면 게임은 종료된다.
		# 2. 100점부터 시작해 오답을 입력할 때마다 5점씩 차감된다.
		# 3. 게임 종료 후, 점수를 출력한다.
		
		1~50 사이에 랜덤값을 뽑는걸로 변경
		 */
		Scanner 키보드 = new Scanner(System.in);
		Random 랜덤도구 = new Random();
		
		int 정답 = 랜덤도구.nextInt(50)+1;  // 랜덤으로 변경!
		
		System.out.println("치트키 = " + 정답);
		
		int 오답횟수 = 0;
		int 내정답 = 0;
/*
		while (정답 != 내정답) {

		System.out.print("정답 입력 : ");
		내정답 = 키보드.nextInt();

		if (정답 != 내정답) {
		오답횟수++;
		}

		}

		int 점수 = 100 - (오답횟수 * 5);

		System.out.println("성적 = " + 점수);
*/
		
		while(true) {
			System.out.println("Up & Down 게임 ㅋ");
			System.out.println("생각한 숫자를 입력해보세요!");
			System.out.print("생각한 숫자 : ");
			int 생각숫자 = 키보드.nextInt();
			
			if(생각숫자 == 정답) {
				System.out.println();
				System.out.println("정답입니다!");
				System.out.println("정답은 " + 정답 + "입니다.");
				System.out.println("축하합니다!");
				break;
			}else if(생각숫자 > 정답) {
				System.out.println("Down! 더 낮은 숫자입니다!");
				System.out.println();
				오답횟수++;
			}else if(생각숫자 < 정답) {
				System.out.println("Up! 더 높은 숫자입니다!");
				System.out.println();
				오답횟수++;
			}
		}
		
		// 1. 키보드 생성
		
		// 2. 숫자를 입력하세요!
		
		// 3. 입력한 숫자와 정답을 맞추는 게임 !
		
		// 한번만 실행! 그래서 무한 반복을 돌려서 점수가 0미만으로 떨어지면 게임 종료!

		int 남은점수 = 100 - (오답횟수 * 5);		
		System.out.println("성적 = " + 남은점수);

	}

}
