package recursion.ctec.test;

public class FactRecursion
{
	private double factorial(int currentFactor)
	{
		double factValue = 0;
		
		if(currentFactor == 0)
		{
			if (currentFactor <= 1)
				return 1;
			}
			else
			{
				return currentFactor * factorial(currentFactor - 1);
			}
		
		return factValue;
	}
	
	public void start()
	{
		for(int count = 0; count < 180; count++)
		{
			System.out.println(factorial(count));
		}
		System.out.println(factorial(5));
	}
}
