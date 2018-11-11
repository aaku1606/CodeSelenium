package Interface;

public class Merc implements BasicCar{

	public void newMethodcruise()
	{
		System.out.println("Automatic cruise");
	}
	@Override
	public void Start() {
		System.out.println("mERC started");	
		
	}

	@Override
	public void stop() {
		System.out.println("mERC sTOPED");
		
	}

	@Override
	public void acceleration() {
		System.out.println("mERC RUNNED");
		
	}

}
