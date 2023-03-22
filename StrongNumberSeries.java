import java.util.Scanner;
class StrongNumberSeries 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);

		System.out.println("Enter starting Number");
		int start = s.nextInt();

		System.out.println("Enter ending Number");
		int end = s.nextInt();

		while (start<=end)
		{
			int temp = start;
			int sum = 0;

			while (temp>0)
			{
				int rem = temp%10;

				int prod = 1;
				for (int i=rem;i>0 ;i-- )
				{
					prod *= i;
				}

				sum+=prod;
				temp/=10;
			}

			if (sum==start)
			{
				System.out.println(sum);
			}

		 start++;
		}

	}
}
