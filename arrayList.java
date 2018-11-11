import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class arrayList {
	
	public static void main(String args[]) {
		
		List<String> a1= new ArrayList<String>();
		a1.add("Ram");
		a1.add("John");
		a1.add("Sam");
		System.out.println(a1);
		List<String> a2 = new ArrayList<String>(a1.size());
		a2.addAll(a1);
		System.out.println(a2);
		
	}

}
