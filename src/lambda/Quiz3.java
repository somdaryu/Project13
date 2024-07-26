package lambda;

public class Quiz3 {

	public static void main(String[] args) {
		StringConverterImpl stringcoverter = new StringConverterImpl();
		System.out.println(stringcoverter.convert("abc"));
		
		StringConverter stringcoverter2 = new StringConverter() {
			
			@Override
			public String convert(String s) {
				return s.toUpperCase();
			}
		};
		
		System.out.println(stringcoverter2.convert("abc"));
		
		StringConverter stringcoverter3 = s -> s.toUpperCase();
		System.out.println(stringcoverter3.convert("abc"));
	}

}

//함수형 인터페이스 선언
interface StringConverter {
	//문자열을 대문자로 변환해서 반환하는 함수
	String convert(String s);
}

class StringConverterImpl implements StringConverter {

	@Override
	public String convert(String s) {
		return s.toUpperCase();
	}
	
}
