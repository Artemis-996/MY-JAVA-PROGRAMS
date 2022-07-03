package programs;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		int num = sc.nextInt();
		
		int temp = num;
		int rev = 0;
		int lst;
		
		while (num>0)
		{
			lst = num % 10;
			rev = rev * 10 + lst;
			num = Math.floorDiv(num, 10);
		}
		if (rev==temp)
		{
			System.out.println(temp + " is a palindrome number");
		}
		else
		{
			System.out.println(temp + " is not palindrome number");
		}
		
		
	
	}

}
