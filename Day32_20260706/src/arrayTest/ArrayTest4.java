package arrayTest;

public class ArrayTest4 {

	public static void main(String[] args) {
		// 반복문 쓰지 말고! 
		int[] 주문금액 = {
		    35000, 120000, 18000, 95000, 150000,
		    42000, 105000, 68000, 12000, 130000,
		    55000, 78000, 99000, 25000, 110000,
		    47000, 89000, 135000, 22000, 64000,
		    51000, 160000, 73000, 28000, 98000,
		    145000, 39000, 87000, 115000, 66000,
		    175000, 31000, 82000, 101000, 58000,
		    92000, 48000, 125000, 71000, 20000
		};

		// 1. 모든 주문 금액 출력하기
		for(int all = 0; all < 주문금액.length; ++all) {
			System.out.println(주문금액[all]);
		}

		System.out.println();
		System.out.println();
		
		// 2. 10만원 이상 주문만 출력하기
		//   금액 출력 
		
		int 주문건수 = 0;
		for (int i = 0; i < 주문금액.length; i++) {
			int 금액 = 주문금액[i];
				if (금액 >= 100000) {
					System.out.printf("10만원 이상 금액은 : " + 금액);
					System.out.println();
					주문건수++;
				}
		}
		
		System.out.println();
		System.out.println();
		
		// 3. 가장 큰 주문금액 찾기 
		
		int more = 주문금액[0];
		
		for(int s = 0; s < 주문금액.length; ++s) {
			if(주문금액[s] > more) {
				more = 주문금액[s];
			}
		}
		System.out.println("가장 큰 금액:" + more);
		System.out.println();
		System.out.println();
		
		// 4. 10만원 이상 주문 건수 구하기

		System.out.println("10만원 이상 주문건수는 " + 주문건수 + "입니다.");
		
		
		
	}

}
