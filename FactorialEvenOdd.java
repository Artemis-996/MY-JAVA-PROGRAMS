import java.util.Scanner;
class FactorialEvenOdd //6 = 1,2,3
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = s.nextInt();

		System.out.println("***For Even Factorial***");
		int facte = 1;
		while (facte<=num/2)
		{
			if (num%facte==0)
			{
				if (facte%2 == 0)
				{
					System.out.println(facte);
				}
			}
			facte++;
		}

		System.out.println("***For Odd Factorial***");
		int facto = 1;
		while (facto<=num/2)
		{
			if (num%facto==0)
			{
				if (facto%2 != 0)
				{
					System.out.println(facto);
				}
			}
			facto++;
		}
	}
}