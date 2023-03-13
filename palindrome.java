import java.util.Scanner;
class  Palindrome
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);

		System.out.println("Enter Number : ");
		int num = s.nextInt();
		int rev = 0;

		for (int a = num; a>0 ; a/=10 )
		{
			int rem = a%10;
			rev = (rev*10)+rem;
		}
		if (rev==num)
		{
			System.out.println("Enter number is palindrome");
		}
		else
		{
			System.out.println("Entered Number is not Palindrome");
		}
	}
}
