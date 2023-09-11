import java.util.Scanner;

public class PHValue 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		double ph=sc.nextDouble();
		if(ph>7)
		{
			System.out.println("Alkaline");
		}
		else if(ph<7)
		{
			System.out.println("Acidic");
		}
		else
		{
			System.out.println("Neutral");
		}
		sc.close();
	}
}
