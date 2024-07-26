package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex3 {

	public static void main(String[] args) {
		//리스트 생성
		List<Integer>  list = Arrays.asList(1, 1, 2, 3, 5, 4);
		
		//리스트로부터 스트림 생성
		Stream<Integer> stream1 = list.stream();
		
//		//distinct: 중복을 제거하는 연산자
//		stream1.distinct().forEach(n -> System.out.print(n + " "));
//		
//		
//		//filter: 조건에 맞는 결과를 추출. 2의 배수만 추출
//		list.stream()
//					.filter(n -> n%2 == 0)
//					.forEach(n -> System.out.print(n + " "));
//		
//		//limit: 요소를 3개만 추출
//		list.stream()
//					.limit(2)
//					.forEach(n -> System.out.print(n + " "));
		
		//sorted:요소를 순서대로 정렬하는 연산자
		list.stream()
					.sorted(Comparator.reverseOrder())
					.forEach(n -> System.out.print(n + " "));
		
		//기본형 스트림 : sum, max, min같은 함수 사용 불가
		Stream<Integer> stream2 = list.stream();
		
		//숫자타입 스트림 : sum, max, min같은 함수 사용 가능
		IntStream intStream = stream2
									.mapToInt(n -> n.intValue());
		
//		stream2.sum ??
				
		intStream.sum();
		
		//map: 다른 값으로 변경하는 연산자
		List<String> strList = Arrays.asList("aaa","bbb","ccc");
		
		//문자열 -> 대문자
		strList.stream()
						.map(s -> s.toUpperCase())
						.forEach(s->System.out.print(s+" "));
		
		//문자열 -> 문자열의 길이
		strList.stream()
						.map(s->s.length())
						.forEach(s->System.out.print(s+" "));
		
		//도서리스트
		List<Book> list2 = new ArrayList<>();
		list2.add(new Book("자바프로그래밍", 10000));
		list2.add(new Book("스프링프로젝트", 20000));
		
		//도서의 제목만 꺼내서 출력하기
		list2.stream()
					.map(t -> t.title)
					.forEach(s->System.out.print(s+" "));
		
		list2.stream().forEach(s->System.out.print(s.title+" "));
	}

}

class Book {
	String title;
	int price;
	public Book(String title, int price) {
		super();
		this.title = title;
		this.price = price;
	}
}

//
//R apply(T t) {
//	return t.title;
//}