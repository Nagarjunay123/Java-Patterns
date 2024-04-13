class RightSideArrow 
{
	public static void main(String[] args) 
	{
		int num=3;
		for (int i=1;i<=2*num ;i++ )
		{
			for (int j=1;j<=2*num ;j++)
			{
				if (i==num || (j>num && j-i<=num && i+j<=num*3))
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
