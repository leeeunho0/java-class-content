// 실습1
// 카페 키오스크 주문 시스템
package test;
import java.util.ArrayList;

class 음료 {
    protected String 사이즈;

    // 1. 부모 생성자 정의 (사이즈 초기화)
    public 음료(String 사이즈) {
        this.사이즈 = 사이즈;
    }

    void 제조하기() {
        System.out.println("음료를 제조합니다");
    }
}

class 아메리카노 extends 음료 {
    // 2. 자식 생성자에서 super(사이즈) 호출
    public 아메리카노(String 사이즈) {
        super(사이즈);
    }

    // 3. 부모와 똑같이 매개변수 없는 구조로 오버라이딩 (@Override 어노테이션을 붙이면 좋습니다)
    @Override
    void 제조하기() {
        // 이미 상속받은 '사이즈' 필드에 값이 들어있으므로 바로 사용하면 됩니다.
        System.out.println("에스프레소 추출 후 물을 " + 사이즈 + "사이즈로 채웁니다");
    }
}

class 카페라떼 extends 음료 {
    public 카페라떼(String 사이즈) {
        super(사이즈);
    }

    @Override
    void 제조하기() {
        System.out.println("우유를 스티밍하고 " + 사이즈 + "사이즈로 만듭니다");
    }
}

// 클래스명을 문제 요구사항에 맞게 'green티프라푸치노'로 변경
class green티프라푸치노 extends 음료 {
    public green티프라푸치노(String 사이즈) {
        super(사이즈);
    }

    @Override
    void 제조하기() {
        System.out.println("얼음과 함께 갈아서 " + 사이즈 + "사이즈로 만듭니다");
    }
}

public class Example3 {
    public static void main(String[] args) {
        ArrayList<음료> 주문목록 = new ArrayList<>();
        
        // 이제 에러 없이 정상적으로 생성됩니다.
        주문목록.add(new 아메리카노("톨"));
        주문목록.add(new 카페라떼("그란데"));
        주문목록.add(new 아메리카노("숏"));

        // 문제 예시대로 출력 확인하기
        for (음료 잔 : 주문목록) {
            잔.제조하기();
        }
    }
}