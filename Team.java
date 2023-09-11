
public class Team 
{
	public static void main(String[] args) 
	{
		int n=5;
		int k=5;
		int rem=0;
		if(n/2!=0 && k/2!=0)
		{
			rem=n%2;
			
		}
		else
		{
			rem+=n/2;
		}
		System.out.println(rem);
	}
}
