import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

// 이미지 가져오는 클래스!

public class ImageTest {
	public ImageTest() {
		System.out.println("이미지 가져오기!");
		
		// 창 만들기
		JFrame 윈도우창 = new JFrame();
		
		// 화면 설정
		윈도우창.setSize(800, 500);
		윈도우창.setLayout(new FlowLayout());
		
		// 이미지를 가져오는 도구!
		// 경로 설정
		// - 항상 프로젝트 폴더 안에 넣어놓기 그러면 파일명으로 저장 가능하다.
		// image폴더 그 안에 이미지들을 넣어놓고
		// 상대경로 - 파일 자기 자신위치에서 경로를 찾는다.
		
		// 1.사진 가져오기
		ImageIcon image01 = new ImageIcon("image01.png");
		ImageIcon image02 = new ImageIcon("image02.png");
		ImageIcon image03 = new ImageIcon("image03.png");
		
		// 2.버튼에 넣기
		JButton 버튼1 = new JButton(image01);
		JButton 버튼2 = new JButton(image02);
		JButton 버튼3 = new JButton(image03);
		
		// 3.화면에 추가하기
		윈도우창.add(버튼1);
		윈도우창.add(버튼2);
		윈도우창.add(버튼3);
		
		// 엑스 누르면 종료
		윈도우창.setDefaultCloseOperation(3);
		
		// 보이기
		윈도우창.setVisible(true);
		
	}
}
