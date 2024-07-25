package lambda;

public class Ex1 {

	public static void main(String[] args) {
		
		//클래스로 인터페이스 구현하기
		StringConcat stringConcat = new StringConcatImpl();
		stringConcat.makeString("Hello", "World");
		
		//람다식으로 인터페이스 구현하기
		StringConcat stringConcat2 = (s1, s2) -> System.out.println(s1 +", "+ s2);
		stringConcat2.makeString("Hello", "World");
	}
}


//함수형 인터페이스 만들기
interface StringConcat {
	//추상메소드 하나 만들기(두 문자열을 연결하는 함수)
	public void makeString(String s1, String s2);
}

//구현클래스 만들기 인터페이스이름+Impl
class StringConcatImpl implements StringConcat {

	@Override
	public void makeString(String s1, String s2) {
		System.out.println(s1 +", "+ s2);
	}
	
}