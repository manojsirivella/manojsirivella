package javaprograms;

public class Right_angle_in_Stars {

	public static void main(String[] args) 
	{
		int num=0;//1,2,3
		for(int i=0;i<=3;i++)
		{
			num=num+1;
			for(int j=1;j<=num;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
