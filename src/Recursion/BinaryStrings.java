/**
 * Generate all possible binary string of size n
 */
import java.util.Arrays;
class BinaryStrings
{
	static int arr[] = new int[5];
	
	
	public static void main(String[] args)
	{
		int n = 5;
				
		Binary(n);
	}

	public static void Binary(int n)
	{
		if(n < 1)
			System.out.println(Arrays.toString(arr));

		else
		{
			arr[n-1] = 0;
			Binary(n-1);
			arr[n-1] = 1;
			Binary(n-1);
		}
	}

}
