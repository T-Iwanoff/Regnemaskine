public class Regnemaskine
{
	public static void main(String[] args)
	{
		double a, b;
		String method, again;
		boolean repeat = true;
		while (repeat)
		{
			System.out.println("Do you want to add, subtract, multiply or divide?");
			java.util.Scanner brugerinput1 = new java.util.Scanner(System.in);
			method = brugerinput1.next();
			System.out.println("First number:");
			java.util.Scanner brugerinput2 = new java.util.Scanner(System.in);
			a = brugerinput2.nextInt();
			System.out.println("Second number:");
			java.util.Scanner brugerinput3 = new java.util.Scanner(System.in);
			b = brugerinput3.nextInt();
			if (method.equals("add"))
			{
				System.out.println(a + b);
			}
			if (method.equals("subtract"))
			{
				System.out.println(a - b);
			}
			if (method.equals("multiply"))
			{
				System.out.println(a * b);
			}
			if (method.equals("divide"))
			{
				System.out.println(a / b);
			}
			System.out.println("Try again?");
			java.util.Scanner brugerinput4 = new java.util.Scanner(System.in);
			again = brugerinput4.next();
			if (again.equals("yes"))
			{
			}
			else
			{
				repeat = false;
				System.out.println("Goodbye.");
			}
		}
	}

	public static void hej()
	{
		System.out.println("hej2");
	}
}
