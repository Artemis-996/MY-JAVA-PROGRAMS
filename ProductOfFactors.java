import java.util.Scanner;
class ProductOfFactors  
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = s.nextInt();

		int pro = 1;
		int den = 1;

		while (den<=num/2)
		{
			if (num%den==0)
			{
				pro = pro*den;
			}
			den++;
		}
		System.out.println("Sum of Factors is "+pro);

	}
}
