import java.util.Scanner;

public class LexicologicalConcatination 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String s1=sc.nextLine();//orange
		String s2=sc.nextLine();//apple
		if(s1.compareTo(s2)<0)
		{
			System.out.println(s1+s2);
		}
		else if(s1.compareTo(s2)>0)
		{
			System.out.println(s2+s1);
		}
		else
		{
			System.out.println("0");
		}
		sc.close();
	}
}
