package javasample;

public class UseOfToString {
	
	int rollNumber;
	String name;
	String city;
	
	public UseOfToString(int rollNumber, String name, String city)
	{
		this.rollNumber = rollNumber;
		this.name = name;
		this.city = city;
	}
	
	public String toString(){
		return rollNumber+" "+name+" "+city+" ";
		
	}

	public static void main(String[] args) {
		UseOfToString s1 = new UseOfToString(101,"Arun","Gadag");
		UseOfToString s2 = new UseOfToString(102,"Mantasha","Vijayapur");
	
		System.out.println(s1);
		System.out.println(s2);
	}
}
