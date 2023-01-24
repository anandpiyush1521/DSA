/* Dynamic Programming Java implementation of Maximum Sum Increasing Subsequence (MSIS)
problem */
class GFG
{
	/* maxSumIS() returns the maximum sum of increasing subsequence in arr[] of size n */
	static int maxSumIS(int arr[], int n)
	{
		int i, j, max = 0;
		int res[] = new int[n];

		/* Initialize msis values for all indexes */
		for (i = 0; i < n; i++)
			res[i] = arr[i];

		/* Compute maximum sum values in bottom up manner */
		for (i = 1; i < n; i++){
			for (j = 0; j < i; j++){
				if (arr[i] > arr[j] && res[i] < res[j] + arr[i]){
					res[i] = res[j] + arr[i];
                }
            }
        }

		/* Pick maximum of all msis values */
		for (i = 0; i < n; i++)
			if (max < res[i])
				max = res[i];

		return max;
	}

	// Driver code
	public static void main(String args[])
	{
		int arr[] = new int[]{1, 101, 2, 3, 100};
		int n = arr.length;
		System.out.println("Sum of maximum sum "+
							"increasing subsequence is "+
							maxSumIS(arr, n));
	}
}

// This code is contributed
// by Rajat Mishra
