class LeftRightTriangle 
{
	public static void main(String[] args) 
	{
		int num=13;
		for (int i=1;i<=num;i++ )
		{
			for (int j=1;j<num;j++ )
			{
				if (i+j<=num+1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			for (int k=1;k<=num ;k++ )
			{
				if (k>=i)
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
