package programs;
import java.util.Scanner;


public class reversenumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		int num = sc.nextInt();
		
		int temp;
		temp=num;
		int rev=0;
		int lst;
		
		if (num<10)
		{
			System.out.println(num);
		}
		else
		{
			while (num!=0)
			{
				lst = num%10;
				rev = rev * 10 + lst;
				num = Math.floorDiv(num,10);
			}
			System.out.println(rev);
		}

	}

}
