package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Quiz4 {

	public static void main(String[] args) {
		List<Customer> list = new ArrayList<>();
		list.add(new Customer("둘리", 40, 100));
		list.add(new Customer("또치", 13, 50));
		list.add(new Customer("도우너", 25, 70));

		Stream<Customer> stream1 = list.stream();
		System.out.println("== 고객 명단 ==");
		stream1.forEach(n -> System.out.println(n.name));

		Stream<Customer> stream2 = list.stream();
		int sum = stream2.mapToInt(n -> n.budget).sum();
		System.out.println("총 여행 비용: " + sum);

		Stream<Customer> stream3 = list.stream();
		System.out.println("== 20세 이상 고객 명단 ==");
		stream3.filter(s -> s.age >= 20).sorted((c1, c2) -> c1.age > c2.age ? 1 : -1).forEach(s -> System.out.println(s.name +" "+ s.age));
	}

}

class Customer {
	String name;
	int age;
	int budget;

	public Customer(String name, int age, int budget) {
		super();
		this.name = name;
		this.age = age;
		this.budget = budget;
	}
}