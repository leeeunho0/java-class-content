package com.yonsai.interfacetest.service;

import java.awt.FlowLayout;
import javax.swing.*;

interface 배달수단 {
    void 배달하기(int 거리);
}

class 오토바이배달 implements 배달수단 {
    @Override
    public void 배달하기(int 거리) {
        System.out.println("오토바이로 " + 거리 + "km 배달 (예상 10분)");
    }
}

class 도보배달 implements 배달수단 {
    @Override
    public void 배달하기(int 거리) {
        System.out.println("도보로 " + 거리 + "km 배달 (예상 30분)");
    }
}

class 자전거배달 implements 배달수단 {
    @Override
    public void 배달하기(int 거리) {
        System.out.println("자전거로 " + 거리 + "km 배달 (예상 20분)");
    }
}

class 배달처리 {
    public void 배달시작(배달수단 수단, int 거리) {
        수단.배달하기(거리);
        System.out.println("배달이 접수되었습니다.");
    }
}


/**
1. interface 배달수단 { void 배달하기(int 거리); } 선언
      ↓
2. 오토바이배달, 도보배달, 자전거배달이 각각 다르게 구현
      ↓
3. 배달처리.배달시작(배달수단 수단, int 거리) - 인터페이스 타입으로 매개변수 받음
      ↓
4. GUI 라디오버튼 3개 생성 + ButtonGroup으로 하나만 선택되게 묶음
      ↓
5. 버튼 클릭 이벤트(addActionListener) 등록
      ↓
6. 이벤트 안에서 어떤 라디오버튼이 선택됐는지 isSelected()로 확인
      ↓
7. 선택된 결과에 맞는 배달수단 객체를 new로 생성해서 배달시작()에 전달
      ↓
8. 배달시작() 내부에서 수단.배달하기(거리) 실행 → 선택에 따라 다른 결과 출력
*/

public class InterfaceTest4 {
// main연결해서 실행하기 
	public void 실습() {
		JFrame 배달창 = new JFrame();
        배달창.setSize(350, 250);
        배달창.setLayout(new FlowLayout());

        JLabel 안내 = new JLabel("배달 수단을 선택하세요.");
        JRadioButton 오토바이 = new JRadioButton("오토바이");
        JRadioButton 도보 = new JRadioButton("도보");
        JRadioButton 자전거 = new JRadioButton("자전거");

        ButtonGroup group = new ButtonGroup();
        group.add(오토바이);
        group.add(도보);
        group.add(자전거);

        JButton btn = new JButton("배달시작");

        btn.addActionListener(e -> {
            배달수단 선택수단 = null;
            if (오토바이.isSelected()) { 선택수단 = new 오토바이배달(); }
            else if (도보.isSelected()) { 선택수단 = new 도보배달(); }
            else if (자전거.isSelected()) { 선택수단 = new 자전거배달(); }

            배달처리 배달 = new 배달처리();
            배달.배달시작(선택수단, 3);
        });

        배달창.add(안내);
        배달창.add(오토바이);
        배달창.add(도보);
        배달창.add(자전거);
        배달창.add(btn);
        배달창.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        배달창.setVisible(true);
		
		
	}
}