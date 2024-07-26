package lambda;

public class Quiz2 {

	public static void main(String[] args) {
		Hello hello = new HelloImpl();
		hello.helloPrint();

		Hello hello2 = new Hello() {
			
			@Override
			public void helloPrint() {
				System.out.println("Hello");
				
			}
		};
		hello2.helloPrint();
		
		Hello hello3 =  () -> System.out.println("Hello");
		hello3.helloPrint();
	}

}

//함수형 인터페이스 선언
interface Hello {
	void helloPrint();
}

class HelloImpl implements Hello {

	@Override
	public void helloPrint() {
		System.out.println("Hello");
	}
	
}