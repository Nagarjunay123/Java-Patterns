class InsideDiamond
{
	public static void main(String[] args) 
	{
		int num=5;
		for (int i=1;i<=num ;i++ )
		{
			for (int j=1;j<2*num;j++ )
			{
				if (i+j<=num+1 || j-i>=num-1)
				{
					System.out.print("* ");
				}
				else 
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		for (int i=1;i<=num ;i++ )
		{
			for (int k=1;k<2*num;k++ )
			{
				if (i>=k || i+k>=2*num)
				{
					System.out.print("* ");
				}
				else 
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
