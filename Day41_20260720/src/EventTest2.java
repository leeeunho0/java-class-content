import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

class MyMouse extends MouseAdapter{
	// MouseEvent 마우스를 클릭시 정보를 담고 있는 객체다
	// 자바스크립트에서도 이벤트객체를 자동으로 만들어서 준것!
	// 언제 onclick 시점!
	
	// 도화지 저장
	JPanel 도화지;
	
	boolean 빨강 = false;  // 자동 초기화되서 false
	
	
	public MyMouse(JPanel 도화지) {
		this.도화지 = 도화지;
	}
	
	// 이벤트도 내가 다 만들었으니까 다 가져다 써!
	// 자바에서는 모든 코드들이 class 로 이미 틀로 묶여있다.
	// 필요한 것만 만들어서 써라!(new)를 하면 클래스 타입을 보고
	// 그 안에 있는 변수들, 혹은 함수들(메서드)을 사용할 수 있게 메모리에 로딩시킨다(올린다)!
	
	@Override
	public void mouseClicked(MouseEvent e) {

		// 랜덤으로 색상
		Random 랜덤 = new Random();
		
		// 0~255
		int r = 랜덤.nextInt(256);
		int g = 랜덤.nextInt(256);
		int b = 랜덤.nextInt(256);

		// 색상을 랜덤하게 조립해서 사용할 수 있다.
		Color 랜덤색 = new Color(r, g, b);
		
		도화지.setBackground(랜덤색);
		
		// 클릭을 하면 배경색 바꾸기!
//		if(빨강) {
//			도화지.setBackground(Color.ORANGE);
//		}else {
//			도화지.setBackground(Color.red);
//		}
//		빨강 = !빨강;
		// ! 빨강이면 오렌지로 바꾸고 오렌지면 빨강으로 바꾸는 코드
		// !true -> false
		// !false -> true
		// 실무에서 토글 로직에 많이 쓰인다.
		
		
//		System.out.println("클릭!");
//		마우스 위치
//		System.out.println("마우스 위치 가로(좌우): "+e.getX());
//		System.out.println("마우스 위치 세로(위아래): "+e.getY());
		
	}
}

public class EventTest2 {
	public EventTest2() {
		// Mouse Event
		// - 사용자가 마우스를 움직이거나 클릭했을 때 프로그램이 반응하는 기능!
		
		// 창 만들기
		JFrame 윈도우창 = new JFrame();
		
		// 창 설정
		윈도우창.setSize(400, 300);
		
		// 도화지
		JPanel 도화지 = new JPanel();
		
		도화지.setBackground(Color.orange);
		
		// 도화지에 이벤트를 추가한다.
		// 내가 자바에서 제공하는 마우스이벤트 객체 생성했다!
		// 글릭했을때 실행해라~
		// 마우스를 클릭했을때 도화지를 넘겨줄게!
		// MyMouse 객체한테 넘겨줄게! 그럼 그안에서 활용해!
		도화지.addMouseListener(new MyMouse(도화지));
		
		윈도우창.add(도화지);
		// 엑스 누르면 종료
		윈도우창.setDefaultCloseOperation(3);
		// 보이기
		윈도우창.setVisible(true);
	}
}
/*
프로그램 시작
      │
      ▼
main()
      │
      ▼
new EventTest2()
      │
      ▼
EventTest2() 생성자 실행
      │
      ▼
JFrame 생성
      │
      ▼
창 크기 설정
      │
      ▼
JPanel(도화지) 생성
      │
      ▼
도화지 배경색(주황) 설정
      │
      ▼
MyMouse 객체 생성
      │
      ▼
도화지에 MouseListener 등록
      │
      ▼
도화지를 창에 추가
      │
      ▼
창 화면에 출력(setVisible)
      │
────────────── 프로그램 대기 ──────────────
      │
      ▼
사용자가 도화지 클릭
      │
      ▼
mouseClicked() 자동 실행
      │
      ▼
Random 객체 생성
      │
      ▼
r, g, b 랜덤값 생성
      │
      ▼
Color 객체 생성
      │
      ▼
도화지.setBackground(랜덤색)
      │
      ▼
배경색 변경 완료
*/