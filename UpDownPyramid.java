class UpDownPyramid 
{
	public static void main(String[] args) 
	{
		int num=3;
		for (int i=1;i<2*num ;i++ )
		{
			for (int j=1;j<2*num ;j++ )
			{
				if ((j>=i && i+j<=2*num) || (i>=j && i+j>=2*num))
				{
					System.out.print("* ");
				}
				else
				{ 
					System.out.print("  ");
				}
			}
			System.out.println();
		}/*
		for (int i=1;i<=num ;i++ )
		{
			for (int j=1;j<=num ;j++ )
			{
				if (i+j<=num)
				{
					System.out.print("* ");
				}
				else
				{ 
					System.out.print("  ");
				}
			}
			System.out.println();
		}*/
			
		}
	}

