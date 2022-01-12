package java_conditions;

public class String_class {

	public static void main(String[] args) {
		String name="sabi   tha";
		int c=0;
		char C;
		System.out.println(name.length());
		for(int i=0;i<name.length();i++)
		{
			if(!Character.isSpace(name.charAt(i)))
					{
				      c++;
					}
			System.out.println(c);		
			
		}
		//System.out.println(c);

	}

}
