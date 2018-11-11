package Day1;

public class Maths {
	
	
	public  int add(int a, int b)
	{
		a= a+b;
		return a;
		
	}
	public  int subtract(int a, int b)
	{
		a= a-b;
		return a;
	}

	public static void main(String[] args) {
		
		Maths m = new Maths();
		System.out.println("additoion" + m.add(5,6));
		System.out.println("Subtraction" + m.subtract(6,5));
		// TODO Auto-generated method stub

	}

}
