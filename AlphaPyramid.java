class AlphaPyramid 
{
	public static void main(String[] args) 
	{
		int num=3; int a=1;
		for (int i=1;i<2*num ;i++ )
		{
			for (int j=1;j<=num ;j++ )
			{
				if ((i<=num && i+j>num && j-i<num))
				{
					System.out.print(a++ +" ");
				}
				else 
				{
					System.out.print("  ");
				}
			}
			for (int j=1;j<num ;j++ )
			{
				if (i>j && i-j<num)
				{
					System.out.print(a++ +" ");
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
