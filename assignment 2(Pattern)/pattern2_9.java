class pattern2_9{
	public static void main(String args[])
		{
			for(int i=1;i<=5;i++)
			{
				for(int m=i;m<=4;m++)
				{
					System.out.print(" ");
				}
				for(int k=1;k<=i;k++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
				
				for(int i=1;i<=4;i++)
				{
					for(int j=1;j<=i;j++)
					{
						System.out.print(" ");
					}
					for(int k=4;k>=i;k--)
					{
					System.out.print("*");
					}				
					System.out.println();
				}
				}
			}