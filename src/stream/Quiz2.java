package stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class Quiz2 {

	public static void main(String[] args) {
		String[] arr = { "file1.txt", "file2.pdf", "file3.txt", "file4.img", "file5.txt", "file6.img" };
		Stream<String> stream1 = Arrays.stream(arr);
		stream1.filter(s -> s.contains("txt")).forEach(s -> System.out.print(s + " "));

		Stream<String> stream2 = Arrays.stream(arr);
		long result1 = stream2.filter(s -> s.contains("txt")).count();
		
//		Stream<String> stream6 = Arrays.stream(arr);
//		stream6.filter(s-> s.endsWith(".txt")).count(); 로도 쓸 수 있음

		Stream<String> stream3 = Arrays.stream(arr);
		long result2 = stream3.filter(s -> s.contains("pdf")).count();

		Stream<String> stream4 = Arrays.stream(arr);
		long result3 = stream4.filter(s -> s.contains("img")).count();
		
		System.out.println();
		System.out.println("txt 파일의 개수: " + result1);
		System.out.println("pdf 파일의 개수: " + result2);
		System.out.println("img 파일의 개수: " + result3);

		Stream<String> stream5 = Arrays.stream(arr);
		
		stream5.map(t -> {String[] strArr = t.split("\\.");
		return strArr[1];}).distinct().forEach(s -> System.out.print(s + " "));
		//strArr[0]은 파일 이름이 나옴
	}

}

