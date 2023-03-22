import java.util.Scanner;
class ArmstrongSeries 
{
	public static void main(String[] args) 
	{	Scanner s = new Scanner(System.in);
		System.out.println("Enter Starting Number : ");			//Enter start
		int start = s.nextInt();

		System.out.println("Enter Starting Number : ");         //Enter End
		int end = s.nextInt();	

		while (start<=end)
		{
			int sum = 0;                         // reinitializations for fresh number for sum,temp,num,count
			int temp = start;
			int num = start;
			int count = 0;

			while (temp>0)						// for length of number, length goes as power in armstrong
			{
				count++;
				temp = temp/10;
			}

			while (num>0)						
			{
				int rem = num%10;				//to take out digit 

				int pow = 1;
				for (int i=0;i<count ;i++ )
				{
					pow = pow * rem;			//to multiply with power i.e length
				}
				
				sum += pow;
				num = num/10;
			}

			if (sum==start)						//comparison of actual and sum
			{
				System.out.println(sum);
			}

			start++;
		}
	}
}
