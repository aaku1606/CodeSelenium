package Swicth;

public class switchCase {
	
	public String switchcase(int number)
	{
		switch (number) {
		case 1:
			return "Jan" ;
		case 2:
			return "Feb" ;
		case 3:
			return "Mar" ;
		case 4:
			return "Apr" ;
		case 5:
			return "May" ;
		case 6:
			return "Jun" ;
		case 7:
			return "July" ;
		case 8:
			return "aUG" ;
		case 9:
			return "sEPT" ;
		case 10:
			return "oCT" ;
		case 11:
			return "nOV" ;
		case 12:
			return "dEC" ;
			

		default:
			return "invalid";
		}
	}
	public static void main(String args[])
	{
		switchCase c = new switchCase();
		System.out.print(c.switchcase(5));
	}

}
