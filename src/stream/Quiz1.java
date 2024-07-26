package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Quiz1 {

	public static void main(String[] args) {
		List<String> arr = Arrays.asList("aaa","aaa","b","b","ccccc");
		Stream<String> stream1 = arr.stream();
		
		arr.stream()
			.filter(s -> s.length() > 2)
			.forEach(s->System.out.print(s+" "));
		
		//모든 문자열의 길이를 더한 합을 구하세요
		Stream<String> stream2 = arr.stream();
		arr.stream().
		
		//가장 길이가 짧은 문자열의 길으를 구하세요
		
		//중복을 제거한 리스트를 만드세요
	}

}
