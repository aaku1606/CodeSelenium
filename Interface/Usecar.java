package Interface;

public class Usecar {
	
	public static void main(String []args)
	{
		
		BasicCar  merc = new Merc();
		BasicCar swift = new Swift();
		merc.Start();
		merc.stop();
		
		swift.Start();
		swift.stop();
		swift.acceleration();
	}

}
