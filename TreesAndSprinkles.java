import java.util.Scanner;

public class TreesAndSprinkles 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int arr[]=new int[sc.nextInt()];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int brr[]=new int[sc.nextInt()];
		for(int i=0;i<brr.length;i++)
		{
			brr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					arr[j]=arr[j]+arr[j+1];
					arr[j+1]=arr[j]-arr[j+1];
					arr[j]=arr[j]-arr[j+1];
				}
			}
		}
		for(int i=0;i<brr.length-1;i++)
		{
			for(int j=0;j<brr.length-1-i;j++)
			{
				if(brr[j]>brr[j+1])
				{
					brr[j]=brr[j]+brr[j+1];
					brr[j+1]=brr[j]-brr[j+1];
					brr[j]=brr[j]-brr[j+1];
				}
			}
		}
		if((arr[arr.length-1]-brr[brr.length-1])<brr.length)
		{
			System.out.println((arr[arr.length-1]-brr[brr.length-1])+1);
		}
		else
		{
			System.out.println(arr[arr.length-1]-brr[brr.length-1]);
		}
		sc.close();
	}
}
