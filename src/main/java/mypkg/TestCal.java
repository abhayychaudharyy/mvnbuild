package mypkg;

public class TestCal {
	public int sum(int a, int b)
	{
		return(a+b);
	}
	public int diff(int a,int b)
	{
		return(a-b);
	}
	public static void main(String[] args)
	{
		TestCal a= new TestCal();
		System.out.println("Sum:"+a.sum(10,3));
		System.out.println("Diff:"+a.diff(10,3));
	}

}
