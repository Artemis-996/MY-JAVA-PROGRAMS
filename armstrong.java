package programs;
import java.util.Scanner;

//armstrong 123 = 1*1*1+2*2*2+3*3*3

public class armstrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number : ");
		int number = sc.nextInt();
		int temp = number ;
		int sum = 0;
		
		
		int length = String.valueOf(number).length();     // for length of number
		
		while (number!=0)
		{
			int lst = number % 10; 
			sum += Math.pow(lst, length);
			number = Math.floorDiv(number,10);
		}
		
		System.out.println(sum);
		
		if (sum==temp)
		{
			System.out.println(temp + " is a armstrong number");
		}
		else
		{
			System.out.println(temp + " is not a armstrong number");
		}
	}

}
