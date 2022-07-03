package programs;
import java.util.Scanner;

public class oddeven {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number : ");
		int num = sc.nextInt();
		
		if (num==1)
		{
			System.out.println(num + " is a prime number");
		}
		else
		{
			if (num>1)
			{
				for (int i=2;i<num;i++)
				{
					if (num%i==0)
					{
						System.out.println("number is even");
						break;
					}
					else
					{
						System.out.println("number is odd");
						break;
					}
				}
			}
								
		}

	}

}
