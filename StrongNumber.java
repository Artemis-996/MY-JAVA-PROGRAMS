import java.util.Scanner;
class StrongNumber 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = s.nextInt();
		int temp = num;
		int sum = 0;

		while (temp>0)
		{
			int rem = temp%10;
			int prod = 1;
			for (int i=rem;i>0 ;i--)
			{
				prod *= i;
			}
			sum += prod;
			temp/=10;
		}
		if (sum==num)
		{
			System.out.println("Entered Number is Strong Number");
		}
		else
		{
			System.out.println("Entered Number is not Strong Number");
		}
		
	}
}
