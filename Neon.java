import java.util.Scanner;
class Neon 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int num = s.nextInt();

		int sqr = num*num;
		
		int temp = sqr;
		int sum = 0;

		while (temp>0)
		{
			int rem = temp%10;
			sum = sum+rem;
			temp/=10;
		}
		System.out.println(sqr);
		System.out.println(sum);

		if (sum==num)
		{
			System.out.println("Number is Neon Number");
		}
		else
		{
			System.out.println("Number is not a neon number");
		}
	}
}
