class Butterfly 
{
	public static void main(String[] args) 
	{
		int num=13;
		for (int i=1;i<=num;i++ )
		{
			for (int j=1;j<=num ;j++ )
			{
				if ((i>=j && i+j<=num+1) || (i+j>num && j>=i))
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