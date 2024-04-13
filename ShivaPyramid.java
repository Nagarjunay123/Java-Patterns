class ShivaPyramid
{
	public static void main(String[] args) 
	{
		int num=3,n=1;
		for (int i=1;i<=num ;i++ )
		{
			for (int j=i;j<num ;j++ )
			{
				System.out.print(" ");
			}
			for (int k=1;k<=2*i-1 ;k++ )
			{
				System.out.print(n++ + " ");

			}
			System.out.println();
		}
		for (int i=num;i>1 ;i-- )
		{
			for (int j=num;j>i ;j-- )
			{
				System.out.print("  ");
			}
			for (int k=2;k<2*i-1 ;k++ )
			{
				System.out.print(n++);

			}
			System.out.println();
		}
	}
}
