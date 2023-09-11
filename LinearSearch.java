import java.util.Scanner;

public class LinearSearch 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int key=sc.nextInt();
		LinearSearchDemo l1=new LinearSearchDemo();
		boolean res=l1.linearSearch(arr,key);
		if(res==true)
		{
			System.out.println("key "+key+" is found");
		}
		else
		{
			System.out.println("Key "+key+" is not found");
		}
		sc.close();
	}
}
