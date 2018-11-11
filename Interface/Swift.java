package Interface;

public class Swift implements BasicCar {

	public static void main(String []args)
	{
	}
	

	@Override
	public void Start() {
		System.out.println("Swift started");	
		
	}

	@Override
	public void stop() {
		System.out.println("Swift sTOPED");
		
	}

	@Override
	public void acceleration() {
		System.out.println("Swift RUNNED");
		
	}

}
