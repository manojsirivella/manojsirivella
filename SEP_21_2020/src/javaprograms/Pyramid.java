package javaprograms;

public class Pyramid 
{
	/*void m1(int N)
	{
	  System.out.println(N);
	}
*/
	public static void main(String[] args) 
	{
		
		int i,j,k;
		int rows=10;
		int num=0;//2
		for(i=1;i<=rows;i++)
		{
			num=num+1;
			
			for(j=0;j<rows-num;j++)
			{
				System.out.print(" ");
				
			}
				for(k=1;k<=num;k++)
				{
					int NUM=num;
				//	System.out.print("*"+" ");
					System.out.print(NUM+" ");
				}
				//System.out.println();
				
			
			
			System.out.println();
		}

	}

}
