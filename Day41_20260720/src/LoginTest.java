import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginTest {

	public LoginTest() {
	
	// 창 만들기
	JFrame 윈도우창 = new JFrame();
	
	// 창 설정
	윈도우창.setSize(600, 300);
	
	// 가로 정렬 (FlowLayout)
	// 가운데 정렬을 해서  FlowLayout.CENTER
	// 가로 간격 (px) 20
	// 세로 간격 (px) 15
	
	윈도우창.setLayout(new FlowLayout(FlowLayout.CENTER,20,15));
	
	
	JLabel 아이디라벨 = new JLabel("아이디: ");
	JTextField 아이디창 = new JTextField(10);
	JLabel 비밀번호라벨 = new JLabel("비밀번호: ");
	JPasswordField 패스워드창 = new JPasswordField(10);
	JButton 로그인버튼 = new JButton("로그인!");
	
	// 사용자가 행동하기를 기다린다.
	// 사용자가 로그인 버튼을 클릭하면 
	로그인버튼.addActionListener(e->{
		// 자바스크립트에서도 input 타입들 이벤트 처리할때
		// 이벤트객체 자동으로 넘어온다. 안쓰고 싶으면 안쓰면 됨
		String 아이디 = 아이디창.getText();
		// 비밀번호가 각각 저장되어있는 char[] 로 되어있다.
		// 그래서 문자로 변경해라!
		String 비밀번호 = new String(패스워드창.getPassword());
		
		System.out.println("아이디: "+아이디);
		System.out.println("비밀번호: "+비밀번호);
		
		if(아이디.equals("admin")&&
				비밀번호.equals("1234")) {
			System.out.println("로그인 성공!");
			JOptionPane.showMessageDialog(null, "로그인 성공");
		}else {
			System.out.println("아이디 또는 비밀번호 확인하세요.");
			JOptionPane.showMessageDialog(null, "로그인 실패");
		}
	});
	
	
	윈도우창.add(아이디라벨);
	윈도우창.add(아이디창);
	윈도우창.add(비밀번호라벨);
	윈도우창.add(패스워드창);
	윈도우창.add(로그인버튼);
	// 엑스 누르면 종료
	윈도우창.setDefaultCloseOperation(3);
	// 보이기
	윈도우창.setVisible(true);
	
	
	}
}
