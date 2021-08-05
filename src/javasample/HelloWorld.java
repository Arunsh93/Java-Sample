package javasample;

public class HelloWorld {
	
	static int value1;
	static long value2;
	static float value3;
	static double value4;
	static String value5;
	static boolean value6;

	public static void main(String[] args) {
		System.out.println("Hello World");
		//Default Values
		System.out.println("//----------------------------//");
		System.out.println("Default Value of int: "+ value1);
		System.out.println("Default Value of long: "+ value2);
		System.out.println("Default Value of float: "+ value3);
		System.out.println("Default Value of double: "+ value4);
		System.out.println("Default Value of String: "+ value5);
		System.out.println("Default Value of boolean: "+ value6);
		
		System.out.println("//-----------------------------//");
		
//		final int i = 0;
//		System.out.println(i);
//		j++;
//		System.out.println(j);
//		j = 2;
//		System.out.println(j);
//		j = 4;
//		System.out.println(j);
//		int j = 3;
//		System.out.println(j);
//		j = 5;
//		System.out.println(j);
		
		float tempfloat = (float) 0.2352525212345678951225569877445561123162555633364;
		System.out.println(tempfloat);
		
		double tempDouble = (double) 2.2352525212345678;
		System.out.println(tempDouble);
		
		tempfloat = (float)tempDouble;
		
		System.out.println(tempfloat);
		
		value1 = (int)tempfloat;
		System.out.println(value1);
		
		int k = 5;
		int j = 6;
		float i = k / j;
		System.out.println("Result is --> "+i); 
		
		String sampleString = "\"ArunNHosur\"";
		System.out.println(sampleString.toLowerCase());
		System.out.println(sampleString.toUpperCase());
		System.out.println(sampleString.toUpperCase().indexOf("N"));
		System.out.println(sampleString.toUpperCase().lastIndexOf("N"));
		//System.out.println(sampleString.toString());
	}
}