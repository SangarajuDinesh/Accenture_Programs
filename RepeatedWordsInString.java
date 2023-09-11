import java.util.Scanner;

public class RepeatedWordsInString 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String = ");
		String inputString=sc.nextLine();
		String s2=inputString.toLowerCase();
		System.out.println(s2);
		String arr[]=s2.split(" ");
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i].equals(arr[j]))
				{
					count=2*i;
				}
			}
		}
		System.out.println(count);
		sc.close();
	}
}
