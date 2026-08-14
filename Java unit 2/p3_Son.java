class Father
{
	void house()
	{
		System.out.println("Father House");
	}
}

class p3_Son extends Father
{
	void bike()
	{
		System.out.println("Its my bike");
	}
	public static void main(String args[])
	{
	p3_Son ob = new p3_Son();
	ob.bike();
	ob.house();
	}
}