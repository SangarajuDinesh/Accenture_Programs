import java.util.Scanner;

public class PatternProgram1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=num*2-1;j++)
			{
				if(i==j || i+j==10)
				{
					System.out.print(i);
				}
				else
				{                                   
					System.out.print(" ");
				}
			}
			System.out.println();
		}int num1=num;
		for(int i=2;i<=num;i++)
		{
			int num2=num1;
			for(int j=1;j<=num*2-1;j++)
			{
				if(i+j==6 || j-i==4)
				{
					System.out.print(num2-1);
				}else
				{
					System.out.print(" ");
				}
			}
			num1--;
			System.out.println();
		}
	}
}
