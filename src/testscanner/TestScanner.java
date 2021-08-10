package testscanner;

import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

//		System.out.println("Give me a Input....");
//		String name = scanner.nextLine();
//		System.out.println("Name: " + name);

		System.out.println("\"ADDing two numbers...\"");
		System.out.println("Give me a 1st Number..");
		float firstNum = scanner.nextFloat();
		System.out.println("First Number = " + firstNum);

		System.out.println("Give me a 2nd Number..");
		float secondNum = scanner.nextFloat();
		System.out.println("Second Number = " + secondNum);

		float result = add(firstNum, secondNum);
		System.out.println("Result: " + result);
	}

	public static float add(float firstNum, float secondNum) {
		float result = firstNum + secondNum;
		return result;
	}
}