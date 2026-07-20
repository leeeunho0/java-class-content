import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MenuTest2 {
	public MenuTest2() {
		
		// Canvas(캔버스)
		// - 그림을 그리는 하얀 도화지(스케치북)
		// - HTML도 <Canvas> 태그 있음
		// - 그림을 그릴 때 필요한 것이 하나 있다.
		// 그림을 그릴 수 있는 도구가 필요하다!
		// Graphics - 색연필, 연필, 크래파스 처럼 도구!
		
		// 창 만들기
		JFrame 윈도우창 = new JFrame();
		
		// 창 설정
		윈도우창.setSize(400, 500);
		
		// 내용 추가
		// JPanel - 그림을 그리거나 공간을 나눠서 사용해야될 때 쓰는 도구!
		JPanel 도화지 = new JPanel();
		
		// 도화지에 색상을 추가하기
		도화지.setBackground(Color.green);
		
		윈도우창.add(도화지);
		// 엑스 누르면 종료
		윈도우창.setDefaultCloseOperation(3);
		
		// 보이기
		윈도우창.setVisible(true);
	}
}
