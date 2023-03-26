import java.util.Scanner;
class FibonacciSeriesRange 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Starting Number ");
		int start = s.nextInt();

		System.out.println("Enter Ending Number ");
		int end = s.nextInt();
		int n1 = 0;
		int n2 = 1;
		int n3;

		while (start<=end)
		{
				System.out.println(start+" start");
				while (true)
				{
					n3 = n1+n2;
					System.out.println(n1+" n1");
					if (n1==start)
					{
						System.out.println(n1);
						break;
					}
					else if (n1>start)
					{
					break;
					}
					n1=n2;
					n2=n3;
				}
			start++;
		}

	}
}
