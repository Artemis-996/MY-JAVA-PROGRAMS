import java.util.Scanner;
class CheckFibonacci
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner (System.in);
		System.out.println("Enter Number:");
		int num = s.nextInt();
		int n1 = 0;
		int n2 = 1;
		int n3;
		
		while (true)
		{
			n3 = n1+n2;
			if (n1==num)
			{
				System.out.println("No. is fibonacci number");
				break;
			}
			else if (n1>num)
			{
				System.out.println("No. is not fibonacci number");
				break;
			}
			n1=n2;
			n2=n3;
		}

	}
}
