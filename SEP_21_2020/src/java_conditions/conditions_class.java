package java_conditions;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

public class conditions_class {

	public static void main(String[] args) {
		String name="manoj";
		String surname="sirivella";
		
		String mother="varalakshmi";
		
		
		
		if(name.equals("manoj"))
			System.out.println("name match");
		else
			System.out.println("name not match");
		
		
		
		if(surname.equals("invaalid"))
			System.out.println("surname is not match");
		else if(surname.equals("sirivella"))
			System.out.println("surname is match");
		
		
		switch (mother) {
			case "varalakshmi":
				System.out.println("mother name is matched");
				break;
			case "lakshmi" :
				System.out.println("mother name is not matched");
				break;
			default:
				System.out.println("default is matched");
				break;
				
		}
		
		
		
		
		
		
		
		
		int  age=27;
		String x="boom";
		boolean flag=false;
		if(age>28)
		{
			flag=true;
			System.out.println("age boolean condition is "+flag);
			
		}
		
		//System.out.println(flag);
		
		
		Integer i=Integer.valueOf(age);
		
	int	I=i.intValue();
	
	String s=String.valueOf(x);
	System.out.println("s is "+s);
	
	System.out.println("coverting non primitive to primitive type");
	
	boolean	b=i.equals(age);
	
	System.out.println(b);
	
	Integer dbl=new Integer(age);
	System.out.println("auto boxing to unboxing"+dbl.doubleValue());

	
	
	
	}

}
