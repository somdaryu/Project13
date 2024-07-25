package innerclass;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Quiz1 {

	public static void main(String[] args) {
		//화면 생성
		Frame frame = new Frame(); //프레임 선언
		frame.setLayout(new FlowLayout());
		frame.setBounds(500, 300, 500, 300); //x좌표, y좌표, 넓이, 높이
		frame.setVisible(true);//setVisible(true)를 해줘야 눈으로 확인 가능
		
		//키 이벤트 등록하기!
		//프레임을 열고, 키를 누르면 "키를 눌렀습니다!" 출력
		//1. 구현클래스 사용해서 등록 2.익명클래스를 사용해서 등록
//		frame.addKeyListener(new KeyLitenHandler());

		frame.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyPressed(KeyEvent e) {
				System.out.println("키를 눌렀습니다!!!!");
				
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
	}

}

class KeyLitenHandler implements KeyListener {

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("키를 눌렀습니다!!!");
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
