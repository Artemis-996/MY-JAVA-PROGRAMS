import java.util.Scanner;
class BuzzNumber 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number :");
		int num = s.nextInt();
		int temp = num;

		if (num%7==0)
		{
			System.out.println("Number is Buzz Number");
		}
		else if (7 == temp%10 )
		{
			System.out.println("Number is Buzz Number");
		}
		else
		{
			System.out.println("Number is not Buzz Number");
		}
	}
}
