import java.util.Scanner; //prime
class Rough
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);

		System.out.println("Enter Number :");
		int num = s.nextInt();
		
		boolean flag = true;
		int i = 2;

		while (i<num)
		{
			if (num%i==0)
			{
				System.out.println(num + "is a non-prime number");
				flag = false;
				break;
			}
			i++;
		}

		if (flag==true)
		{
			System.out.println(num+" Is a Prime number");
		}
		
	}
}
