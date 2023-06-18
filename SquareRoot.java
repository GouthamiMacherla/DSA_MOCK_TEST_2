
/*
 * 
 * Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well. You must not use any built-in exponent function or operator. 

 Example 1:
Input: x = 4 Output: 2 Explanation: The square root of 4 is 2, so we return 2.
Example 2:

Input: x = 8 Output: 2 Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.
Constraints:

0 <= x <= 231 - 1
 * 
 * 
 * 
 * 
 * gouthami.504@gmail.com
 * 
 * 
 * 
 * 
 */


package in.ineuron.ai;

public class SquareRoot {

	public static int mySqrt(int x)
	{
		if(x == 0 || x ==1)
		{
			return x;
		}
	 
	int left = 0;
	int right = x;
	
	while(left <= right)
	{
		int mid = left + (right - left)/2;
		long midSquare = (long) mid * mid;
		
		if(midSquare > x)
		{
			right = mid - 1;
		}else if (midSquare < x)
		{
		     left = mid + 1;	
		}else {
			return mid;
		}
	
	}
	return right;
	
}
	public static void main(String[] args) {
		
		int x1 = 4;
		int x2 = 8;
		
		int sqrt1 = mySqrt(x1);
		int sqrt2 = mySqrt(x2);
		
		System.out.println("Square root of " + x1 + " is "  +sqrt1 );
		System.out.println("Square root of " + x2 + " is "  +sqrt2 );

	}

}
