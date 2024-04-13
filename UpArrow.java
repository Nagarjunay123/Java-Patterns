class UpArrow 
{
	public static void main(String[] args) 
	{
		int num=3;
		for (int i=1;i<=2*num ;i++ )
		{
			for (int j=1;j<=2*num ;j++)
			{
				if (j==num || (i<=num && i+j>num && j-i<num))//if (j==num || (j>=num && j-i<=num-1 && i<=num) || (i<=num && j<=num && i+j>=num+1))
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
