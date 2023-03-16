import java.util.Scanner;
class SumOfFacttors  
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = s.nextInt();

		int den = 1;
		int sum = 0; 

		while (den<=num/2)
		{
			if (num%den==0)
			{
				sum = sum+den;
			}
			den++;
		}
		System.out.println("Sum of Factors is "+sum);

	}
}
