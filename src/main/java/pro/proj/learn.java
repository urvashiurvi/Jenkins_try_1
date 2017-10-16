package pro.proj;

public class learn {
	public String concate(String one ,String two)

	{
		return one + two;
	}
	public int multiply (int a,int b)
	{
		return a*b;
	}

public int divide(int a,int b)
{
	if(b==0)
{
	throw new ArithmeticException();
}
	return a/b;
}
}
