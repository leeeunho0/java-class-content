import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {

		// 1. 키보드 생성
		Scanner 키보드 = new Scanner(System.in);
		
		// 2. 나이 입력
		// println() 괄호 안에 있는 값을 콘솔에 출력하고 자동으로 줄바꿈!
		// print() 괄호안에 있는 값을 콘솔에 출력만 한다
		System.out.print("나이를 입력:");
		int age = 키보드.nextInt();
						/* 20\n
		 키보드로 입력한 값중ㅇ에 필요없는 내용들은
		 자판기에 거스름돈을 반봔받고 자판기는 0원
		 식판에 음식을 받아서 모두 먹는것! 식판 깨끗이 비운다.
		 입력버퍼(후반 입력 출력 수업)
		 숫자를 입력하고 나서 문자를 입력받으려면
		 기존에 남아있는 불필요한 문자들을 싹 지워야된다.
		 안그러면 다음 입력을 받을 때 버그가 생긴다.
		키보드.nextLine();
*/
		
		System.out.print("이름을 입력:");
		String name = 키보드.nextLine();
		
		System.out.print("----사람의 정보----");
		System.out.print("이름:" + name);
		System.out.print("나이:"+ age);

	}

}
