package String_varaibles;

public class string_comaprision_commands {

	public static void main(String[] args) {

		String name = "manoj kumar";
		String Surname = "sirivella";
		String age = "27";
		String empty = " ";
		String lc = "sailu";
		String Trim = "    sowji";

		// equals:equlas method compare to strings and return boolean value with case
		// sensitive

		if (name.equals("manoj kumar"))
			System.out.println("name match");

		boolean flag = age.equals("27");
		System.out.println(flag);

		if (Surname.equalsIgnoreCase("sirivella"))
			;
		System.out.println("Sirivella name match");

		boolean flag1 = Surname.equalsIgnoreCase("sirivella");
		System.out.println(flag1);

		int i = Surname.length();
		System.out.println("the lenth of surname is " + i);

		System.out.println("lenthth of surname is with return type is " + i);

		char c = age.charAt(0);
		System.out.println("char c with return type is" + c);

		System.out.println("character c with no return is " + c);

		String r = Surname.replace("2", "3");
		System.out.println("String r with return type is " + r);

		System.out.println("String r with no return type is " + Surname.replace("7", "8"));

		boolean e = empty.isEmpty();

		System.out.println("boolean with return type is " + empty.isEmpty());

		boolean s = Surname.startsWith("man");
		System.out.println("booelan s with return type is " + s);

		System.out.println("boolean with no return type is " + Surname.startsWith("man"));

		String sub = Surname.substring(0, 2);

		System.out.println("String sub  with return type is " + sub);

		System.out.println(Surname.substring(0, 4));

		boolean l = Surname.endsWith("mar");
		System.out.println("booelan e with return type is " + l);

		System.out.println("booelan l with no return type is " + Surname.endsWith("ar"));

		String L = lc.toLowerCase();
		System.out.println("String L with return type is " + L);

		System.out.println("String L with no return type is " + lc.toLowerCase());

		String U = lc.toUpperCase();
		System.out.println("String U with return type is " + U);

		System.out.println("String with no return is " + lc.toUpperCase());

		String t = Trim.trim();
		System.out.println("String t with return type is " + t);

		boolean C = Surname.contains("siri");
		System.out.println("boolean c with return type is " + C);

		System.out.println("booelan C with no return type is " + Surname.contains("sir"));

		String Con = Surname.concat("veera");
		System.out.println("String Con with return type is " + Con);

		System.out.println("string with no return type is " + Surname.concat(" " + "veera"));

	}

}
