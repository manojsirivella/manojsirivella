package variable_package;

public class class1 {

	public static void main(String[] args) {
	
		String name="manoj";
		int c=0;
		int sum=0;
		if(true)
		{
			name="sailaja sirivella";
		}
		System.out.println("name lenth"+name.length());
		
		if(true)
		{
			String sister="sowji";
		}
		/*System.out.println(sister); error occured due to since the variable sister are declared
		                           --outside the conditions in outside the conditons the sister variable 
		                           are not there therefore thats yy it shows error*/
		
       for(int i=0;i<name.length();i++)
       {
    	  if(!Character.isSpace (name.charAt(i)))
    	  {
    		  c++;
    	  }
    	 // System.out.println(c); output is 1,2,3...19;
    	  
       }
       System.out.println("character count is"+c); //output is 19
	
	
	for(int i=1;i<10;i++)
	{
		sum =sum+i;
		sum++;
	}
	
	System.out.println("total value of sum is"+sum);

}
}
