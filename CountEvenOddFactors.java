import java.util.Scanner;     //Count Of Even & Odd Factors, Also which count is bigger?
class CountEvenOddFactors 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);

		System.out.println("Enter Number : ");
		int num = s.nextInt();
		int eden = 1;
		int oden = 1;

		int ecount = 0;
		int ocount = 0;

		while (eden<=num/2)
		{
			if (num%eden==0)
			{
				if (eden%2==0)
				{	
					System.out.println(eden);
					ecount++;
				}
			}
			eden++;
		}
		System.out.println("The Count of even factors is "+ ecount);


		while (oden<=num/2)
		{
			if (num%oden==0)
			{
				if (oden%2!=0)
				{	
					System.out.println(oden);
					ocount++;
				}
			}
			oden++;
		}
		System.out.println("The Count of odd factors is "+ ocount);

	
	}
}
