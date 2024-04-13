class Diagnol 
{
	public static void main(String[] args) 
	{
		int num=13;
		for (int i=1;i<=num;i++ )
		{
			for (int j=1;j<=num ;j++ )
			{
				if ((j>=i && i+j<=num+1)||(i+j>num && i>=j))
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
