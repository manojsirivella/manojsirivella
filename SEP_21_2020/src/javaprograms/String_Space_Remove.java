package javaprograms;

public class String_Space_Remove {

	public static void main(String[] args) 
	{
		String s="manoj ";
		
		int c=0;
		char C;
		System.out.println("string total lenth is"+s.length());
		for(int i=2;i<=s.length();i++)
		{
			if(!Character.isSpace(s.charAt(i)))
			{
				c++;
			}
			System.out.println(i);
			
		}
		
		System.out.println("total length after removeval of spaces"+ c);

	}
}



