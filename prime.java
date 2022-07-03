package programs;
import java.util.Scanner;


public class prime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Any Number :  ");
		int num = sc.nextInt();
		
		if (num<=1)
		{
			System.out.println(num + " is not a prime number");
		}
		else
		{
			for (int i=2;i<num;i++)
			{
				if (num%i == 0)
				{
					System.out.println(num + " is not a prime number");
					break;
				}
				else 
				{
					System.out.println(num + " is a prime number");
					break;
				}
			}
		}
	

	}

}
