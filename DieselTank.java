import java.util.Scanner;

public class DieselTank 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int no_of_Diesel_Tanks=sc.nextInt();
		int[] arr1=new int[no_of_Diesel_Tanks-1];
		int[] arr2=new int[no_of_Diesel_Tanks-1];
		int[] arr3=new int[no_of_Diesel_Tanks-1];
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=sc.nextInt();
		}
		for(int i=0;i<arr2.length;i++)
		{
			arr2[i]=sc.nextInt();
		}
		for(int i=0;i<arr3.length;i++)
		{
			arr3[i]=sc.nextInt();
		}
		int res1=0;
		int res2=0;
		int res3=0;
		for(int i=0;i<arr1.length-1;i++)
		{
			res1=arr1[i]-arr1[i+1];
		}
		for(int i=0;i<arr2.length-1;i++)
		{
			res2=arr2[i]-arr2[i+1];
		}
		for(int i=0;i<arr3.length-1;i++)
		{
			res3=arr3[i]-arr3[i+1];
		}
		System.out.println(res1+res2+res3);
		sc.close();
	}
}
