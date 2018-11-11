package While;

public class Whileloop {
	
	public static void main(String args[])
	{
		Whileloop w = new Whileloop();
		int n=0,i=0;
		while(i<=100)
		{
			n=i+n;
			i++;
		}
		System.out.print(n);
		w.prime();
	}
	
	public void prime()
	{
		int n =0 ,i=0,k,j;
		while(i<=100)
		{
			  k=0;
	            for(j=2;j<i;j++)
	            {
	                if(i%j==0)
	                {
	                    k=1;
	                    break;
	                }
	            }
	            if(k==0)
	            {
	                System.out.println(i);
	            }

	            i++;
		}
	}
	public void even()
	{
		for(int i=0;i<=100;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}

}
