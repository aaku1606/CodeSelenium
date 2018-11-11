
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;



public class sET {
public static void main(String args[]) {
		
		Set<String> a1= new HashSet<String>();
		a1.add("Ram");
		a1.add("John");
		a1.add("Sam");
		
		String[] a = null;
		a1.toArray(a);
		for(int i=0;i<a.length;i++)
		{
			a[0] = "Test"+a[0];
		}
	
		
		

		
		for(String elements : a1)
		{
			elements = "Test" + elements;
		}
		for(String elements : a1)
		{
			System.out.println(elements);
		}
		
}

}
