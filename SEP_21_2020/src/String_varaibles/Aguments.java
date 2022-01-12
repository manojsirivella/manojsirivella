package String_varaibles;

public class Aguments {
	
	static void m1()
	{
		String name="sabitha";
		System.out.println(name);
	}
	
	void m2(String surname)//2 step
	{
		surname="sirivella";
		System.out.println(surname); //3 step
	}
	void m3(String s,int i)
	{
		System.out.println(s+"\t"+i);
		
	}
	
	
	
	

	public static void main(String[] args) 
	{
		//String name="sabitha";
		
		m1();
		new Aguments().m2("myna");//1 step
		new Aguments().m3("sabitha", 10);

	}

}
