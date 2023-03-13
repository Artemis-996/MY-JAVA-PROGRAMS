import java.util.Scanner;
class LeapYear 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);

		System.out.println("Enter Year");
		int year = s.nextInt();

		if ((year%4==0 && year%100!=0) || year%400 == 0)
		{
			System.out.println("Year is Leap Year");
		}
		else
		{
			System.out.println("Year is not a Leap Year");
		}
	}
}
