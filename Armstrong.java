import java.util.Scanner;
class Armstrong 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number :");
		int num = s.nextInt();
		int temp = num;
		int sum = 0;
		int length = 0;
		int act = num;

		while (temp>0)
		{
			length++;
			temp/=10;
		}

	
		while (num>0)
		{
			int rem = num%10;
			int pow = 1;
			for (int i=0;i<length ;i++ )
			{
				pow = pow*rem;
			}
			
		sum = sum+pow;
		num/=10;
		}

		if (act==sum)
		{
			System.out.println("Number is Armstrong Number");
		}
		else
		{
			System.out.println("Number is not Armstrong Number");
		}

	}
}
