class IsArraySorted
{
	public static void main(String[] args){
		int[] array = {1,2,3,4,5,6,1};

		if(isArraySorted(array, array.length))
			System.out.println("Yes");
		else
			System.out.println("No");
			
	}

	/* here n is not size of */
	public static boolean isArraySorted(int[] arr, int n)
	{
		
		if(n == 1)
		{
			return true;
		}
		
		return (arr[n-1] < arr[n-2])? false:isArraySorted(arr, n-1);
	}
}
