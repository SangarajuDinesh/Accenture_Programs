import java.util.Scanner;

public class RBGColourInversion 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int arr[]=new int[3];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		RBGColourInversionDemo rbg=new RBGColourInversionDemo();
		int res[]=rbg.rbgColourInversion(arr);
		for(int i=0;i<res.length;i++)
		{
			System.out.print(res[i]+" ");
		}
		sc.close();
	}
}
