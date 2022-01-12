package String_Programs;

public class First_Non_RepeatedCharacter {

	public static void main(String[] args) 
	{
		
     String input="AABCDBECF";
     int i;
     int j;
     for( i=0;i<input.length();i++);
     {
    	 boolean uniq=true;
    	 
		for( j=0;j<input.length();j++)
    	 {
    		 if(i !=j && input.charAt(i)==input.charAt(j))
    		 {
    			 uniq=false;
    		 }
    	 }
    	 if(uniq)
    	 {
    		 System.out.println(input.charAt(i));
    		 
    	 }
     }
	}

}
