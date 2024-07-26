package lambda;

public class Quiz1 {

	public static void main(String[] args) {
		// Q.MyNumber를 익명클래스로 구현하고, max()를 호출하세요
		
		MyNumber mynumber = new MyNumber() {
			
			@Override
			public int max(int x, int y) {
				
				return  x > y ? x : y;
			}
		};
		
		System.out.println(mynumber.max(5, 3));
		
		// Q.MyNumber를 람다식 함수로 구현하고, max()를 호출하세요.
		MyNumber mynumber2 = (x, y) -> x > y ? x : y;
		System.out.println(mynumber2.max(5, 3));
	}

}

//함수형 인터페이스
@FunctionalInterface
interface MyNumber {
	//두 숫자중에 더 큰 값을 반환하는함수
	int max(int x, int y);
}

//Q.MyNumber의 구현클래스 만들기
class MyNumberImpl implements MyNumber{

	@Override
	public int max(int x, int y) {
		// TODO Auto-generated method stub
		return x > y ? x : y;
	}
	
}