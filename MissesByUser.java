import java.util.Scanner;

public class MissesByUser 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String inputString=sc.nextLine();
		String arr[]=inputString.split(" ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(missesByUser(arr[i]));
		}
		sc.close();
	}

	public static int missesByUser(String s) 
	{
		char cr[]=s.toCharArray();
		int count=0;
		char[] cr1={'!','@','#','$','%','^','&','*','(',')','?','~'};
		for(int i=0;i<cr.length;i++)
		{
			for(int j=0;j<cr1.length;j++)
			{
				if(cr[i]==cr1[j])
				{
					count++;
				}
			}
		}
		return count;
	}
}
