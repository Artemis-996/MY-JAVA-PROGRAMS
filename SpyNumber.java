import java.util.Scanner;
class SpyNumber 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = s.nextInt();

		int temp = num;

		int sum =  0;
		int pro = 1;

		while (temp>0)
		{
			int rem = temp%10;
			sum = sum + rem;
			pro = pro * rem;
			temp/=10;
		}
		if (sum==pro)
		{
			System.out.println("Number is a buzz number");
		}
		else
		{
			System.out.println("Number is not buzz number");
		}
	}
}
