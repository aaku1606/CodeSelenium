import java.util.Arrays;

public class unsortedArray {
	public int biggestnumber(int [] arr)
	{
		Arrays.sort(arr);
		return arr[arr.length-1];
	}
	public static void main(String args[])
	{
		unsortedArray u = new unsortedArray();
		int [] myarr = {10,23,35,5,23,34,678,43};
		System.out.println(u.biggestnumber(myarr));
	}

}
