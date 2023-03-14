import java.util.Scanner;
class EvenOddCount 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Number : ");
		int num = s.nextInt();
		int ocount = 0;
		int ecount = 0;
		
		while (num>0)
		{
			int rem = num%10;
			if (rem%2==0)
			{
				ecount++;
			}

			if (rem%2!=0)
			{
				ocount++;
			}
			num/=10;
		}
		System.out.println("Total even digits in number is : "+ ecount);
		System.out.println("Total odd digits in number is : "+ ocount);

	}
}
