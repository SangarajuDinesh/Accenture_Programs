import java.util.Scanner;

public class AverageOfNumbersDivisibleBy3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int arr[]=new int[sc.nextInt()];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int sum=0;
		int count=0;
		double avg=0.0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%3==0)
			{
				sum+=arr[i];
				count++;
			}
		}
		avg=(double)(sum/count);
		System.out.print(avg);
		sc.close();
	}
}
