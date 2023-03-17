class pyramid{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print(" ");
				}
			for(int k=i;k<=i;k++)
			{
				System.out.print("*");
				}
			for(int m=1;m<i;m++)
			{
				System.out.print("*");
				}
				System.out.println();
		}
	}
}