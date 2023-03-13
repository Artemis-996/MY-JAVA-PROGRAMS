import java.util.Scanner;
class EvenOddLeapYear 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);

		System.out.println("Enter Starting Year");
		int start = s.nextInt();

		System.out.println("Enter ending Year");
		int end = s.nextInt();

		int counte = 0;
		int counto = 0;
		
		System.out.println("***EVEN LEAP YEAR***");
		for (int a = start;a<=end ; a++)
		{
			if ((a % 4 == 0 && a%100 !=0)  || a%400==0)
			{
				if ( a%2 ==0 )
				{
					System.out.println(a);
					counte++; 
				}
			}
		}
		System.out.println("Total Even Leap Year's = "+counte);

		System.out.println("***ODD LEAP YEAR***");
		for (int a = start;a<=end ; a++ )
		{
			if ((a % 4 == 0 && a%100 !=0)  || a%400==0)
			{
				if ( a%2 !=0 )
				{
					System.out.println(a);
					counto++;
				}
			}
		}
		System.out.println("Total Odd Leap Year's = "+counto);

	}
}
