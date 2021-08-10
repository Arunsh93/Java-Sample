package day_1;

public class BasicOOP {

	BasicOOP() {
		System.out.println("Initialize the Object");
	}

	BasicOOP(int i) {
		System.out.println("Parameterized Constructor i: " + i);
	}

	public static void main(String[] args) {

		BasicOOP object = new BasicOOP();
		object.printSomething();

		BasicOOP object2 = new BasicOOP(100);
		object2.printSomething();
	}

	public void printSomething() {
		System.out.println("This is from BasicOOP");
	}

	public static void printSomething2() {
		System.out.println("This is form BasicOOP 2");
	}
}
