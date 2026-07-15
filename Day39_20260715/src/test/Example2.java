// Day38 복습

package test;

public class Example2 {
	    // 1. private으로 데이터를 단단히 잠금 (외부에서 직접 수정/조회 불가)
	    private int 잔액;         // 잔액
	    private String 비밀번호;     // 비밀번호

	    // 생성자 (초기 계좌 개설)
	    public Example2(int 잔액, String 비밀번호) {
	        this.잔액 = 잔액;
	        this.비밀번호 = 비밀번호;
	    }

	    // 2. 내부 도우미 메서드 (private): 비밀번호가 맞는지 판단하는 내부 로직
	    // 외부(메인 클래스)에는 노출되지 않고, 오직 이 클래스 내부에서만 사용됩니다.
	    private boolean 비밀번호확인(String 입력비밀번호) {
	        return this.비밀번호.equals(입력비밀번호);
	    }

	    /**
	     * 3. 안전한 Getter: 출금하기
	     * 단순히 데이터를 꺼내주는 것이 아니라, 
	     * 비밀번호 검증($1$단계)과 잔액 검증($2$단계)을 통과해야만 데이터를 넘겨줍니다.
	     */
	    public int 출금하기(int 출금금액, String 입력비밀번호) {
	        // [1단계] 비밀번호 검증
	        if (!비밀번호확인(입력비밀번호)) {
	            System.out.println("[⚠️ 경고] 비밀번호가 일치하지 않습니다.");
	            return -1; // 약속된 에러 코드 (-1) 반환
	        }

	        // [2단계] 잔액 확인: 잔액이 출금 요청 금액보다 적은지 검사
	        if (this.잔액 < 출금금액) {
	            System.out.println("[⚠️ 경고] 잔액이 부족합니다. (현재 잔액: " + this.잔액 + "원)");
	            return -2; // 잔액 부족 에러 코드 (-2) 반환
	        }

	        // [3단계] 검증 성공 시 데이터 차감 처리 및 반환
	        this.잔액 -= 출금금액; // 내부 상태 변경 (잔액 감소)
	        System.out.println("[💰 성공] " + 출금금액 + "원이 출금되었습니다.");
	        return 출금금액; // 성공적으로 꺼내온 돈을 반환
	    }

	    // 현재 잔액을 확인하는 단순 안전 Getter
	    // 잔액을 조회할 때도 비밀번호 확인을 거치도록 안전장치를 설계했습니다.
	    public int 잔액조회(String 입력비밀번호) {
	        if (!비밀번호확인(입력비밀번호)) {
	            System.out.println("[⚠️ 경고] 잔액 조회를 위해 비밀번호 확인이 필요합니다.");
	            return -1;
	        }
	        return this.잔액;
	    }
	}