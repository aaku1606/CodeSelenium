
public class Biggerstring {
	
	
	public String biggerstring(String a, String b)
	{
		if(a.length()>b.length())
			return a;
		else 
			return b;
	}
	public static void main()
	{
		String String1= "ABC";
		String String2 = "CDEF";
		Biggerstring b = new Biggerstring();
		String bigger = b.biggerstring(String1,String2);
		System.out.println(bigger);
		
		
	}

}
