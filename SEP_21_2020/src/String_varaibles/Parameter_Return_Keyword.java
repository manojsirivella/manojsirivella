package String_varaibles;

public class Parameter_Return_Keyword {

	static String m1() {
		return "hi";
	}

	static String m2() // WITHOUT VIOD it shows error to metion s.o.p.ln bcz it has return keyword
	{
		String s = "hello";
		String x = "i m 5n";
		String y = "how r u";

		return s;
		// System.out.println(s);

	}

	static String m3(String c) {
		return c;

	}

	static void s1() // WITH VOID it mandatory to metion s.o.p.ln bcz it void keyword
	{
		String y = "hello";
		System.out.println("void has mandatary s.o.p.ln " + y);
	}

	public static void main(String[] args) {

		System.out.println(m1());
		System.out.println(m2());
		System.out.println(m3("hi"));

		s1();
	}

}
