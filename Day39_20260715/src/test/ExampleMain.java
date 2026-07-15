// Day38 복습

package test;

public class ExampleMain {
    public static void main(String[] args) {
        // 50만 원이 들어있고 비밀번호가 "1234"인 카카오 계좌 생성
    	Example2 나의계좌 = new Example2(500000, "1234");

        System.out.println("--- 1단계: 비밀번호가 틀린 경우 ---");
        // 비밀번호를 "9999"로 틀리게 입력하여 20만 원 출금 시도
        int 결과1 = 나의계좌.출금하기(200000, "9999");
        System.out.println("출금 결과 코드: " + 결과1); // -1 출력 (비밀번호 오류)
        System.out.println();

        System.out.println("--- 2단계: 잔액이 부족한 경우 ---");
        // 비밀번호는 맞지만, 잔액(50만원)을 초과하는 60만 원 출금 시도
        int 결과2 = 나의계좌.출금하기(600000, "1234");
        System.out.println("출금 결과 코드: " + 결과2); // -2 출력 (잔액 부족)
        System.out.println();

        System.out.println("--- 3단계: 모든 검증을 통과하여 성공한 경우 ---");
        // 비밀번호도 맞고, 잔액도 충분하므로 20만 원 출금 성공
        int 현금 = 나의계좌.출금하기(200000, "1234");
        System.out.println("내 지갑에 들어온 돈: " + 현금 + "원"); // 200000원 출력
        System.out.println();

        System.out.println("--- 최종 잔액 조회 ---");
        int 최종잔액 = 나의계좌.잔액조회("1234");
        System.out.println("현재 남은 계좌 잔액: " + 최종잔액 + "원"); // 300000원 출력
    }
}
