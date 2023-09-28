import java.util.*;
// Java program to find GCD of two or
// more numbers

public class GCD {
	// Function to return gcd of a and b
	static int gcd(int a, int b)
	{
		if (a == 0)
			return b;
		return gcd(b % a, a);
	}

	// Function to find gcd of array of
	// numbers
	static int find(int arr[], int n)
	{
		int result = arr[0];
		for (int element: arr){
			result = gcd(result, element);

			if(result == 1)
			{
			return 1;
			}
		}

		return result;
	}

	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
        System.out.println("size");
        int n=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
		System.out.println(find(a, n));
	}
}

// This code is contributed by Saket Kumar
