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
		
		int din = 1;
		
		System.out.println("***EVEN SUM***");
		while (din<=num/2)
		{
			if (num%din==0)
			{
				if (din%2==0)
				{
				esum+=din;
				}
				else
				{
				osum+=din;
				}
			}
			din++;
		}
		System.out.println("The sum of even Factors is "+ esum);

		System.out.println("***ODD SUM***");
	
		System.out.println("The sum of odd Factors is "+ osum);
	}
}
