import java.util.Scanner;
class SumOfEvenOddFactors 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int num = s.nextInt();

		int esum = 0;
		int osum = 0;
		
		int edin = 1;
		int odin = 1;
		
		System.out.println("***EVEN SUM***");
		while (edin<=num/2)
		{
			if (num%edin==0)
			{
				if (edin%2==0)
				{
				esum+=edin;
				
				}
			}
			edin++;
		}
		System.out.println("The sum of even Factors is "+ esum);

		System.out.println("***ODD SUM***");
		while (odin<=num/2)
		{
			if (num%odin==0)
			{
				if (odin%2!=0)
				{
				osum+=odin;
				}
			}
			odin++;
		}
		System.out.println("The sum of odd Factors is "+ osum);
	}
}
