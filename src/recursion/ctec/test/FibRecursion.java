package recursion.ctec.test;

public class FibRecursion
{
	private int fibonacci(int currentNumber)
	{
		int fibValue = 0;
		if(currentNumber >= 0)
		{
			if(currentNumber <=1)
			{
				return 1;
			}
			else
			{
				return fibonacci(currentNumber - 1) + fibonacci(currentNumber -2);
			}
		}
		return fibValue;
	}
	
	public void start()
	{
		for (int count =0; count < 10; count ++)
		{
			System.out.println(fibonacci(count));
		}
		System.out.println(fibonacci(5));
	}
}
