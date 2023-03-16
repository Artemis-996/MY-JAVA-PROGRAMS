import java.util.Scanner;
class PrimeLogic 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);

		System.out.println("Enter Number : ");
		int num = s.nextInt();
		int den = 2;
		boolean b = true;

		if (num == 1)
		{
			System.out.println("Number is a prime Number");
		}
		else
		{
			while (den<num/2)
			{
				if (num%den==0)
				{
					b = false;
					break;
				}
				den++;
			}

			if (b == true)
		{
			System.out.println("Number is a prime Number");
		}
		else
		{
			System.out.println("Number is not a prime Number");
			
		}
		}

	}
}
