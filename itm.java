class test<T>
{
	void compare(T x,T y)
	{
		if(x==y)
		{
			System.out.println("Similar");
		}
		else
		{
			System.out.println("Not similar");
		}

	}
	public static void main(String[] args)
	 {
		test <Integer> t1 =new test<>();
		t1.compare(10,20);
		
	}
}
