import java.util.Scanner;
class Power 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Base");
		int base = s.nextInt();

		System.out.println("Enter Power");
		int pow = s.nextInt();

		int ans = 1;

		while (pow>0)
		{
			ans = ans*base;
			pow--;
		}
		System.out.println(ans);

	}
}
