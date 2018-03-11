/**
 * Create all possible string of length n from array of [0...k-1] where k gt n
 * 
 */

import java.util.Arrays;

class KArray
{
	static char arr[] = new char[5]; //let n be 5
	static char karray[] = new char[10];
	static {
		karray[0] = 'a';
		karray[1] = 'e';
		karray[2] = 'r';
		karray[3] = 't';
		karray[4] = 'g';
		karray[5] = 'v';
		karray[6] = 'c';
		karray[7] = 'x';
		karray[8] = 'z';
		karray[9] = 'm';
	}
	
	public static void main(String[] args)
	{
		//here n is 5 and k is 10
		kArray(5,10);
	}

	static void kArray(int n, int k)
	{
		if(n < 1)
			System.out.println(Arrays.toString(arr));
		else
		{
			for(int j = 0; j < k; j++)
			{
				arr[n-1] = karray[j];
				kArray(n-1, k);	
			}	
		}
	}
}
