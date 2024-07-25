package innerclass;


//외부 클래스
class Outer {
	
	private int a = 10;
	private static int b = 20; //정적 변수
	
	//인스턴스 내부 클래스
	class InClass{
		int i1 = a; //외부클래스의 private 멤버도 사용 가능
		int i2 = b;
	}
	
	//정적 내부 클래스 / 프로그램이 실행되면 먼저 로드됨 생명주기가 달라서 static에서 non-static을 쓸 수 없음
	static class InStaticClass {
		//int i1 = a; 정적클래스에서 인스턴스변수 사용불가
		int i2 = b; //static에서 static 사용은 OK
	}
	
}