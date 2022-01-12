package practise_Package;

public class Rough_class
{

	public static void main(String[] args) {
		String name="sabitha   ";
		int c=0;
		char C;
		System.out.println(name.length());
		for(int i=0;i<name.length();i++)
		{
			if(!Character.isSpace(name.charAt(i)))
					{
				      c++;
					}
					
			
		}
		System.out.println(c);

	

}
}
