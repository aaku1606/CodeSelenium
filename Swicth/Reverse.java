package Swicth;

public class Reverse {
	public int switchcase(String month)
	{
		month = month.toUpperCase();
		switch (month) {
		case "JAN":
			return 1 ;
		case "FEB":
			return 2 ;
		case "MAR":
			return 3 ;

			

		default:
			return 0 ;
		}
	}
	public static void main(String args[])
	{
		Reverse c = new Reverse();
		System.out.print(c.switchcase("jan"));
	}

}
